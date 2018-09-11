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
     * http://v.juhe.cn/historyWeather/citys
     * 根据城市名称和省份id查询城市id
     * city_name
     * province_id
     */
    public String getCityIdByProvinceIdAndCityName(String provinceId,String cityName);
}
