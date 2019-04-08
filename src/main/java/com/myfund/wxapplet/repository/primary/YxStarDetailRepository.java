package com.myfund.wxapplet.repository.primary;

import com.myfund.wxapplet.entity.primary.PubFundanalyseNewest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface YxStarDetailRepository extends JpaRepository<PubFundanalyseNewest, Long> {

    @Query(value = "select id,FundCode,DealDate,FundName,FundType from PUB_FUNDANALYSE_NEWEST where fundcode = ?1", nativeQuery = true )
    PubFundanalyseNewest findYxStarByFundcode(String fundcode);
}
