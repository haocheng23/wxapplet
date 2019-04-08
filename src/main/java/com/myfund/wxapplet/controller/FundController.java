package com.myfund.wxapplet.controller;

import com.alibaba.fastjson.JSON;
import com.myfund.wxapplet.entity.primary.PubFundanalyseNewest;
import com.myfund.wxapplet.service.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FundController {
    @Autowired
    private FundService fundService;

    /**
     * @description: 优选之星
     * @author: haocheng
     * @date: 2019-04-03 15:26
     *
     */
    @RequestMapping(name = "/getYxStar")
    @ResponseBody
    public String getYxStar(){
        List<PubFundanalyseNewest> yxStar = fundService.getYxStar();
        String result = JSON.toJSONString(yxStar, true);
        return result;
    }
}
