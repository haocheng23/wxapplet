package com.myfund.wxapplet.entity.thirdary;


import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table(name = "FUNDANALYSIS_NEW", schema = "dbo", catalog = "PrimaryData_New")
public class FundanalysisNew {
    @Id
    private String fundCode;
    private BigDecimal integratedScore;
    private String integratedScoreAdvice;
    /*private String fundName;
    private String fundStatusMark;
    private String fundTyp1;
    private String fundTyp2;
    private String fundCompanyNameSimple;
    private String manager1;
    private BigDecimal performanceScore;
    private BigDecimal riskScore;
    private BigDecimal managerScore;
    private BigDecimal fundCompanyScore;
    private Double integratedScoreSRanking;
    private String integratedAssess;
    private String performanceAssess;
    private String riskAssess;
    private String managerAssess;
    private String fundCompanyAssess;
    private String performanceScoreAdvice;
    private String riskScoreAdvice;
    private String managerScoreAdvice;
    private String fundCompanyScoreAdvice;
    private String performanceRank;
    private String riskRank;
    private String managerRank;
    private String fundCompanyRank;
    private Double ytdYield;
    private Double lastYearYield;
    private Double lastTwoYearYield;
    private Double ytdYieldSAverage;
    private Double lastYearYieldSAverage;
    private Double lastTwoYearYieldSAverage;
    private Double ytdBjjz;
    private Double lastYearBjjz;
    private Double lastTwoYearBjjz;
    private Double ytdYieldAllMarket;
    private Double lastYearYieldAllMarket;
    private Double lastTwoYearYieldAllMarket;
    private BigDecimal ytdYieldTclScore;
    private BigDecimal ytdYieldQscScore;
    private BigDecimal lastYieldTclScore;
    private BigDecimal lastYieldQscScore;
    private BigDecimal lastTwoYieldTclScore;
    private BigDecimal lastTwoYieldQscScore;
    private String ytdSRanking;
    private BigDecimal ytdSRankingScore;
    private String lastYearSRanking;
    private BigDecimal lastYearSRankingScore;
    private String lastTwoYearSRanking;
    private BigDecimal lastTwoYearSRankingScore;
    private String ytdYieldAssess;
    private String lastYearYieldAssess;
    private String lastTwoYearYieldAssess;
    private Double ytdMaxRetracement;
    private Double lastYearMaxRetracement;
    private Double lastTwoYearMaxRetracement;
    private Double ytdMaxRetracementSAverage;
    private Double lastYearMaxRetracementSAverage;
    private Double lastTwoYearMaxRetracementSAverage;
    private String ytdMaxRetracementSRanking;
    private BigDecimal ytdMaxRetracementSScore;
    private String lastYearMaxRetracementSRanking;
    private BigDecimal lastYearMaxRetracementSScore;
    private String lastTwoYearMaxRetracementSRanking;
    private BigDecimal lastTwoYearMaxRetracementSScore;
    private Double sifYieldSd;
    private Double sifYieldSdsAverage;
    private String sifYieldSdsRanking;
    private BigDecimal sifYieldSdsScore;
    private String ytdMaxRetracementAssess;
    private String lastYearMaxRetracementAssess;
    private String lastTwoYearMaxRetracementAssess;
    private String sifYieldSdAssess;
    private Double riskResistanceScore;
    private Double stockAbilityScore;
    private Double timeAbilityScore;
    private Double experienceScore;
    private Double profitabilityScore;
    private Double fundCount;
    private Double stockAbilityScoreSAverage;
    private Double timeAbilityScoreSAverage;
    private Double experienceTimeSAverage;
    private Double experienceScoreSAverage;
    private Double profitabilityYieldSAverage;
    private String profitabilityScoreSAverage;
    private String stockAbilityScoreSRanking;
    private String timeAbilityScoreSRanking;
    private String experienceTimeSRanking;
    private String profitabilityScoreSRanking;
    private String stockAbilityScoreAssess;
    private String timeAbilityScoreAssess;
    private String riskResistanceAssess;
    private String experienceTimeAssess;
    private String experienceTimeAssessLevel;
    private String profitabilityScoreAssess;
    private Double ytdCompanySFundYield;
    private Double lastYearCompanySFundYield;
    private Double lastTwoYearCompanySFundYield;
    private Double ytdSFundYield;
    private Double lastYearSFundYield;
    private Double lastTwoYearSFundYield;
    private String ytdCompanySRanking;
    private BigDecimal ytdCompanySScore;
    private String lastYearCompanySRanking;
    private BigDecimal lastYearCompanySScore;
    private String lastTwoYearCompanySRanking;
    private BigDecimal lastTwoYearCompanySScore;
    private Double fundCompanyScale;
    private Double fundCompanyAverageScale;
    private String fundCompanyScaleSRanking;
    private String fundCompanyScaleSAssess;
    private BigDecimal fundCompanyScaleSScore;
    private String ytdCompanySFundYieldAssess;
    private String lastYearCompanySFundYieldAssess;
    private String lastTwoYearCompanySFundYieldAssess;
    private String fundCompanyYieldAssess;
    private String fundCompanyYieldStar;
    private Integer fundCompanyMgNum;
    private BigDecimal fundCompanyMgNumRankScore;
    private Timestamp startDate;
    private Double fundScale;
    private String isFreeAnalysis;*/

    @Basic
    @Column(name = "FundCode")
    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    @Basic
    @Column(name = "IntegratedScore")
    public BigDecimal getIntegratedScore() {
        return integratedScore;
    }

    public void setIntegratedScore(BigDecimal integratedScore) {
        this.integratedScore = integratedScore;
    }

    @Basic
    @Column(name = "IntegratedScoreAdvice")
    public String getIntegratedScoreAdvice() {
        return integratedScoreAdvice;
    }

    public void setIntegratedScoreAdvice(String integratedScoreAdvice) {
        this.integratedScoreAdvice = integratedScoreAdvice;
    }


    /*@Basic
    @Column(name = "FundName")
    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    @Basic
    @Column(name = "FundStatusMark")
    public String getFundStatusMark() {
        return fundStatusMark;
    }

    public void setFundStatusMark(String fundStatusMark) {
        this.fundStatusMark = fundStatusMark;
    }

    @Basic
    @Column(name = "FundTyp1")
    public String getFundTyp1() {
        return fundTyp1;
    }

    public void setFundTyp1(String fundTyp1) {
        this.fundTyp1 = fundTyp1;
    }

    @Basic
    @Column(name = "FundTyp2")
    public String getFundTyp2() {
        return fundTyp2;
    }

    public void setFundTyp2(String fundTyp2) {
        this.fundTyp2 = fundTyp2;
    }

    @Basic
    @Column(name = "FundCompanyNameSimple")
    public String getFundCompanyNameSimple() {
        return fundCompanyNameSimple;
    }

    public void setFundCompanyNameSimple(String fundCompanyNameSimple) {
        this.fundCompanyNameSimple = fundCompanyNameSimple;
    }

    @Basic
    @Column(name = "Manager1")
    public String getManager1() {
        return manager1;
    }

    public void setManager1(String manager1) {
        this.manager1 = manager1;
    }

    @Basic
    @Column(name = "PerformanceScore")
    public BigDecimal getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(BigDecimal performanceScore) {
        this.performanceScore = performanceScore;
    }

    @Basic
    @Column(name = "RiskScore")
    public BigDecimal getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(BigDecimal riskScore) {
        this.riskScore = riskScore;
    }

    @Basic
    @Column(name = "ManagerScore")
    public BigDecimal getManagerScore() {
        return managerScore;
    }

    public void setManagerScore(BigDecimal managerScore) {
        this.managerScore = managerScore;
    }

    @Basic
    @Column(name = "FundCompanyScore")
    public BigDecimal getFundCompanyScore() {
        return fundCompanyScore;
    }

    public void setFundCompanyScore(BigDecimal fundCompanyScore) {
        this.fundCompanyScore = fundCompanyScore;
    }



    @Basic
    @Column(name = "IntegratedScoreSRanking")
    public Double getIntegratedScoreSRanking() {
        return integratedScoreSRanking;
    }

    public void setIntegratedScoreSRanking(Double integratedScoreSRanking) {
        this.integratedScoreSRanking = integratedScoreSRanking;
    }

    @Basic
    @Column(name = "IntegratedAssess")
    public String getIntegratedAssess() {
        return integratedAssess;
    }

    public void setIntegratedAssess(String integratedAssess) {
        this.integratedAssess = integratedAssess;
    }

    @Basic
    @Column(name = "PerformanceAssess")
    public String getPerformanceAssess() {
        return performanceAssess;
    }

    public void setPerformanceAssess(String performanceAssess) {
        this.performanceAssess = performanceAssess;
    }

    @Basic
    @Column(name = "RiskAssess")
    public String getRiskAssess() {
        return riskAssess;
    }

    public void setRiskAssess(String riskAssess) {
        this.riskAssess = riskAssess;
    }

    @Basic
    @Column(name = "ManagerAssess")
    public String getManagerAssess() {
        return managerAssess;
    }

    public void setManagerAssess(String managerAssess) {
        this.managerAssess = managerAssess;
    }

    @Basic
    @Column(name = "FundCompanyAssess")
    public String getFundCompanyAssess() {
        return fundCompanyAssess;
    }

    public void setFundCompanyAssess(String fundCompanyAssess) {
        this.fundCompanyAssess = fundCompanyAssess;
    }



    @Basic
    @Column(name = "PerformanceScoreAdvice")
    public String getPerformanceScoreAdvice() {
        return performanceScoreAdvice;
    }

    public void setPerformanceScoreAdvice(String performanceScoreAdvice) {
        this.performanceScoreAdvice = performanceScoreAdvice;
    }

    @Basic
    @Column(name = "RiskScoreAdvice")
    public String getRiskScoreAdvice() {
        return riskScoreAdvice;
    }

    public void setRiskScoreAdvice(String riskScoreAdvice) {
        this.riskScoreAdvice = riskScoreAdvice;
    }

    @Basic
    @Column(name = "ManagerScoreAdvice")
    public String getManagerScoreAdvice() {
        return managerScoreAdvice;
    }

    public void setManagerScoreAdvice(String managerScoreAdvice) {
        this.managerScoreAdvice = managerScoreAdvice;
    }

    @Basic
    @Column(name = "FundCompanyScoreAdvice")
    public String getFundCompanyScoreAdvice() {
        return fundCompanyScoreAdvice;
    }

    public void setFundCompanyScoreAdvice(String fundCompanyScoreAdvice) {
        this.fundCompanyScoreAdvice = fundCompanyScoreAdvice;
    }

    @Basic
    @Column(name = "PerformanceRank")
    public String getPerformanceRank() {
        return performanceRank;
    }

    public void setPerformanceRank(String performanceRank) {
        this.performanceRank = performanceRank;
    }

    @Basic
    @Column(name = "RiskRank")
    public String getRiskRank() {
        return riskRank;
    }

    public void setRiskRank(String riskRank) {
        this.riskRank = riskRank;
    }

    @Basic
    @Column(name = "ManagerRank")
    public String getManagerRank() {
        return managerRank;
    }

    public void setManagerRank(String managerRank) {
        this.managerRank = managerRank;
    }

    @Basic
    @Column(name = "FundCompanyRank")
    public String getFundCompanyRank() {
        return fundCompanyRank;
    }

    public void setFundCompanyRank(String fundCompanyRank) {
        this.fundCompanyRank = fundCompanyRank;
    }

    @Basic
    @Column(name = "YTD_Yield")
    public Double getYtdYield() {
        return ytdYield;
    }

    public void setYtdYield(Double ytdYield) {
        this.ytdYield = ytdYield;
    }

    @Basic
    @Column(name = "LastYearYield")
    public Double getLastYearYield() {
        return lastYearYield;
    }

    public void setLastYearYield(Double lastYearYield) {
        this.lastYearYield = lastYearYield;
    }

    @Basic
    @Column(name = "LastTwoYearYield")
    public Double getLastTwoYearYield() {
        return lastTwoYearYield;
    }

    public void setLastTwoYearYield(Double lastTwoYearYield) {
        this.lastTwoYearYield = lastTwoYearYield;
    }

    @Basic
    @Column(name = "YTD_YieldSAverage")
    public Double getYtdYieldSAverage() {
        return ytdYieldSAverage;
    }

    public void setYtdYieldSAverage(Double ytdYieldSAverage) {
        this.ytdYieldSAverage = ytdYieldSAverage;
    }

    @Basic
    @Column(name = "LastYearYieldSAverage")
    public Double getLastYearYieldSAverage() {
        return lastYearYieldSAverage;
    }

    public void setLastYearYieldSAverage(Double lastYearYieldSAverage) {
        this.lastYearYieldSAverage = lastYearYieldSAverage;
    }

    @Basic
    @Column(name = "LastTwoYearYieldSAverage")
    public Double getLastTwoYearYieldSAverage() {
        return lastTwoYearYieldSAverage;
    }

    public void setLastTwoYearYieldSAverage(Double lastTwoYearYieldSAverage) {
        this.lastTwoYearYieldSAverage = lastTwoYearYieldSAverage;
    }

    @Basic
    @Column(name = "YTD_BJJZ")
    public Double getYtdBjjz() {
        return ytdBjjz;
    }

    public void setYtdBjjz(Double ytdBjjz) {
        this.ytdBjjz = ytdBjjz;
    }

    @Basic
    @Column(name = "LastYearBJJZ")
    public Double getLastYearBjjz() {
        return lastYearBjjz;
    }

    public void setLastYearBjjz(Double lastYearBjjz) {
        this.lastYearBjjz = lastYearBjjz;
    }

    @Basic
    @Column(name = "LastTwoYearBJJZ")
    public Double getLastTwoYearBjjz() {
        return lastTwoYearBjjz;
    }

    public void setLastTwoYearBjjz(Double lastTwoYearBjjz) {
        this.lastTwoYearBjjz = lastTwoYearBjjz;
    }

    @Basic
    @Column(name = "YTD_YieldAllMarket")
    public Double getYtdYieldAllMarket() {
        return ytdYieldAllMarket;
    }

    public void setYtdYieldAllMarket(Double ytdYieldAllMarket) {
        this.ytdYieldAllMarket = ytdYieldAllMarket;
    }

    @Basic
    @Column(name = "LastYear_YieldAllMarket")
    public Double getLastYearYieldAllMarket() {
        return lastYearYieldAllMarket;
    }

    public void setLastYearYieldAllMarket(Double lastYearYieldAllMarket) {
        this.lastYearYieldAllMarket = lastYearYieldAllMarket;
    }

    @Basic
    @Column(name = "LastTwoYear_YieldAllMarket")
    public Double getLastTwoYearYieldAllMarket() {
        return lastTwoYearYieldAllMarket;
    }

    public void setLastTwoYearYieldAllMarket(Double lastTwoYearYieldAllMarket) {
        this.lastTwoYearYieldAllMarket = lastTwoYearYieldAllMarket;
    }

    @Basic
    @Column(name = "YTD_Yield_tcl_Score")
    public BigDecimal getYtdYieldTclScore() {
        return ytdYieldTclScore;
    }

    public void setYtdYieldTclScore(BigDecimal ytdYieldTclScore) {
        this.ytdYieldTclScore = ytdYieldTclScore;
    }

    @Basic
    @Column(name = "YTD_Yield_qsc_Score")
    public BigDecimal getYtdYieldQscScore() {
        return ytdYieldQscScore;
    }

    public void setYtdYieldQscScore(BigDecimal ytdYieldQscScore) {
        this.ytdYieldQscScore = ytdYieldQscScore;
    }

    @Basic
    @Column(name = "Last_Yield_tcl_Score")
    public BigDecimal getLastYieldTclScore() {
        return lastYieldTclScore;
    }

    public void setLastYieldTclScore(BigDecimal lastYieldTclScore) {
        this.lastYieldTclScore = lastYieldTclScore;
    }

    @Basic
    @Column(name = "Last_Yield_qsc_Score")
    public BigDecimal getLastYieldQscScore() {
        return lastYieldQscScore;
    }

    public void setLastYieldQscScore(BigDecimal lastYieldQscScore) {
        this.lastYieldQscScore = lastYieldQscScore;
    }

    @Basic
    @Column(name = "LastTwo_Yield_tcl_Score")
    public BigDecimal getLastTwoYieldTclScore() {
        return lastTwoYieldTclScore;
    }

    public void setLastTwoYieldTclScore(BigDecimal lastTwoYieldTclScore) {
        this.lastTwoYieldTclScore = lastTwoYieldTclScore;
    }

    @Basic
    @Column(name = "LastTwo_Yield_qsc_Score")
    public BigDecimal getLastTwoYieldQscScore() {
        return lastTwoYieldQscScore;
    }

    public void setLastTwoYieldQscScore(BigDecimal lastTwoYieldQscScore) {
        this.lastTwoYieldQscScore = lastTwoYieldQscScore;
    }

    @Basic
    @Column(name = "YTD_SRanking")
    public String getYtdSRanking() {
        return ytdSRanking;
    }

    public void setYtdSRanking(String ytdSRanking) {
        this.ytdSRanking = ytdSRanking;
    }

    @Basic
    @Column(name = "YTD_SRankingScore")
    public BigDecimal getYtdSRankingScore() {
        return ytdSRankingScore;
    }

    public void setYtdSRankingScore(BigDecimal ytdSRankingScore) {
        this.ytdSRankingScore = ytdSRankingScore;
    }

    @Basic
    @Column(name = "LastYearSRanking")
    public String getLastYearSRanking() {
        return lastYearSRanking;
    }

    public void setLastYearSRanking(String lastYearSRanking) {
        this.lastYearSRanking = lastYearSRanking;
    }

    @Basic
    @Column(name = "LastYearSRankingScore")
    public BigDecimal getLastYearSRankingScore() {
        return lastYearSRankingScore;
    }

    public void setLastYearSRankingScore(BigDecimal lastYearSRankingScore) {
        this.lastYearSRankingScore = lastYearSRankingScore;
    }

    @Basic
    @Column(name = "LastTwoYearSRanking")
    public String getLastTwoYearSRanking() {
        return lastTwoYearSRanking;
    }

    public void setLastTwoYearSRanking(String lastTwoYearSRanking) {
        this.lastTwoYearSRanking = lastTwoYearSRanking;
    }

    @Basic
    @Column(name = "LastTwoYearSRankingScore")
    public BigDecimal getLastTwoYearSRankingScore() {
        return lastTwoYearSRankingScore;
    }

    public void setLastTwoYearSRankingScore(BigDecimal lastTwoYearSRankingScore) {
        this.lastTwoYearSRankingScore = lastTwoYearSRankingScore;
    }

    @Basic
    @Column(name = "YTD_YieldAssess")
    public String getYtdYieldAssess() {
        return ytdYieldAssess;
    }

    public void setYtdYieldAssess(String ytdYieldAssess) {
        this.ytdYieldAssess = ytdYieldAssess;
    }

    @Basic
    @Column(name = "LastYearYieldAssess")
    public String getLastYearYieldAssess() {
        return lastYearYieldAssess;
    }

    public void setLastYearYieldAssess(String lastYearYieldAssess) {
        this.lastYearYieldAssess = lastYearYieldAssess;
    }

    @Basic
    @Column(name = "LastTwoYearYieldAssess")
    public String getLastTwoYearYieldAssess() {
        return lastTwoYearYieldAssess;
    }

    public void setLastTwoYearYieldAssess(String lastTwoYearYieldAssess) {
        this.lastTwoYearYieldAssess = lastTwoYearYieldAssess;
    }

    @Basic
    @Column(name = "YTD_MaxRetracement")
    public Double getYtdMaxRetracement() {
        return ytdMaxRetracement;
    }

    public void setYtdMaxRetracement(Double ytdMaxRetracement) {
        this.ytdMaxRetracement = ytdMaxRetracement;
    }

    @Basic
    @Column(name = "LastYearMaxRetracement")
    public Double getLastYearMaxRetracement() {
        return lastYearMaxRetracement;
    }

    public void setLastYearMaxRetracement(Double lastYearMaxRetracement) {
        this.lastYearMaxRetracement = lastYearMaxRetracement;
    }

    @Basic
    @Column(name = "LastTwoYearMaxRetracement")
    public Double getLastTwoYearMaxRetracement() {
        return lastTwoYearMaxRetracement;
    }

    public void setLastTwoYearMaxRetracement(Double lastTwoYearMaxRetracement) {
        this.lastTwoYearMaxRetracement = lastTwoYearMaxRetracement;
    }

    @Basic
    @Column(name = "YTD_MaxRetracementSAverage")
    public Double getYtdMaxRetracementSAverage() {
        return ytdMaxRetracementSAverage;
    }

    public void setYtdMaxRetracementSAverage(Double ytdMaxRetracementSAverage) {
        this.ytdMaxRetracementSAverage = ytdMaxRetracementSAverage;
    }

    @Basic
    @Column(name = "LastYearMaxRetracementSAverage")
    public Double getLastYearMaxRetracementSAverage() {
        return lastYearMaxRetracementSAverage;
    }

    public void setLastYearMaxRetracementSAverage(Double lastYearMaxRetracementSAverage) {
        this.lastYearMaxRetracementSAverage = lastYearMaxRetracementSAverage;
    }

    @Basic
    @Column(name = "LastTwoYearMaxRetracementSAverage")
    public Double getLastTwoYearMaxRetracementSAverage() {
        return lastTwoYearMaxRetracementSAverage;
    }

    public void setLastTwoYearMaxRetracementSAverage(Double lastTwoYearMaxRetracementSAverage) {
        this.lastTwoYearMaxRetracementSAverage = lastTwoYearMaxRetracementSAverage;
    }

    @Basic
    @Column(name = "YTD_MaxRetracementSRanking")
    public String getYtdMaxRetracementSRanking() {
        return ytdMaxRetracementSRanking;
    }

    public void setYtdMaxRetracementSRanking(String ytdMaxRetracementSRanking) {
        this.ytdMaxRetracementSRanking = ytdMaxRetracementSRanking;
    }

    @Basic
    @Column(name = "YTD_MaxRetracementSScore")
    public BigDecimal getYtdMaxRetracementSScore() {
        return ytdMaxRetracementSScore;
    }

    public void setYtdMaxRetracementSScore(BigDecimal ytdMaxRetracementSScore) {
        this.ytdMaxRetracementSScore = ytdMaxRetracementSScore;
    }

    @Basic
    @Column(name = "LastYearMaxRetracementSRanking")
    public String getLastYearMaxRetracementSRanking() {
        return lastYearMaxRetracementSRanking;
    }

    public void setLastYearMaxRetracementSRanking(String lastYearMaxRetracementSRanking) {
        this.lastYearMaxRetracementSRanking = lastYearMaxRetracementSRanking;
    }

    @Basic
    @Column(name = "LastYearMaxRetracementSScore")
    public BigDecimal getLastYearMaxRetracementSScore() {
        return lastYearMaxRetracementSScore;
    }

    public void setLastYearMaxRetracementSScore(BigDecimal lastYearMaxRetracementSScore) {
        this.lastYearMaxRetracementSScore = lastYearMaxRetracementSScore;
    }

    @Basic
    @Column(name = "LastTwoYearMaxRetracementSRanking")
    public String getLastTwoYearMaxRetracementSRanking() {
        return lastTwoYearMaxRetracementSRanking;
    }

    public void setLastTwoYearMaxRetracementSRanking(String lastTwoYearMaxRetracementSRanking) {
        this.lastTwoYearMaxRetracementSRanking = lastTwoYearMaxRetracementSRanking;
    }

    @Basic
    @Column(name = "LastTwoYearMaxRetracementSScore")
    public BigDecimal getLastTwoYearMaxRetracementSScore() {
        return lastTwoYearMaxRetracementSScore;
    }

    public void setLastTwoYearMaxRetracementSScore(BigDecimal lastTwoYearMaxRetracementSScore) {
        this.lastTwoYearMaxRetracementSScore = lastTwoYearMaxRetracementSScore;
    }

    @Basic
    @Column(name = "SIF_YieldSD")
    public Double getSifYieldSd() {
        return sifYieldSd;
    }

    public void setSifYieldSd(Double sifYieldSd) {
        this.sifYieldSd = sifYieldSd;
    }

    @Basic
    @Column(name = "SIF_YieldSDSAverage")
    public Double getSifYieldSdsAverage() {
        return sifYieldSdsAverage;
    }

    public void setSifYieldSdsAverage(Double sifYieldSdsAverage) {
        this.sifYieldSdsAverage = sifYieldSdsAverage;
    }

    @Basic
    @Column(name = "SIF_YieldSDSRanking")
    public String getSifYieldSdsRanking() {
        return sifYieldSdsRanking;
    }

    public void setSifYieldSdsRanking(String sifYieldSdsRanking) {
        this.sifYieldSdsRanking = sifYieldSdsRanking;
    }

    @Basic
    @Column(name = "SIF_YieldSDSScore")
    public BigDecimal getSifYieldSdsScore() {
        return sifYieldSdsScore;
    }

    public void setSifYieldSdsScore(BigDecimal sifYieldSdsScore) {
        this.sifYieldSdsScore = sifYieldSdsScore;
    }

    @Basic
    @Column(name = "YTD_MaxRetracementAssess")
    public String getYtdMaxRetracementAssess() {
        return ytdMaxRetracementAssess;
    }

    public void setYtdMaxRetracementAssess(String ytdMaxRetracementAssess) {
        this.ytdMaxRetracementAssess = ytdMaxRetracementAssess;
    }

    @Basic
    @Column(name = "LastYearMaxRetracementAssess")
    public String getLastYearMaxRetracementAssess() {
        return lastYearMaxRetracementAssess;
    }

    public void setLastYearMaxRetracementAssess(String lastYearMaxRetracementAssess) {
        this.lastYearMaxRetracementAssess = lastYearMaxRetracementAssess;
    }

    @Basic
    @Column(name = "LastTwoYearMaxRetracementAssess")
    public String getLastTwoYearMaxRetracementAssess() {
        return lastTwoYearMaxRetracementAssess;
    }

    public void setLastTwoYearMaxRetracementAssess(String lastTwoYearMaxRetracementAssess) {
        this.lastTwoYearMaxRetracementAssess = lastTwoYearMaxRetracementAssess;
    }

    @Basic
    @Column(name = "SIF_YieldSDAssess")
    public String getSifYieldSdAssess() {
        return sifYieldSdAssess;
    }

    public void setSifYieldSdAssess(String sifYieldSdAssess) {
        this.sifYieldSdAssess = sifYieldSdAssess;
    }

    @Basic
    @Column(name = "RiskResistanceScore")
    public Double getRiskResistanceScore() {
        return riskResistanceScore;
    }

    public void setRiskResistanceScore(Double riskResistanceScore) {
        this.riskResistanceScore = riskResistanceScore;
    }

    @Basic
    @Column(name = "StockAbilityScore")
    public Double getStockAbilityScore() {
        return stockAbilityScore;
    }

    public void setStockAbilityScore(Double stockAbilityScore) {
        this.stockAbilityScore = stockAbilityScore;
    }

    @Basic
    @Column(name = "TimeAbilityScore")
    public Double getTimeAbilityScore() {
        return timeAbilityScore;
    }

    public void setTimeAbilityScore(Double timeAbilityScore) {
        this.timeAbilityScore = timeAbilityScore;
    }

    @Basic
    @Column(name = "ExperienceScore")
    public Double getExperienceScore() {
        return experienceScore;
    }

    public void setExperienceScore(Double experienceScore) {
        this.experienceScore = experienceScore;
    }

    @Basic
    @Column(name = "ProfitabilityScore")
    public Double getProfitabilityScore() {
        return profitabilityScore;
    }

    public void setProfitabilityScore(Double profitabilityScore) {
        this.profitabilityScore = profitabilityScore;
    }

    @Basic
    @Column(name = "fundCount")
    public Double getFundCount() {
        return fundCount;
    }

    public void setFundCount(Double fundCount) {
        this.fundCount = fundCount;
    }

    @Basic
    @Column(name = "StockAbilityScoreSAverage")
    public Double getStockAbilityScoreSAverage() {
        return stockAbilityScoreSAverage;
    }

    public void setStockAbilityScoreSAverage(Double stockAbilityScoreSAverage) {
        this.stockAbilityScoreSAverage = stockAbilityScoreSAverage;
    }

    @Basic
    @Column(name = "TimeAbilityScoreSAverage")
    public Double getTimeAbilityScoreSAverage() {
        return timeAbilityScoreSAverage;
    }

    public void setTimeAbilityScoreSAverage(Double timeAbilityScoreSAverage) {
        this.timeAbilityScoreSAverage = timeAbilityScoreSAverage;
    }

    @Basic
    @Column(name = "ExperienceTimeSAverage")
    public Double getExperienceTimeSAverage() {
        return experienceTimeSAverage;
    }

    public void setExperienceTimeSAverage(Double experienceTimeSAverage) {
        this.experienceTimeSAverage = experienceTimeSAverage;
    }

    @Basic
    @Column(name = "ExperienceScoreSAverage")
    public Double getExperienceScoreSAverage() {
        return experienceScoreSAverage;
    }

    public void setExperienceScoreSAverage(Double experienceScoreSAverage) {
        this.experienceScoreSAverage = experienceScoreSAverage;
    }

    @Basic
    @Column(name = "ProfitabilityYieldSAverage")
    public Double getProfitabilityYieldSAverage() {
        return profitabilityYieldSAverage;
    }

    public void setProfitabilityYieldSAverage(Double profitabilityYieldSAverage) {
        this.profitabilityYieldSAverage = profitabilityYieldSAverage;
    }

    @Basic
    @Column(name = "ProfitabilityScoreSAverage")
    public String getProfitabilityScoreSAverage() {
        return profitabilityScoreSAverage;
    }

    public void setProfitabilityScoreSAverage(String profitabilityScoreSAverage) {
        this.profitabilityScoreSAverage = profitabilityScoreSAverage;
    }

    @Basic
    @Column(name = "StockAbilityScoreSRanking")
    public String getStockAbilityScoreSRanking() {
        return stockAbilityScoreSRanking;
    }

    public void setStockAbilityScoreSRanking(String stockAbilityScoreSRanking) {
        this.stockAbilityScoreSRanking = stockAbilityScoreSRanking;
    }

    @Basic
    @Column(name = "TimeAbilityScoreSRanking")
    public String getTimeAbilityScoreSRanking() {
        return timeAbilityScoreSRanking;
    }

    public void setTimeAbilityScoreSRanking(String timeAbilityScoreSRanking) {
        this.timeAbilityScoreSRanking = timeAbilityScoreSRanking;
    }

    @Basic
    @Column(name = "ExperienceTimeSRanking")
    public String getExperienceTimeSRanking() {
        return experienceTimeSRanking;
    }

    public void setExperienceTimeSRanking(String experienceTimeSRanking) {
        this.experienceTimeSRanking = experienceTimeSRanking;
    }

    @Basic
    @Column(name = "ProfitabilityScoreSRanking")
    public String getProfitabilityScoreSRanking() {
        return profitabilityScoreSRanking;
    }

    public void setProfitabilityScoreSRanking(String profitabilityScoreSRanking) {
        this.profitabilityScoreSRanking = profitabilityScoreSRanking;
    }

    @Basic
    @Column(name = "StockAbilityScoreAssess")
    public String getStockAbilityScoreAssess() {
        return stockAbilityScoreAssess;
    }

    public void setStockAbilityScoreAssess(String stockAbilityScoreAssess) {
        this.stockAbilityScoreAssess = stockAbilityScoreAssess;
    }

    @Basic
    @Column(name = "TimeAbilityScoreAssess")
    public String getTimeAbilityScoreAssess() {
        return timeAbilityScoreAssess;
    }

    public void setTimeAbilityScoreAssess(String timeAbilityScoreAssess) {
        this.timeAbilityScoreAssess = timeAbilityScoreAssess;
    }

    @Basic
    @Column(name = "RiskResistanceAssess")
    public String getRiskResistanceAssess() {
        return riskResistanceAssess;
    }

    public void setRiskResistanceAssess(String riskResistanceAssess) {
        this.riskResistanceAssess = riskResistanceAssess;
    }

    @Basic
    @Column(name = "ExperienceTimeAssess")
    public String getExperienceTimeAssess() {
        return experienceTimeAssess;
    }

    public void setExperienceTimeAssess(String experienceTimeAssess) {
        this.experienceTimeAssess = experienceTimeAssess;
    }

    @Basic
    @Column(name = "ExperienceTimeAssessLevel")
    public String getExperienceTimeAssessLevel() {
        return experienceTimeAssessLevel;
    }

    public void setExperienceTimeAssessLevel(String experienceTimeAssessLevel) {
        this.experienceTimeAssessLevel = experienceTimeAssessLevel;
    }

    @Basic
    @Column(name = "ProfitabilityScoreAssess")
    public String getProfitabilityScoreAssess() {
        return profitabilityScoreAssess;
    }

    public void setProfitabilityScoreAssess(String profitabilityScoreAssess) {
        this.profitabilityScoreAssess = profitabilityScoreAssess;
    }

    @Basic
    @Column(name = "YTD_CompanySFundYield")
    public Double getYtdCompanySFundYield() {
        return ytdCompanySFundYield;
    }

    public void setYtdCompanySFundYield(Double ytdCompanySFundYield) {
        this.ytdCompanySFundYield = ytdCompanySFundYield;
    }

    @Basic
    @Column(name = "LastYearCompanySFundYield")
    public Double getLastYearCompanySFundYield() {
        return lastYearCompanySFundYield;
    }

    public void setLastYearCompanySFundYield(Double lastYearCompanySFundYield) {
        this.lastYearCompanySFundYield = lastYearCompanySFundYield;
    }

    @Basic
    @Column(name = "LastTwoYearCompanySFundYield")
    public Double getLastTwoYearCompanySFundYield() {
        return lastTwoYearCompanySFundYield;
    }

    public void setLastTwoYearCompanySFundYield(Double lastTwoYearCompanySFundYield) {
        this.lastTwoYearCompanySFundYield = lastTwoYearCompanySFundYield;
    }

    @Basic
    @Column(name = "YTD_SFundYield")
    public Double getYtdSFundYield() {
        return ytdSFundYield;
    }

    public void setYtdSFundYield(Double ytdSFundYield) {
        this.ytdSFundYield = ytdSFundYield;
    }

    @Basic
    @Column(name = "LastYearSFundYield")
    public Double getLastYearSFundYield() {
        return lastYearSFundYield;
    }

    public void setLastYearSFundYield(Double lastYearSFundYield) {
        this.lastYearSFundYield = lastYearSFundYield;
    }

    @Basic
    @Column(name = "LastTwoYearSFundYield")
    public Double getLastTwoYearSFundYield() {
        return lastTwoYearSFundYield;
    }

    public void setLastTwoYearSFundYield(Double lastTwoYearSFundYield) {
        this.lastTwoYearSFundYield = lastTwoYearSFundYield;
    }

    @Basic
    @Column(name = "YTD_CompanySRanking")
    public String getYtdCompanySRanking() {
        return ytdCompanySRanking;
    }

    public void setYtdCompanySRanking(String ytdCompanySRanking) {
        this.ytdCompanySRanking = ytdCompanySRanking;
    }

    @Basic
    @Column(name = "YTD_CompanySScore")
    public BigDecimal getYtdCompanySScore() {
        return ytdCompanySScore;
    }

    public void setYtdCompanySScore(BigDecimal ytdCompanySScore) {
        this.ytdCompanySScore = ytdCompanySScore;
    }

    @Basic
    @Column(name = "LastYearCompanySRanking")
    public String getLastYearCompanySRanking() {
        return lastYearCompanySRanking;
    }

    public void setLastYearCompanySRanking(String lastYearCompanySRanking) {
        this.lastYearCompanySRanking = lastYearCompanySRanking;
    }

    @Basic
    @Column(name = "LastYearCompanySScore")
    public BigDecimal getLastYearCompanySScore() {
        return lastYearCompanySScore;
    }

    public void setLastYearCompanySScore(BigDecimal lastYearCompanySScore) {
        this.lastYearCompanySScore = lastYearCompanySScore;
    }

    @Basic
    @Column(name = "LastTwoYearCompanySRanking")
    public String getLastTwoYearCompanySRanking() {
        return lastTwoYearCompanySRanking;
    }

    public void setLastTwoYearCompanySRanking(String lastTwoYearCompanySRanking) {
        this.lastTwoYearCompanySRanking = lastTwoYearCompanySRanking;
    }

    @Basic
    @Column(name = "LastTwoYearCompanySScore")
    public BigDecimal getLastTwoYearCompanySScore() {
        return lastTwoYearCompanySScore;
    }

    public void setLastTwoYearCompanySScore(BigDecimal lastTwoYearCompanySScore) {
        this.lastTwoYearCompanySScore = lastTwoYearCompanySScore;
    }

    @Basic
    @Column(name = "FundCompanyScale")
    public Double getFundCompanyScale() {
        return fundCompanyScale;
    }

    public void setFundCompanyScale(Double fundCompanyScale) {
        this.fundCompanyScale = fundCompanyScale;
    }

    @Basic
    @Column(name = "FundCompanyAverageScale")
    public Double getFundCompanyAverageScale() {
        return fundCompanyAverageScale;
    }

    public void setFundCompanyAverageScale(Double fundCompanyAverageScale) {
        this.fundCompanyAverageScale = fundCompanyAverageScale;
    }

    @Basic
    @Column(name = "FundCompanyScaleSRanking")
    public String getFundCompanyScaleSRanking() {
        return fundCompanyScaleSRanking;
    }

    public void setFundCompanyScaleSRanking(String fundCompanyScaleSRanking) {
        this.fundCompanyScaleSRanking = fundCompanyScaleSRanking;
    }

    @Basic
    @Column(name = "FundCompanyScaleSAssess")
    public String getFundCompanyScaleSAssess() {
        return fundCompanyScaleSAssess;
    }

    public void setFundCompanyScaleSAssess(String fundCompanyScaleSAssess) {
        this.fundCompanyScaleSAssess = fundCompanyScaleSAssess;
    }

    @Basic
    @Column(name = "FundCompanyScaleSScore")
    public BigDecimal getFundCompanyScaleSScore() {
        return fundCompanyScaleSScore;
    }

    public void setFundCompanyScaleSScore(BigDecimal fundCompanyScaleSScore) {
        this.fundCompanyScaleSScore = fundCompanyScaleSScore;
    }

    @Basic
    @Column(name = "YTD_CompanySFundYieldAssess")
    public String getYtdCompanySFundYieldAssess() {
        return ytdCompanySFundYieldAssess;
    }

    public void setYtdCompanySFundYieldAssess(String ytdCompanySFundYieldAssess) {
        this.ytdCompanySFundYieldAssess = ytdCompanySFundYieldAssess;
    }

    @Basic
    @Column(name = "LastYearCompanySFundYieldAssess")
    public String getLastYearCompanySFundYieldAssess() {
        return lastYearCompanySFundYieldAssess;
    }

    public void setLastYearCompanySFundYieldAssess(String lastYearCompanySFundYieldAssess) {
        this.lastYearCompanySFundYieldAssess = lastYearCompanySFundYieldAssess;
    }

    @Basic
    @Column(name = "LastTwoYearCompanySFundYieldAssess")
    public String getLastTwoYearCompanySFundYieldAssess() {
        return lastTwoYearCompanySFundYieldAssess;
    }

    public void setLastTwoYearCompanySFundYieldAssess(String lastTwoYearCompanySFundYieldAssess) {
        this.lastTwoYearCompanySFundYieldAssess = lastTwoYearCompanySFundYieldAssess;
    }

    @Basic
    @Column(name = "FundCompanyYieldAssess")
    public String getFundCompanyYieldAssess() {
        return fundCompanyYieldAssess;
    }

    public void setFundCompanyYieldAssess(String fundCompanyYieldAssess) {
        this.fundCompanyYieldAssess = fundCompanyYieldAssess;
    }

    @Basic
    @Column(name = "FundCompanyYieldStar")
    public String getFundCompanyYieldStar() {
        return fundCompanyYieldStar;
    }

    public void setFundCompanyYieldStar(String fundCompanyYieldStar) {
        this.fundCompanyYieldStar = fundCompanyYieldStar;
    }

    @Basic
    @Column(name = "FundCompanyMGNum")
    public Integer getFundCompanyMgNum() {
        return fundCompanyMgNum;
    }

    public void setFundCompanyMgNum(Integer fundCompanyMgNum) {
        this.fundCompanyMgNum = fundCompanyMgNum;
    }

    @Basic
    @Column(name = "FundCompanyMGNumRankScore")
    public BigDecimal getFundCompanyMgNumRankScore() {
        return fundCompanyMgNumRankScore;
    }

    public void setFundCompanyMgNumRankScore(BigDecimal fundCompanyMgNumRankScore) {
        this.fundCompanyMgNumRankScore = fundCompanyMgNumRankScore;
    }

    @Basic
    @Column(name = "startDate")
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "FundScale")
    public Double getFundScale() {
        return fundScale;
    }

    public void setFundScale(Double fundScale) {
        this.fundScale = fundScale;
    }

    @Basic
    @Column(name = "isFreeAnalysis")
    public String getIsFreeAnalysis() {
        return isFreeAnalysis;
    }

    public void setIsFreeAnalysis(String isFreeAnalysis) {
        this.isFreeAnalysis = isFreeAnalysis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FundanalysisNew that = (FundanalysisNew) o;
        return Objects.equals(fundCode, that.fundCode) &&
                Objects.equals(fundName, that.fundName) &&
                Objects.equals(fundStatusMark, that.fundStatusMark) &&
                Objects.equals(fundTyp1, that.fundTyp1) &&
                Objects.equals(fundTyp2, that.fundTyp2) &&
                Objects.equals(fundCompanyNameSimple, that.fundCompanyNameSimple) &&
                Objects.equals(manager1, that.manager1) &&
                Objects.equals(performanceScore, that.performanceScore) &&
                Objects.equals(riskScore, that.riskScore) &&
                Objects.equals(managerScore, that.managerScore) &&
                Objects.equals(fundCompanyScore, that.fundCompanyScore) &&
                Objects.equals(integratedScore, that.integratedScore) &&
                Objects.equals(integratedScoreSRanking, that.integratedScoreSRanking) &&
                Objects.equals(integratedAssess, that.integratedAssess) &&
                Objects.equals(performanceAssess, that.performanceAssess) &&
                Objects.equals(riskAssess, that.riskAssess) &&
                Objects.equals(managerAssess, that.managerAssess) &&
                Objects.equals(fundCompanyAssess, that.fundCompanyAssess) &&
                Objects.equals(integratedScoreAdvice, that.integratedScoreAdvice) &&
                Objects.equals(performanceScoreAdvice, that.performanceScoreAdvice) &&
                Objects.equals(riskScoreAdvice, that.riskScoreAdvice) &&
                Objects.equals(managerScoreAdvice, that.managerScoreAdvice) &&
                Objects.equals(fundCompanyScoreAdvice, that.fundCompanyScoreAdvice) &&
                Objects.equals(performanceRank, that.performanceRank) &&
                Objects.equals(riskRank, that.riskRank) &&
                Objects.equals(managerRank, that.managerRank) &&
                Objects.equals(fundCompanyRank, that.fundCompanyRank) &&
                Objects.equals(ytdYield, that.ytdYield) &&
                Objects.equals(lastYearYield, that.lastYearYield) &&
                Objects.equals(lastTwoYearYield, that.lastTwoYearYield) &&
                Objects.equals(ytdYieldSAverage, that.ytdYieldSAverage) &&
                Objects.equals(lastYearYieldSAverage, that.lastYearYieldSAverage) &&
                Objects.equals(lastTwoYearYieldSAverage, that.lastTwoYearYieldSAverage) &&
                Objects.equals(ytdBjjz, that.ytdBjjz) &&
                Objects.equals(lastYearBjjz, that.lastYearBjjz) &&
                Objects.equals(lastTwoYearBjjz, that.lastTwoYearBjjz) &&
                Objects.equals(ytdYieldAllMarket, that.ytdYieldAllMarket) &&
                Objects.equals(lastYearYieldAllMarket, that.lastYearYieldAllMarket) &&
                Objects.equals(lastTwoYearYieldAllMarket, that.lastTwoYearYieldAllMarket) &&
                Objects.equals(ytdYieldTclScore, that.ytdYieldTclScore) &&
                Objects.equals(ytdYieldQscScore, that.ytdYieldQscScore) &&
                Objects.equals(lastYieldTclScore, that.lastYieldTclScore) &&
                Objects.equals(lastYieldQscScore, that.lastYieldQscScore) &&
                Objects.equals(lastTwoYieldTclScore, that.lastTwoYieldTclScore) &&
                Objects.equals(lastTwoYieldQscScore, that.lastTwoYieldQscScore) &&
                Objects.equals(ytdSRanking, that.ytdSRanking) &&
                Objects.equals(ytdSRankingScore, that.ytdSRankingScore) &&
                Objects.equals(lastYearSRanking, that.lastYearSRanking) &&
                Objects.equals(lastYearSRankingScore, that.lastYearSRankingScore) &&
                Objects.equals(lastTwoYearSRanking, that.lastTwoYearSRanking) &&
                Objects.equals(lastTwoYearSRankingScore, that.lastTwoYearSRankingScore) &&
                Objects.equals(ytdYieldAssess, that.ytdYieldAssess) &&
                Objects.equals(lastYearYieldAssess, that.lastYearYieldAssess) &&
                Objects.equals(lastTwoYearYieldAssess, that.lastTwoYearYieldAssess) &&
                Objects.equals(ytdMaxRetracement, that.ytdMaxRetracement) &&
                Objects.equals(lastYearMaxRetracement, that.lastYearMaxRetracement) &&
                Objects.equals(lastTwoYearMaxRetracement, that.lastTwoYearMaxRetracement) &&
                Objects.equals(ytdMaxRetracementSAverage, that.ytdMaxRetracementSAverage) &&
                Objects.equals(lastYearMaxRetracementSAverage, that.lastYearMaxRetracementSAverage) &&
                Objects.equals(lastTwoYearMaxRetracementSAverage, that.lastTwoYearMaxRetracementSAverage) &&
                Objects.equals(ytdMaxRetracementSRanking, that.ytdMaxRetracementSRanking) &&
                Objects.equals(ytdMaxRetracementSScore, that.ytdMaxRetracementSScore) &&
                Objects.equals(lastYearMaxRetracementSRanking, that.lastYearMaxRetracementSRanking) &&
                Objects.equals(lastYearMaxRetracementSScore, that.lastYearMaxRetracementSScore) &&
                Objects.equals(lastTwoYearMaxRetracementSRanking, that.lastTwoYearMaxRetracementSRanking) &&
                Objects.equals(lastTwoYearMaxRetracementSScore, that.lastTwoYearMaxRetracementSScore) &&
                Objects.equals(sifYieldSd, that.sifYieldSd) &&
                Objects.equals(sifYieldSdsAverage, that.sifYieldSdsAverage) &&
                Objects.equals(sifYieldSdsRanking, that.sifYieldSdsRanking) &&
                Objects.equals(sifYieldSdsScore, that.sifYieldSdsScore) &&
                Objects.equals(ytdMaxRetracementAssess, that.ytdMaxRetracementAssess) &&
                Objects.equals(lastYearMaxRetracementAssess, that.lastYearMaxRetracementAssess) &&
                Objects.equals(lastTwoYearMaxRetracementAssess, that.lastTwoYearMaxRetracementAssess) &&
                Objects.equals(sifYieldSdAssess, that.sifYieldSdAssess) &&
                Objects.equals(riskResistanceScore, that.riskResistanceScore) &&
                Objects.equals(stockAbilityScore, that.stockAbilityScore) &&
                Objects.equals(timeAbilityScore, that.timeAbilityScore) &&
                Objects.equals(experienceScore, that.experienceScore) &&
                Objects.equals(profitabilityScore, that.profitabilityScore) &&
                Objects.equals(fundCount, that.fundCount) &&
                Objects.equals(stockAbilityScoreSAverage, that.stockAbilityScoreSAverage) &&
                Objects.equals(timeAbilityScoreSAverage, that.timeAbilityScoreSAverage) &&
                Objects.equals(experienceTimeSAverage, that.experienceTimeSAverage) &&
                Objects.equals(experienceScoreSAverage, that.experienceScoreSAverage) &&
                Objects.equals(profitabilityYieldSAverage, that.profitabilityYieldSAverage) &&
                Objects.equals(profitabilityScoreSAverage, that.profitabilityScoreSAverage) &&
                Objects.equals(stockAbilityScoreSRanking, that.stockAbilityScoreSRanking) &&
                Objects.equals(timeAbilityScoreSRanking, that.timeAbilityScoreSRanking) &&
                Objects.equals(experienceTimeSRanking, that.experienceTimeSRanking) &&
                Objects.equals(profitabilityScoreSRanking, that.profitabilityScoreSRanking) &&
                Objects.equals(stockAbilityScoreAssess, that.stockAbilityScoreAssess) &&
                Objects.equals(timeAbilityScoreAssess, that.timeAbilityScoreAssess) &&
                Objects.equals(riskResistanceAssess, that.riskResistanceAssess) &&
                Objects.equals(experienceTimeAssess, that.experienceTimeAssess) &&
                Objects.equals(experienceTimeAssessLevel, that.experienceTimeAssessLevel) &&
                Objects.equals(profitabilityScoreAssess, that.profitabilityScoreAssess) &&
                Objects.equals(ytdCompanySFundYield, that.ytdCompanySFundYield) &&
                Objects.equals(lastYearCompanySFundYield, that.lastYearCompanySFundYield) &&
                Objects.equals(lastTwoYearCompanySFundYield, that.lastTwoYearCompanySFundYield) &&
                Objects.equals(ytdSFundYield, that.ytdSFundYield) &&
                Objects.equals(lastYearSFundYield, that.lastYearSFundYield) &&
                Objects.equals(lastTwoYearSFundYield, that.lastTwoYearSFundYield) &&
                Objects.equals(ytdCompanySRanking, that.ytdCompanySRanking) &&
                Objects.equals(ytdCompanySScore, that.ytdCompanySScore) &&
                Objects.equals(lastYearCompanySRanking, that.lastYearCompanySRanking) &&
                Objects.equals(lastYearCompanySScore, that.lastYearCompanySScore) &&
                Objects.equals(lastTwoYearCompanySRanking, that.lastTwoYearCompanySRanking) &&
                Objects.equals(lastTwoYearCompanySScore, that.lastTwoYearCompanySScore) &&
                Objects.equals(fundCompanyScale, that.fundCompanyScale) &&
                Objects.equals(fundCompanyAverageScale, that.fundCompanyAverageScale) &&
                Objects.equals(fundCompanyScaleSRanking, that.fundCompanyScaleSRanking) &&
                Objects.equals(fundCompanyScaleSAssess, that.fundCompanyScaleSAssess) &&
                Objects.equals(fundCompanyScaleSScore, that.fundCompanyScaleSScore) &&
                Objects.equals(ytdCompanySFundYieldAssess, that.ytdCompanySFundYieldAssess) &&
                Objects.equals(lastYearCompanySFundYieldAssess, that.lastYearCompanySFundYieldAssess) &&
                Objects.equals(lastTwoYearCompanySFundYieldAssess, that.lastTwoYearCompanySFundYieldAssess) &&
                Objects.equals(fundCompanyYieldAssess, that.fundCompanyYieldAssess) &&
                Objects.equals(fundCompanyYieldStar, that.fundCompanyYieldStar) &&
                Objects.equals(fundCompanyMgNum, that.fundCompanyMgNum) &&
                Objects.equals(fundCompanyMgNumRankScore, that.fundCompanyMgNumRankScore) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(fundScale, that.fundScale) &&
                Objects.equals(isFreeAnalysis, that.isFreeAnalysis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundCode, fundName, fundStatusMark, fundTyp1, fundTyp2, fundCompanyNameSimple, manager1, performanceScore, riskScore, managerScore, fundCompanyScore, integratedScore, integratedScoreSRanking, integratedAssess, performanceAssess, riskAssess, managerAssess, fundCompanyAssess, integratedScoreAdvice, performanceScoreAdvice, riskScoreAdvice, managerScoreAdvice, fundCompanyScoreAdvice, performanceRank, riskRank, managerRank, fundCompanyRank, ytdYield, lastYearYield, lastTwoYearYield, ytdYieldSAverage, lastYearYieldSAverage, lastTwoYearYieldSAverage, ytdBjjz, lastYearBjjz, lastTwoYearBjjz, ytdYieldAllMarket, lastYearYieldAllMarket, lastTwoYearYieldAllMarket, ytdYieldTclScore, ytdYieldQscScore, lastYieldTclScore, lastYieldQscScore, lastTwoYieldTclScore, lastTwoYieldQscScore, ytdSRanking, ytdSRankingScore, lastYearSRanking, lastYearSRankingScore, lastTwoYearSRanking, lastTwoYearSRankingScore, ytdYieldAssess, lastYearYieldAssess, lastTwoYearYieldAssess, ytdMaxRetracement, lastYearMaxRetracement, lastTwoYearMaxRetracement, ytdMaxRetracementSAverage, lastYearMaxRetracementSAverage, lastTwoYearMaxRetracementSAverage, ytdMaxRetracementSRanking, ytdMaxRetracementSScore, lastYearMaxRetracementSRanking, lastYearMaxRetracementSScore, lastTwoYearMaxRetracementSRanking, lastTwoYearMaxRetracementSScore, sifYieldSd, sifYieldSdsAverage, sifYieldSdsRanking, sifYieldSdsScore, ytdMaxRetracementAssess, lastYearMaxRetracementAssess, lastTwoYearMaxRetracementAssess, sifYieldSdAssess, riskResistanceScore, stockAbilityScore, timeAbilityScore, experienceScore, profitabilityScore, fundCount, stockAbilityScoreSAverage, timeAbilityScoreSAverage, experienceTimeSAverage, experienceScoreSAverage, profitabilityYieldSAverage, profitabilityScoreSAverage, stockAbilityScoreSRanking, timeAbilityScoreSRanking, experienceTimeSRanking, profitabilityScoreSRanking, stockAbilityScoreAssess, timeAbilityScoreAssess, riskResistanceAssess, experienceTimeAssess, experienceTimeAssessLevel, profitabilityScoreAssess, ytdCompanySFundYield, lastYearCompanySFundYield, lastTwoYearCompanySFundYield, ytdSFundYield, lastYearSFundYield, lastTwoYearSFundYield, ytdCompanySRanking, ytdCompanySScore, lastYearCompanySRanking, lastYearCompanySScore, lastTwoYearCompanySRanking, lastTwoYearCompanySScore, fundCompanyScale, fundCompanyAverageScale, fundCompanyScaleSRanking, fundCompanyScaleSAssess, fundCompanyScaleSScore, ytdCompanySFundYieldAssess, lastYearCompanySFundYieldAssess, lastTwoYearCompanySFundYieldAssess, fundCompanyYieldAssess, fundCompanyYieldStar, fundCompanyMgNum, fundCompanyMgNumRankScore, startDate, fundScale, isFreeAnalysis);
    }*/

    @Override
    public String toString() {
        return "FundanalysisNew{" +
                "fundCode='" + fundCode + '\'' +
                ", integratedScore=" + integratedScore +
                ", integratedScoreAdvice='" + integratedScoreAdvice + '\'' +
                '}';
    }
}
