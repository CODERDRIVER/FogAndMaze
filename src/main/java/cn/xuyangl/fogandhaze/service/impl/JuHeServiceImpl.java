package cn.xuyangl.fogandhaze.service.impl;

import cn.xuyangl.Model.ResponseMsg;
import cn.xuyangl.fogandhaze.service.JuHeService;
import cn.xuyangl.fogandhaze.utils.URLUtil;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
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
//    public static final String QUALITY_KEY = "7855dc98293af090c0bd432ebde99294";
    public static final String QUALITY_KEY = "37d7a7fe8149abbfe3ce6ae31c1925c6";

    //天气情况质量
    public static final String WEATHER_KEY = "a9b9234b8989dec225425d5964425f08";

    //天气预报
    public static final String WEATHER_FOREST = "19b73e5deff2c52c13be90450c5cddbe";

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
        params.put("key",QUALITY_KEY);
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


    /**
     * http://v.juhe.cn/historyWeather/weather?key=&city_id=1157&weather_date=2017-07-15
     * @param cityId
     * @param weatherDate
     * @return
     */
    @Override
    public JSONObject getWeather(String cityId, String weatherDate) {
        String url = "http://v.juhe.cn/historyWeather/weather";
        Map<String,String> params = new HashMap<>();
        params.put("key",WEATHER_KEY);
        params.put("city_id",cityId);
        params.put("weather_date",weatherDate);
        String result = null;
        JSONObject jsonObject = null;
        try{
            result = URLUtil.net(url,params,"GET");
            jsonObject = JSONObject.fromObject(result);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return jsonObject;
    }

    /**
     * 根据城市名称查询城市cityId
     * http://v.juhe.cn/historyWeather/province
     * @param provinceName
     * @return
     */
    @Override
    public String getProvinceIdByProvinceName(String provinceName) {
        String url = "http://v.juhe.cn/historyWeather/province";
        Map<String,String> params = new HashMap<String,String>();
        params.put("key",WEATHER_KEY);
        String result = null;
        JSONObject jsonObject = null;
        try{
            result = URLUtil.net(url,params,"GET");
            jsonObject = JSONObject.fromObject(result);
            String reason = jsonObject.getString("reason");
            if (reason.equals("查询成功")){
                JSONArray result1 = jsonObject.getJSONArray("result");
                for (int i=0;i<result1.size();i++)
                {
                    String item = result1.getString(i);
//                    {"id":"1","province":"安徽"}
//                    去除左右大括号
                    item = item.substring(1,item.length()-1);
//                    去除引号
                    item = item.replaceAll("\"","");
                    String[] split = item.split(",");
                    String id = split[0].split(":")[1];
                    String province = split[1].split(":")[1];
                    if (province!=null&&province.equals(provinceName))
                    {
                        return id;
                    }
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * http://v.juhe.cn/historyWeather/citys?key=&province_id=16
     * @param provinceId
     * @param cityName
     * @return
     */
    @Override
    public String getCityIdByProvinceIdAndCityName(String provinceId, String cityName) {
        String url = "http://v.juhe.cn/historyWeather/citys";
        Map<String,String> params = new HashMap<>();
        params.put("key",WEATHER_KEY);
        params.put("province_id",provinceId);
        String result = null;
        JSONObject jsonObject = null;
        try{
            result = URLUtil.net(url,params,"GET");
            jsonObject = JSONObject.fromObject(result);
            String reason = jsonObject.getString("reason");
            if (reason.equals("查询成功")){
                String res = jsonObject.getString("result");
                res = res.substring(1,res.length()-1);
//             {"id":"1","province_id":"1","city_name":"安庆"},{"id":"2","province_id":"1","city_name":"蚌埠"},{"id":"3","province_id":"1","city_name":"亳州"},{"id":"4","province_id":"1","city_name":"长丰"},{"id":"5","province_id":"1","city_name":"巢湖"},{"id":"6","province_id":"1","city_name":"池州"},{"id":"7","province_id":"1","city_name":"滁州"},{"id":"8","province_id":"1","city_name":"枞阳"},{"id":"9","province_id":"1","city_name":"当涂"},{"id":"10","province_id":"1","city_name":"砀山"},{"id":"11","province_id":"1","city_name":"定远"},{"id":"12","province_id":"1","city_name":"东至"},{"id":"13","province_id":"1","city_name":"繁昌"},{"id":"14","province_id":"1","city_name":"肥东"},{"id":"15","province_id":"1","city_name":"肥西"},{"id":"16","province_id":"1","city_name":"凤台"},{"id":"17","province_id":"1","city_name":"凤阳"},{"id":"18","province_id":"1","city_name":"阜南"},{"id":"19","province_id":"1","city_name":"阜阳"},{"id":"20","province_id":"1","city_name":"固镇"},{"id":"21","province_id":"1","city_name":"广德"},{"id":"22","province_id":"1","city_name":"贵池"},{"id":"23","province_id":"1","city_name":"含山"},{"id":"24","province_id":"1","city_name":"合肥"},{"id":"25","province_id":"1","city_name":"和县"},{"id":"26","province_id":"1","city_name":"怀宁"},{"id":"27","province_id":"1","city_name":"怀远"},{"id":"28","province_id":"1","city_name":"淮北"},{"id":"29","province_id":"1","city_name":"淮南"},{"id":"30","province_id":"1","city_name":"黄山"},{"id":"32","province_id":"1","city_name":"霍邱"},{"id":"33","province_id":"1","city_name":"霍山"},{"id":"34","province_id":"1","city_name":"绩溪"},{"id":"35","province_id":"1","city_name":"界首"},{"id":"36","province_id":"1","city_name":"金寨"},{"id":"37","province_id":"1","city_name":"泾县"},{"id":"38","province_id":"1","city_name":"旌德"},{"id":"39","province_id":"1","city_name":"九华山"},{"id":"40","province_id":"1","city_name":"来安"},{"id":"41","province_id":"1","city_name":"郎溪"},{"id":"42","province_id":"1","city_name":"利辛"},{"id":"43","province_id":"1","city_name":"临泉"},{"id":"44","province_id":"1","city_name":"灵璧"},{"id":"45","province_id":"1","city_name":"六安"},{"id":"46","province_id":"1","city_name":"庐江"},{"id":"47","province_id":"1","city_name":"马鞍山"},{"id":"48","province_id":"1","city_name":"蒙城"},{"id":"49","province_id":"1","city_name":"明光"},{"id":"50","province_id":"1","city_name":"南陵"},{"id":"51","province_id":"1","city_name":"宁国"},{"id":"52","province_id":"1","city_name":"祁门"},{"id":"53","province_id":"1","city_name":"潜山"},{"id":"54","province_id":"1","city_name":"青阳"},{"id":"55","province_id":"1","city_name":"全椒"},{"id":"56","province_id":"1","city_name":"石台"},{"id":"57","province_id":"1","city_name":"寿县"},{"id":"58","province_id":"1","city_name":"舒城"},{"id":"59","province_id":"1","city_name":"泗县"},{"id":"60","province_id":"1","city_name":"宿松"},{"id":"61","province_id":"1","city_name":"宿州"},{"id":"62","province_id":"1","city_name":"濉溪"},{"id":"63","province_id":"1","city_name":"太和"},{"id":"64","province_id":"1","city_name":"太湖"},{"id":"65","province_id":"1","city_name":"天长"},{"id":"66","province_id":"1","city_name":"桐城"},{"id":"67","province_id":"1","city_name":"铜陵"},{"id":"68","province_id":"1","city_name":"屯溪"},{"id":"69","province_id":"1","city_name":"望江"},{"id":"70","province_id":"1","city_name":"涡阳"},{"id":"71","province_id":"1","city_name":"无为"},{"id":"72","province_id":"1","city_name":"芜湖"},{"id":"73","province_id":"1","city_name":"芜湖县"},{"id":"74","province_id":"1","city_name":"五河"},{"id":"75","province_id":"1","city_name":"歙县"},{"id":"76","province_id":"1","city_name":"萧县"},{"id":"77","province_id":"1","city_name":"休宁"},{"id":"78","province_id":"1","city_name":"宣城"},{"id":"79","province_id":"1","city_name":"黟县"},{"id":"80","province_id":"1","city_name":"颍上"},{"id":"81","province_id":"1","city_name":"岳西"}
                res = res.replaceAll("[{}]","");
                res = res.replaceAll("\"","");
                String[] result1 = res.split(",");
                for (int i=0;i<result1.length;i+=3)
                {
                    String id = result1[i].split(":")[1];
                    String name = result1[i+2].split(":")[1];
                    if (name!=null&&name.equals(cityName))
                    {
                        return id;
                    }
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 根据城市名称查询天气预报
     * http://v.juhe.cn/weather/index?format=2&cityname=%E8%8B%8F%E5%B7%9E&key=您申请的KEY
     * @param cityName
     * @return
     */
    @Override
    public JSONObject getWeatherByCityName(String cityName) {
        String url = "http://v.juhe.cn/weather/index";
        Map<String,String> params = new HashMap<String,String>();
        params.put("format","2");
        params.put("cityname",cityName);
        params.put("key",WEATHER_FOREST);
        JSONObject jsonObject = null;
        try{
            String get = URLUtil.net(url, params, "GET");
            jsonObject = JSONObject.fromObject(get);
            return jsonObject;

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
