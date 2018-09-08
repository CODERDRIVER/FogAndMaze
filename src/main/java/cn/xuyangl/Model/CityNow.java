package cn.xuyangl.Model;

/**
 * @Description 查询的最新结果
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/9/8 23:34
 */
public class CityNow {
    /**
     * "city": "suzhou",
     "AQI": "77",
     "quality": "良",
     "date": "2014-05-09 14:00"
     */
    private String city;
    private String AQI;
    private String quality;
    private String date;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAQI() {
        return AQI;
    }

    public void setAQI(String AQI) {
        this.AQI = AQI;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
