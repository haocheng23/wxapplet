package com.myfund.wxapplet.controller;

import com.alibaba.fastjson.JSON;
import com.myfund.wxapplet.entity.primary.PubFundanalyseNewest;
import com.myfund.wxapplet.entity.secondary.Tcrecord;
import com.myfund.wxapplet.service.FundService;
import com.myfund.wxapplet.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class FundController {

    private ResultVo vo = new ResultVo();

    @Autowired
    private FundService fundService;

    /**
     * @description: 优选之星
     * @author: haocheng
     * @date: 2019-04-03 15:26
     *
     */
    @RequestMapping(value = "/getYxStar")
    @ResponseBody
    public String getYxStar(){
        System.out.println("只有第一次才会打印sql语句");
        List<PubFundanalyseNewest> yxStar = fundService.getYxStar();
        String result = JSON.toJSONString(yxStar, true);
        return result;
    }


    /**
     * @description: 优选之星保存调仓记录
     *
     * @author: haocheng
     * @date: 2019-04-24 14:04
     *
     */
    @RequestMapping(value = "/saveTiaocang")
    @ResponseBody
    public String saveTiaocang(@RequestParam("oldfundcode") String oldfundcode,
                               @RequestParam("newfundcode") String newfundcode,
                               @RequestParam("fundname") String fundname,
                               @RequestParam("reason") String reason,
                               @RequestParam("status") String status){


        String str = fundService.saveYxStar(oldfundcode, newfundcode, fundname, reason, status);
        if (status.equals("1") && str != null){
            vo.setCode("0000");
            vo.setMsg("调入成功");
        }else if(status.equals("0") && str != null){
            vo.setCode("0000");
            vo.setMsg("调出成功");
        }else{
            vo.setCode("-9999");
            vo.setMsg("保存调仓记录失败");
        }
        return JSON.toJSONString(vo, true);
    }
}
