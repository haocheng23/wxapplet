package com.myfund.wxapplet.service;

import com.myfund.wxapplet.entity.fourthary.HotFundContent;
import com.myfund.wxapplet.entity.primary.PubFundanalyseNewest;
import com.myfund.wxapplet.entity.thirdary.FundanalysisNew;
import com.myfund.wxapplet.repository.fourthary.YxStarDetail4Repository;
import com.myfund.wxapplet.repository.primary.YxStarDetailRepository;
import com.myfund.wxapplet.repository.secondary.YxRepository;
import com.myfund.wxapplet.repository.thirdary.YxStarDetail3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FundServiceImpl implements FundService{

    @Autowired
    private YxRepository yxRepository;

    @Autowired
    private YxStarDetailRepository yxStarDetailRepository;

    @Autowired
    private YxStarDetail4Repository yxStarDetail4Repository;

    @Autowired
    private YxStarDetail3Repository yxStarDetail3Repository;

    @Override
    public List<PubFundanalyseNewest> getYxStar() {
        List fundcodeList = yxRepository.findFundcode();
        List resultList  = new ArrayList();
        for (int i = 0; i < fundcodeList.size(); i++) {
            System.out.println("--------------------------------");
            String fundcode = fundcodeList.get(i).toString();
            System.out.println(fundcode);
            List<PubFundanalyseNewest> result = yxStarDetailRepository.findYxStarByFundcode(fundcode);
            List<FundanalysisNew> result3 = yxStarDetail3Repository.findYxStar3ByFundcode(fundcode);
            List<HotFundContent> result4 = yxStarDetail4Repository.findYxStar4ByFundcode(fundcode);
            System.out.println(result.toString());
            System.out.println(result3.toString());
            System.out.println(result4.toString());
            Map map = new HashMap();
            map.put("fundcode", result.get(0).getFundCode());
            map.put("fundName", result.get(0).getFundName());
            map.put("fundType", result.get(0).getFundType());
            map.put("thisYearRedound", result.get(0).getThisYearRedound());
            map.put("IntegratedScore", result3.get(0).getIntegratedScore());
            map.put("IntegratedScoreAdvice", result3.get(0).getIntegratedScoreAdvice());
            map.put("Reason", result4.get(0).getReason());
            map.put("ZHStar", result4.get(0).getZhStar());
            resultList.add(map);
            System.out.println(resultList.toString());
            System.out.println("--------------------------------");
        }
        return resultList;
    }

    /**
     * @description: 特殊符号转换
     * @author: haocheng
     * @date: 2019-04-15 14:26
     *
     */
    public void transfer(){

    }
}
