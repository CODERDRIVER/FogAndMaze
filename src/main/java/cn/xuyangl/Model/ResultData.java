package cn.xuyangl.Model;

/**
 * @Description 空气质量返回参数
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/9/8 23:34
 */
public class ResultData {

    private CityNow cityNow;
    private LastTwoWeeks lastTwoWeeks;
    private LastMoniData lastMoniData;

    public CityNow getCityNow() {
        return cityNow;
    }

    public void setCityNow(CityNow cityNow) {
        this.cityNow = cityNow;
    }

    public LastTwoWeeks getLastTwoWeeks() {
        return lastTwoWeeks;
    }

    public void setLastTwoWeeks(LastTwoWeeks lastTwoWeeks) {
        this.lastTwoWeeks = lastTwoWeeks;
    }

    public LastMoniData getLastMoniData() {
        return lastMoniData;
    }

    public void setLastMoniData(LastMoniData lastMoniData) {
        this.lastMoniData = lastMoniData;
    }
}
