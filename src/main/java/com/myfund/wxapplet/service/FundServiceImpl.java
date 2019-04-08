package com.myfund.wxapplet.service;

import com.myfund.wxapplet.entity.primary.PubFundanalyseNewest;
import com.myfund.wxapplet.repository.primary.YxStarDetailRepository;
import com.myfund.wxapplet.repository.secondary.YxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FundServiceImpl implements FundService{

    @Autowired
    private YxRepository yxRepository;

    @Autowired
    private YxStarDetailRepository yxStarDetailRepository;

    @Override
    public List<PubFundanalyseNewest> getYxStar() {
        List fundcodeList = yxRepository.findFundcode();
        PubFundanalyseNewest result = new PubFundanalyseNewest();
        ArrayList<PubFundanalyseNewest> resultList = new ArrayList<PubFundanalyseNewest>();
        for (int i = 0; i < fundcodeList.size(); i++) {
            result = yxStarDetailRepository.findYxStarByFundcode(fundcodeList.get(i).toString());
            resultList.add(result);
        }
        return resultList;
    }
}
