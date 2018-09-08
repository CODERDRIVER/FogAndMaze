package cn.xuyangl.Model;

/**
 * @Description 各监测点的数据
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/9/8 23:35
 */
public class LastMoniData {

    /**
     * "city": "上方山",
     "AQI": "77",
     "quality": "良",
     "PM2.5Hour": "46μg/m³",
     "PM2.5Day": "46μg/m³",
     "PM10Hour": "104μg/m³",
     "lat": "31.247222",
     "lon": "120.561389"
     */
    private String city;
    private String AQI;
    private String quality;
    private String PM2Point5Hour;
    private String PM2Point5Day;
    private String lat;
    private String lon;

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

    public String getPM2Point5Hour() {
        return PM2Point5Hour;
    }

    public void setPM2Point5Hour(String PM2Point5Hour) {
        this.PM2Point5Hour = PM2Point5Hour;
    }

    public String getPM2Point5Day() {
        return PM2Point5Day;
    }

    public void setPM2Point5Day(String PM2Point5Day) {
        this.PM2Point5Day = PM2Point5Day;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }
}
