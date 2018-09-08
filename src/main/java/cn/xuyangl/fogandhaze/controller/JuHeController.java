package cn.xuyangl.fogandhaze.controller;

import cn.xuyangl.fogandhaze.service.JuHeService;
import net.sf.json.JSONObject;
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

    @RequestMapping(value = "/urbanAirQuality",method = RequestMethod.GET)
    public JSONObject getUrbanAirQuality(@RequestParam(value = "city") String city)
    {
        JSONObject jsonObject = juHeService.getUrbanAirQuality(city);
        return jsonObject;
    }
}
