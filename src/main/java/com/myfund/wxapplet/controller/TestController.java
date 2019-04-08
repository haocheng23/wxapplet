package com.myfund.wxapplet.controller;

import com.myfund.wxapplet.service.FundService;
import com.myfund.wxapplet.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    private static ResultVo vo = new ResultVo();

    @Autowired
    private FundService fundService;


    @RequestMapping("/test")
    @ResponseBody
    public void test(){
        System.out.println("---------------");
        fundService.getYxStar();
        System.out.println("---------------");
    }
}
