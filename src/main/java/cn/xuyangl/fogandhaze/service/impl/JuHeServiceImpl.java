package cn.xuyangl.fogandhaze.service.impl;

import cn.xuyangl.Model.ResponseMsg;
import cn.xuyangl.fogandhaze.service.JuHeService;
import cn.xuyangl.fogandhaze.utils.URLUtil;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/9/8 22:41
 */
@Service
public class JuHeServiceImpl implements JuHeService {


    //申请的key
    public static final String KEY = "7855dc98293af090c0bd432ebde99294";


    /**
     * 获取空气质量
     * @return
     */
    @Override
    public JSONObject getUrbanAirQuality(String city) {
        String url = "http://web.juhe.cn:8080/environment/air/cityair";    //请求接口url
        JSONObject jsonObject = null;
//        ResponseMsg responseMsg = new ResponseMsg();    //返回数据
        //包装请求参数
        Map<String,String> params = new HashMap<>();
        params.put("city",city);    //城市的中文名称或拼音
        params.put("key",KEY);
        String result = null;
        try{
            result = URLUtil.net(url,params,"GET");
            jsonObject = JSONObject.fromObject(result);
//            responseMsg.setResultCode((String) jsonObject.get("resultcode"));
//            responseMsg.setErrorCode(jsonObject.getString("error_code"));
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return jsonObject;
    }
}
