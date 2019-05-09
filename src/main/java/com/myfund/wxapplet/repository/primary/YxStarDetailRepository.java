package com.myfund.wxapplet.repository.primary;

import com.myfund.wxapplet.entity.primary.PubFundanalyseNewest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface YxStarDetailRepository extends JpaRepository<PubFundanalyseNewest, Long> {

    @Query(value = "select id,FundCode,DealDate,FundName,FundType,ThisYearRedound from PUB_FUNDANALYSE_NEWEST where fundcode = ?1", nativeQuery = true )
    List<PubFundanalyseNewest> findYxStarByFundcode(String fundcode);



    @Query(value = "select id,FundCode,DealDate,FundName,FundType,ThisYearRedound from PUB_FUNDANALYSE_NEWEST where fundcode in (?1) order by  ThisYearRedound desc ", nativeQuery = true )
    List<PubFundanalyseNewest> findYxStarByFundcode(List fundcodeList);
}
