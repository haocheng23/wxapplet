package com.myfund.wxapplet.repository.primary;

import com.myfund.wxapplet.entity.primary.PubFundanalyseNewest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ZxGuzhiRepository extends JpaRepository<PubFundanalyseNewest, Long> {

    @Query(value = "select  top 1 convert(varchar(10),dealdate,23)  dealdate\n" +
            "from (select  count(dealdate)  num ,dealdate\n" +
            "      from  [PUB_FUNDANALYSE_NEWEST]\n" +
            "      where FundCode  in (?1)\n" +
            "      group  by  dealdate) a\n" +
            "order  by   a.num desc", nativeQuery = true)
    String findDealdate(List fundCodeList);

}
