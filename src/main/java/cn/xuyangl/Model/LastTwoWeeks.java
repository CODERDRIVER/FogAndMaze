package cn.xuyangl.Model;

/**
 * @Description 最近几周的空气质量数据
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/9/8 23:35
 */
public class LastTwoWeeks {
    /**
     * city": "suzhou",
     "AQI": "100",
     "quality": "良",
     "date": "2014-05-08"
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
