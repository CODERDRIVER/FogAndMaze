package cn.xuyangl.fogandhaze.service;

import net.sf.json.JSON;
import net.sf.json.JSONObject;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/9/8 22:40
 */
public interface JuHeService {
//    查询空气质量
    public JSONObject getUrbanAirQuality(String city);

    /**
     * http://v.juhe.cn/historyWeather/weather?key=&city_id=1157&weather_date=2017-07-15
     * @return
     */
    public JSONObject getWeather(String cityId, String weatherDate);

    /**
     * 根据省份查询对应的城市http://v.juhe.cn/historyWeather/province
     */
    public String getProvinceIdByProvinceName(String provinceName);
    /**
     * 历史天气
     * http://v.juhe.cn/historyWeather/citys
     * 根据城市名称和省份id查询城市id
     * city_name
     * province_id
     */
    public String getCityIdByProvinceIdAndCityName(String provinceId,String cityName);

    /**
     * http://v.juhe.cn/weather/index
     * 全国天气预报
     * http://v.juhe.cn/weather/index?format=2&cityname=%E8%8B%8F%E5%B7%9E&key=您申请的KEY
     * 根据城市名称查询天气预报
     */
    public JSONObject getWeatherByCityName(String cityName);

}
