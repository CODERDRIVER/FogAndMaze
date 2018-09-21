package cn.xuyangl.fogandhaze.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/9/9 00:08
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String home()
    {
        return "index";
    }
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String homeAdapter()
    {
        return "home";
    }
}
