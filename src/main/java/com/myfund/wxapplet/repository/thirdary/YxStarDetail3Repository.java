package com.myfund.wxapplet.repository.thirdary;

import com.myfund.wxapplet.entity.thirdary.FundanalysisNew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface YxStarDetail3Repository extends JpaRepository<FundanalysisNew, String> {

    @Query(value = "select FundCode,IntegratedScore,IntegratedScoreAdvice from FUNDANALYSIS_NEW where FundCode = ?1",nativeQuery = true)
    List<FundanalysisNew> findYxStar3ByFundcode(String fundcode);


    @Query(value = "select FundCode,IntegratedScore,IntegratedScoreAdvice from FUNDANALYSIS_NEW where FundCode in (?1)",nativeQuery = true)
    List<FundanalysisNew> findYxStar3ByFundcode(List fundcodeList);


    @Query(value = "select FundCode,IntegratedScore,IntegratedScoreAdvice from FUNDANALYSIS_NEW where FundCode in (?1)",nativeQuery = true)
    List<FundanalysisNew> findIntegratedScoreAdvice(List fundCodeList);

}
