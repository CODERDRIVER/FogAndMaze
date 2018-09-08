package cn.xuyangl.Model;

import java.sql.ResultSet;

/**
 * @Description 返回空气质量请求数据
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/9/8 23:31
 */
public class ResponseMsg {
    private String resultCode;
    private String reason;
    private String errorCode;
    private ResultData result;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ResultData getResult() {
        return result;
    }

    public void setResult(ResultData result) {
        this.result = result;
    }
}
