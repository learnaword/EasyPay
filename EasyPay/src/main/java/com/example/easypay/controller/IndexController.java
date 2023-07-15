package com.example.easypay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转的控制器
 */
@Controller
public class IndexController {
    //跳转到index.html
    @RequestMapping("/index")
    public String index(){
        return "index";
    }


    //跳转到main.html
    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    //跳转到order的列表页面
    @RequestMapping("/orderList")
    public String orderList(){
        return "orderList";
    }


    //支付成功后跳转到sucess
    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}

