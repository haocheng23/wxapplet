package com.myfund.wxapplet.repository.fifthary;

import com.myfund.wxapplet.entity.fifthary.SysObjects;
import com.myfund.wxapplet.entity.primary.PubFundanalyseNewest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GuZhiRepository extends JpaRepository<SysObjects, String> {

    @Query(value = "SELECT top 1 name FROM SysObjects Where XType='U' and Name like 'FUND_HQ_%' ORDER BY Name desc", nativeQuery = true)
    String findTableName();

}
