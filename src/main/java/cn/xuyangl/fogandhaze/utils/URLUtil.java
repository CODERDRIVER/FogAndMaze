package cn.xuyangl.fogandhaze.utils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 用来进行http请求相应接口数据的工具类
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/9/8 22:52
 */
public class URLUtil {

    public static final String CHARACTER_SET = "UTF-8";  //编码
    public static final int CONN_TIMEOUT = 3000;
    public static  final int READ_TIMEOUT = 3000;
    public static String userAgent = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";
    /**
     * 根据请求url和参数调用api，返回请求的数据
     * @param url
     * @param params
     * @param method
     * @return
     */
    public static String net(String url, Map<String,String> params, String method)
    {
        HttpURLConnection httpURLConnection = null;
        BufferedReader bufferedReader = null;
        StringBuilder stringBuilder = new StringBuilder();  //用来存储得到的数据
        try{
            //拿到请求url
            if (method!=null&&method.equals("GET"))
            {
                url = urlEncode(url,params);
            }

            //根据url，构造URL对象
            URL requestUrl = new URL(url);
            //获得连接
            httpURLConnection = (HttpURLConnection) requestUrl.openConnection();
            //请求设置
            if (method!=null&&method.equals("GET"))
            {
                httpURLConnection.setRequestMethod("GET");
            }else{
                httpURLConnection.setRequestMethod("POST");
            }
            httpURLConnection.setDoOutput(true);
            //设置代理
            httpURLConnection.setRequestProperty("User-agent",userAgent);
            httpURLConnection.setUseCaches(false);
            //超时设置
            httpURLConnection.setReadTimeout(READ_TIMEOUT);
            httpURLConnection.setChunkedStreamingMode(CONN_TIMEOUT);
            //连接
            httpURLConnection.connect();

            if (params!=null&&method=="POST")
            {
                try{
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.writeBytes(urlEncode(url,params));
                }catch (Exception e)
                {
                    //handle exception
                }
            }
            //处理请求的数据
            //将输入流进行包装
            bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(),CHARACTER_SET));
            String temp = null;
            while ((temp=bufferedReader.readLine())!=null)
            {
                stringBuilder.append(temp);
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }finally {
            try {
                //关闭流
                if (bufferedReader!=null)
                {
                    bufferedReader.close();
                }
                if (httpURLConnection!=null)
                {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return stringBuilder.toString();
    }

    /**
     * 将map的请求参数添加到url中
     * @param params
     * @return
     */
    public static String urlEncode(String url,Map<String,String> params)
    {
        StringBuilder stringBuilder = new StringBuilder(url+"?");
        int index = 0;   //用来判断是否需要添加 "&"
        for (Map.Entry<String,String> entry:params.entrySet())
        {
            index++;
            try{
                stringBuilder.append(entry.getKey()+"="+ URLEncoder.encode(entry.getValue(),"UTF-8"));
                if (index!=params.size()){
                    stringBuilder.append("&");
                }
            }catch (UnsupportedEncodingException e)
            {
                e.printStackTrace();
            }

        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("key","hello");
        map.put("value","world");
        String s = urlEncode("http://www.baidu.com", map);
        System.out.println(s);
    }
}
