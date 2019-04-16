package com.myfund.wxapplet;

import com.alibaba.fastjson.JSON;
import com.myfund.wxapplet.entity.primary.PubFundanalyseNewest;
import com.myfund.wxapplet.service.FundService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={WxappletApplication.class})
public class WxappletApplicationTests {


    @Autowired
    private FundService fundService;

    @Test
    public void contextLoads() {
    }


    /*@Test
    public void getYxStar(){
        List<PubFundanalyseNewest> yxStar = fundService.getYxStar();
        String result = JSON.toJSONString(yxStar, true);
        System.out.println(result);
    }*/

}
