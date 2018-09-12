package cn.xuyangl.fogandhaze.controller;

import cn.xuyangl.fogandhaze.service.JuHeService;
import net.sf.json.JSONObject;
import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/9/8 22:38
 */
@RestController
@RequestMapping("/")
public class JuHeController {


    @Autowired
    private JuHeService juHeService;


    /**
     * 请求某个城市的空气质量
     * @param city
     * @return
     */
    @RequestMapping(value = "/urbanAirQuality",method = RequestMethod.GET)
    public String getUrbanAirQuality(@RequestParam(value = "city") String city)
    {
//        JSONObject jsonObject = juHeService.getUrbanAirQuality(city);
        String jsonReuslt = "{\"resultcode\":\"200\",\"reason\":\"SUCCESSED!\",\"error_code\":0,\"result\":[{\"citynow\":{\"city\":\"西安\",\"AQI\":\"61\",\"quality\":\"良\",\"date\":\"2018-09-09 12:00\"},\"lastTwoWeeks\":{\"1\":{\"city\":\"西安\",\"AQI\":\"53\",\"quality\":\"良\",\"date\":\"2018-08-12\"},\"2\":{\"city\":\"西安\",\"AQI\":\"56\",\"quality\":\"良\",\"date\":\"2018-08-13\"},\"3\":{\"city\":\"西安\",\"AQI\":\"61\",\"quality\":\"良\",\"date\":\"2018-08-14\"},\"4\":{\"city\":\"西安\",\"AQI\":\"65\",\"quality\":\"良\",\"date\":\"2018-08-15\"},\"5\":{\"city\":\"西安\",\"AQI\":\"65\",\"quality\":\"良\",\"date\":\"2018-08-16\"},\"6\":{\"city\":\"西安\",\"AQI\":\"54\",\"quality\":\"良\",\"date\":\"2018-08-17\"},\"7\":{\"city\":\"西安\",\"AQI\":\"62\",\"quality\":\"良\",\"date\":\"2018-08-18\"},\"8\":{\"city\":\"西安\",\"AQI\":\"48\",\"quality\":\"优\",\"date\":\"2018-08-19\"},\"9\":{\"city\":\"西安\",\"AQI\":\"56\",\"quality\":\"良\",\"date\":\"2018-08-20\"},\"10\":{\"city\":\"西安\",\"AQI\":\"30\",\"quality\":\"优\",\"date\":\"2018-08-21\"},\"11\":{\"city\":\"西安\",\"AQI\":\"35\",\"quality\":\"优\",\"date\":\"2018-08-22\"},\"12\":{\"city\":\"西安\",\"AQI\":\"49\",\"quality\":\"优\",\"date\":\"2018-08-23\"},\"13\":{\"city\":\"西安\",\"AQI\":\"52\",\"quality\":\"良\",\"date\":\"2018-08-24\"},\"14\":{\"city\":\"西安\",\"AQI\":\"68\",\"quality\":\"良\",\"date\":\"2018-08-25\"},\"15\":{\"city\":\"西安\",\"AQI\":\"60\",\"quality\":\"良\",\"date\":\"2018-08-26\"},\"16\":{\"city\":\"西安\",\"AQI\":\"60\",\"quality\":\"良\",\"date\":\"2018-08-27\"},\"17\":{\"city\":\"西安\",\"AQI\":\"63\",\"quality\":\"良\",\"date\":\"2018-08-28\"},\"18\":{\"city\":\"西安\",\"AQI\":\"65\",\"quality\":\"良\",\"date\":\"2018-08-29\"},\"19\":{\"city\":\"西安\",\"AQI\":\"62\",\"quality\":\"良\",\"date\":\"2018-08-30\"},\"20\":{\"city\":\"西安\",\"AQI\":\"64\",\"quality\":\"良\",\"date\":\"2018-08-31\"},\"21\":{\"city\":\"西安\",\"AQI\":\"30\",\"quality\":\"优\",\"date\":\"2018-09-01\"},\"22\":{\"city\":\"西安\",\"AQI\":\"27\",\"quality\":\"优\",\"date\":\"2018-09-02\"},\"23\":{\"city\":\"西安\",\"AQI\":\"52\",\"quality\":\"良\",\"date\":\"2018-09-03\"},\"24\":{\"city\":\"西安\",\"AQI\":\"59\",\"quality\":\"良\",\"date\":\"2018-09-04\"},\"25\":{\"city\":\"西安\",\"AQI\":\"33\",\"quality\":\"优\",\"date\":\"2018-09-05\"},\"26\":{\"city\":\"西安\",\"AQI\":\"82\",\"quality\":\"良\",\"date\":\"2018-09-06\"},\"27\":{\"city\":\"西安\",\"AQI\":\"49\",\"quality\":\"优\",\"date\":\"2018-09-07\"},\"28\":{\"city\":\"西安\",\"AQI\":\"38\",\"quality\":\"优\",\"date\":\"2018-09-08\"}},\"lastMoniData\":{\"1\":{\"city\":\"高压开关厂\",\"AQI\":\"59\",\"America_AQI\":\"82\",\"quality\":\"良\",\"PM2.5Hour\":\"31\",\"PM2.5Day\":\"31\",\"PM10Hour\":\"67\",\"lat\":\"34.2749\",\"lon\":\"108.882\"},\"2\":{\"city\":\"兴庆小区\",\"AQI\":\"61\",\"America_AQI\":\"84\",\"quality\":\"良\",\"PM2.5Hour\":\"32\",\"PM2.5Day\":\"32\",\"PM10Hour\":\"72\",\"lat\":\"34.2629\",\"lon\":\"108.993\"},\"3\":{\"city\":\"纺织城\",\"AQI\":\"66\",\"America_AQI\":\"88\",\"quality\":\"良\",\"PM2.5Hour\":\"34\",\"PM2.5Day\":\"34\",\"PM10Hour\":\"82\",\"lat\":\"34.2572\",\"lon\":\"109.06\"},\"4\":{\"city\":\"小寨\",\"AQI\":\"60\",\"America_AQI\":\"90\",\"quality\":\"良\",\"PM2.5Hour\":\"35\",\"PM2.5Day\":\"35\",\"PM10Hour\":\"69\",\"lat\":\"34.2324\",\"lon\":\"108.94\"},\"5\":{\"city\":\"市人民体育场\",\"AQI\":\"60\",\"America_AQI\":\"88\",\"quality\":\"良\",\"PM2.5Hour\":\"34\",\"PM2.5Day\":\"34\",\"PM10Hour\":\"69\",\"lat\":\"\",\"lon\":\"\"},\"6\":{\"city\":\"高新西区\",\"AQI\":\"63\",\"America_AQI\":\"76\",\"quality\":\"良\",\"PM2.5Hour\":\"28\",\"PM2.5Day\":\"28\",\"PM10Hour\":\"76\",\"lat\":\"34.2303\",\"lon\":\"108.883\"},\"7\":{\"city\":\"经开区\",\"AQI\":\"54\",\"America_AQI\":\"80\",\"quality\":\"良\",\"PM2.5Hour\":\"30\",\"PM2.5Day\":\"30\",\"PM10Hour\":\"57\",\"lat\":\"34.3474\",\"lon\":\"108.935\"},\"8\":{\"city\":\"长安区\",\"AQI\":\"58\",\"America_AQI\":\"68\",\"quality\":\"良\",\"PM2.5Hour\":\"24\",\"PM2.5Day\":\"24\",\"PM10Hour\":\"65\",\"lat\":\"34.1546\",\"lon\":\"108.906\"},\"9\":{\"city\":\"阎良区\",\"AQI\":\"66\",\"America_AQI\":\"84\",\"quality\":\"良\",\"PM2.5Hour\":\"32\",\"PM2.5Day\":\"32\",\"PM10Hour\":\"81\",\"lat\":\"34.6575\",\"lon\":\"109.2\"},\"10\":{\"city\":\"临潼区\",\"AQI\":\"61\",\"America_AQI\":\"88\",\"quality\":\"良\",\"PM2.5Hour\":\"34\",\"PM2.5Day\":\"34\",\"PM10Hour\":\"71\",\"lat\":\"34.3731\",\"lon\":\"109.2186\"},\"11\":{\"city\":\"草滩\",\"AQI\":\"63\",\"America_AQI\":\"78\",\"quality\":\"良\",\"PM2.5Hour\":\"29\",\"PM2.5Day\":\"29\",\"PM10Hour\":\"75\",\"lat\":\"34.378\",\"lon\":\"108.869\"},\"12\":{\"city\":\"曲江文化产业集团\",\"AQI\":\"64\",\"America_AQI\":\"92\",\"quality\":\"良\",\"PM2.5Hour\":\"36\",\"PM2.5Day\":\"36\",\"PM10Hour\":\"78\",\"lat\":\"34.1978\",\"lon\":\"108.985\"},\"13\":{\"city\":\"广运潭\",\"AQI\":\"62\",\"America_AQI\":\"88\",\"quality\":\"良\",\"PM2.5Hour\":\"34\",\"PM2.5Day\":\"34\",\"PM10Hour\":\"74\",\"lat\":\"34.3274\",\"lon\":\"109.043\"}}}]}\n";
//        System.out.println(jsonObject);
        return jsonReuslt;
    }
    /**
     * 请求某个城市的天气预报 http://v.juhe.cn/historyWeather/weather?key=&city_id=1157&weather_date=2017-07-15
     */
    @RequestMapping(value = "/weather",method = RequestMethod.GET)
    public JSONObject getWeather(@RequestParam(value = "province_name")String provinceName,@RequestParam(value = "city_name")String cityName,@RequestParam("weather_date") String weatherDate)
    {
//        String provinceId = juHeService.getProvinceIdByProvinceName(provinceName);
//        String cityIdByProvinceIdAndCityName = juHeService.getCityIdByProvinceIdAndCityName(provinceId, cityName);
//        if (cityIdByProvinceIdAndCityName==null)
//        {
//            //没有要查询的城市
//        }
//        JSONObject weather = juHeService.getWeather(cityIdByProvinceIdAndCityName, weatherDate);
        JSONObject weather = JSONObject.fromObject("{\"reason\":\"查询成功\",\"result\":{\"city_id\":\"1810\",\"city_name\":\"西安\",\"weather_date\":\"2018-09-11\",\"day_weather\":\"晴\",\"night_weather\":\"阴\",\"day_temp\":\"30℃\",\"night_temp\":\"20℃\",\"day_wind\":\"西北风\",\"day_wind_comp\":\"<3级\",\"night_wind\":\"东南风\",\"night_wind_comp\":\"<3级\",\"day_weather_id\":\"00\",\"night_weather_id\":\"02\"},\"error_code\":0}\n");
        System.out.println(weather);
        return weather;
    }

    /**
     * 根据城市名称获得省份id
     */
    @RequestMapping(value = "/cityid",method = RequestMethod.GET)
    public String getCityIDFromCityName(@RequestParam(value = "city_name") String cityName)
    {
        //String provinceId = juHeService.getProvinceIdByProvinceName(cityName);
        String provinceId = "{\"reason\":\"查询成功\",\"result\":{\"city_id\":\"1810\",\"city_name\":\"西安\",\"weather_date\":\"2018-09-11\",\"day_weather\":\"晴\",\"night_weather\":\"阴\",\"day_temp\":\"30℃\",\"night_temp\":\"20℃\",\"day_wind\":\"西北风\",\"day_wind_comp\":\"<3级\",\"night_wind\":\"东南风\",\"night_wind_comp\":\"<3级\",\"day_weather_id\":\"00\",\"night_weather_id\":\"02\"},\"error_code\":0}\n";
        System.out.println(provinceId);
        return provinceId;
    }

    /**
     * 根据城市名称获得全国天气预报
     * http://v.juhe.cn/weather/index?format=2&cityname=%E8%8B%8F%E5%B7%9E&key=您申请的KEY
     */
    @RequestMapping(value = "/weather/city",method = RequestMethod.GET)
    public JSONObject getWeatherByCityName(@RequestParam(value = "city_name") String cityName)
    {
//        JSONObject weatherByCityName = juHeService.getWeatherByCityName(cityName);
        JSONObject weatherByCityName = JSONObject.fromObject("{\"resultcode\":\"200\",\"reason\":\"successed!\",\"result\":{\"sk\":{\"temp\":\"22\",\"wind_direction\":\"东风\",\"wind_strength\":\"2级\",\"humidity\":\"61%\",\"time\":\"21:03\"},\"today\":{\"temperature\":\"20℃~29℃\",\"weather\":\"多云转阴\",\"weather_id\":{\"fa\":\"01\",\"fb\":\"02\"},\"wind\":\"东南风3-5级\",\"week\":\"星期三\",\"city\":\"西安\",\"date_y\":\"2018年09月12日\",\"dressing_index\":\"热\",\"dressing_advice\":\"天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。\",\"uv_index\":\"弱\",\"comfort_index\":\"\",\"wash_index\":\"较适宜\",\"travel_index\":\"适宜\",\"exercise_index\":\"适宜\",\"drying_index\":\"\"},\"future\":[{\"temperature\":\"20℃~29℃\",\"weather\":\"多云转阴\",\"weather_id\":{\"fa\":\"01\",\"fb\":\"02\"},\"wind\":\"东南风3-5级\",\"week\":\"星期三\",\"date\":\"20180912\"},{\"temperature\":\"18℃~27℃\",\"weather\":\"阴转阵雨\",\"weather_id\":{\"fa\":\"02\",\"fb\":\"03\"},\"wind\":\"东北风微风\",\"week\":\"星期四\",\"date\":\"20180913\"},{\"temperature\":\"17℃~26℃\",\"weather\":\"多云转阵雨\",\"weather_id\":{\"fa\":\"01\",\"fb\":\"03\"},\"wind\":\"东北风微风\",\"week\":\"星期五\",\"date\":\"20180914\"},{\"temperature\":\"15℃~19℃\",\"weather\":\"小雨\",\"weather_id\":{\"fa\":\"07\",\"fb\":\"07\"},\"wind\":\"西南风3-5级\",\"week\":\"星期六\",\"date\":\"20180915\"},{\"temperature\":\"15℃~21℃\",\"weather\":\"阴转小雨\",\"weather_id\":{\"fa\":\"02\",\"fb\":\"07\"},\"wind\":\"东北风微风\",\"week\":\"星期日\",\"date\":\"20180916\"},{\"temperature\":\"17℃~26℃\",\"weather\":\"多云转阵雨\",\"weather_id\":{\"fa\":\"01\",\"fb\":\"03\"},\"wind\":\"东北风微风\",\"week\":\"星期一\",\"date\":\"20180917\"},{\"temperature\":\"15℃~19℃\",\"weather\":\"小雨\",\"weather_id\":{\"fa\":\"07\",\"fb\":\"07\"},\"wind\":\"西南风3-5级\",\"week\":\"星期二\",\"date\":\"20180918\"}]},\"error_code\":0}\n");
        System.out.println(weatherByCityName);
        return weatherByCityName;
    }

}
