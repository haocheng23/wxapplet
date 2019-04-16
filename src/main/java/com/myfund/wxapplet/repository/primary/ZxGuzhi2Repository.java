package com.myfund.wxapplet.repository.primary;

import com.myfund.wxapplet.entity.primary.PubFundanalyseNewest;
import com.myfund.wxapplet.entity.primary.ZxGuzhiOther;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ZxGuzhi2Repository extends JpaRepository<ZxGuzhiOther, Long> {

    @Query(value = "select id,FundCode,FundName,fundType,thisYearRedound,Dealdate,\n" +
            "                  cast(UnitEquity as decimal(10,4)) as UnitEquity,\n" +
            "                  cast(DayBenefit as decimal(10,2)) as DayBenefit\n" +
            "           from PUB_FUNDANALYSE_NEWEST\n" +
            "           where  FundCode  in (?1) order by FundCode", nativeQuery = true)
    List<ZxGuzhiOther> findGuzhiOther(List fundCodeList);
}
