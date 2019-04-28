package com.myfund.wxapplet.service;

import com.myfund.wxapplet.entity.primary.PubFundanalyseNewest;
import com.myfund.wxapplet.entity.secondary.Tcrecord;
import com.myfund.wxapplet.entity.secondary.YxStar;

import java.util.List;

public interface FundService {

    List<PubFundanalyseNewest> getYxStar();


//    String saveYxStar(String oldfundcode, String newfundcode, String fundname, String reason, String status);
    String saveYxStar(Tcrecord tcrecord);


    List<YxStar> getYxTiaocang();

    List<Tcrecord> getTiaocang();
}
