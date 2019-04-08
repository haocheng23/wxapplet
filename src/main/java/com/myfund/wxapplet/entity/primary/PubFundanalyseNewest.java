package com.myfund.wxapplet.entity.primary;

import javax.persistence.*;

@Entity
@Table(name = "PUB_FUNDANALYSE_NEWEST")
public class PubFundanalyseNewest {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String fundCode;
  private java.sql.Timestamp dealDate;
  private String fundName;
  private String fundType;
  /*private String startDate;
  private String investStyle;
  private String fundManager;
  private String fundCorp;
  private double unitEquity;
  private double totalEquity;
  private double dayBenefit;
  private double oneYearMaxEquity;
  private double oneYearMinEquity;
  private double oneWeekRedound;
  private double oneWeekRedoundSort;
  private double oneMonthRedound;
  private double oneMonthRedoundSort;
  private double threeMonthRedound;
  private double threeMonthRedoundSort;
  private double sixMonthRedound;
  private double sixMonthRedoundSort;
  private double oneYearRedound;
  private double oneYearRedoundSort;
  private double twoYearRedound;
  private double twoYearRedoundSort;
  private double threeYearRedound;
  private double threeYearRedoundSort;
  private double thisYearRedound;
  private double thisYearRedoundSort;
  private double upToNowRedound;
  private double upToNowRedoundSort;
  private double dateAreaRedound;
  private double dateAreaAverRedound;
  private double surfwaysRedound;
  private double yearRedoundLastSeven;
  private double yearRedoundLastSevenSort;
  private double yearRedoundLastSix;
  private double yearRedoundLastSixSort;
  private double yearRedoundLastFive;
  private double yearRedoundLastFiveSort;
  private double yearRedoundLastFour;
  private double yearRedoundLastFourSort;
  private double yearRedoundLastThree;
  private double yearRedoundLastThreeSort;
  private double yearRedoundLastTwo;
  private double yearRedoundLastTwoSort;
  private double yearRedoundLastOne;
  private double yearRedoundLastOneSort;
  private String surfWayStar;
  private double sharpRate;
  private double lsValue;
  private double tlyRate;
  private double messageRate;
  private double stutzer;
  private double m2Scale;
  private double mcv;
  private double riskValue95;
  private double alphaValue;
  private double betaValue;
  private double marketRelative;
  private double oneYearStdDiff;
  private double mgrPositivity;
  private double grailPanStyle;
  private double styleExcursion;
  private double downRisk;
  private double tMmodel;
  private double hMmodel;
  private double cLmodel;
  private double ctRedound;
  private double assetConfigRatio;
  private double tenStockRatio;
  private double fiveBondRatio;
  private double stockDistribRatio;
  private double bondDistribRatio;
  private double industryDistribRatio;
  private double stockIncomeRatio;
  private double bondIncomeRatio;
  private double currencyIncomeRatio;
  private double otherIncomeRatio;
  private double assetContrib;
  private double totalLot;
  private double totalAsset;
  private double buyAmount;
  private double sellAmount;
  private double onlyBuyAmount;
  private double oneYearRedRate;
  private double oneYearRedTimes;
  private double oneYearRedSum;
  private double upToNowRedRate;
  private double upToNowRedTimes;
  private double totalIncome;
  private double incomeRatio;
  private double payRatio;
  private double unitIncome;
  private double unitFee;
  private double unitEquityIncome;
  private String mFundType;
  private String mSpanTerm;
  private String mDataPeriod;
  private String mPerformStable;
  private String mVariance;
  private String mAlphaValue;
  private String mBetaValue;
  private String mMaxRetrace;
  private String mDateAreaMaxRetrace;
  private String mInfoRatio;
  private String mSharpRatio;
  private String mSimpleYield;
  private String mCtAbility;
  private String mCsAbility;
  private String mTrackError;
  private String mManageFee;
  private String mTrusteeFee;
  private String mMoneyScale;
  private String mMillionIncome;
  private String mFinalScore;
  private double fuQuanUnitEquity;
  private double fuQuanUnitEquityRate;
  @Column(name = "AveYieldSameKind_OneWeek")
  private double aveYieldSameKindOneWeek;
  @Column(name = "AveYieldSameKind_OneMonth")
  private double aveYieldSameKindOneMonth;
  @Column(name = "AveYieldSameKind_ThreeMonth")
  private double aveYieldSameKindThreeMonth;
  @Column(name = "AveYieldSameKind_SixMonth")
  private double aveYieldSameKindSixMonth;
  @Column(name = "AveYieldSameKind_OneYear")
  private double aveYieldSameKindOneYear;
  @Column(name = "AveYieldSameKind_ThreeYear")
  private double aveYieldSameKindThreeYear;
  @Column(name = "AveYieldSameKind_ThisYear")
  private double aveYieldSameKindThisYear;
  @Column(name = "M_MaxRetrace_ThisYear")
  private double mMaxRetraceThisYear;
  private long isDx;
  private long isDt;
  private double unitEquityDenominator;

  @Column(name = "Fund_Status")
  private String fundStatus;
  private String isHotTheme;*/


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getFundCode() {
    return fundCode;
  }

  public void setFundCode(String fundCode) {
    this.fundCode = fundCode;
  }


  public java.sql.Timestamp getDealDate() {
    return dealDate;
  }

  public void setDealDate(java.sql.Timestamp dealDate) {
    this.dealDate = dealDate;
  }


  public String getFundName() {
    return fundName;
  }

  public void setFundName(String fundName) {
    this.fundName = fundName;
  }


  public String getFundType() {
    return fundType;
  }

  public void setFundType(String fundType) {
    this.fundType = fundType;
  }


  /*public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public String getInvestStyle() {
    return investStyle;
  }

  public void setInvestStyle(String investStyle) {
    this.investStyle = investStyle;
  }


  public String getFundManager() {
    return fundManager;
  }

  public void setFundManager(String fundManager) {
    this.fundManager = fundManager;
  }


  public String getFundCorp() {
    return fundCorp;
  }

  public void setFundCorp(String fundCorp) {
    this.fundCorp = fundCorp;
  }


  public double getUnitEquity() {
    return unitEquity;
  }

  public void setUnitEquity(double unitEquity) {
    this.unitEquity = unitEquity;
  }


  public double getTotalEquity() {
    return totalEquity;
  }

  public void setTotalEquity(double totalEquity) {
    this.totalEquity = totalEquity;
  }


  public double getDayBenefit() {
    return dayBenefit;
  }

  public void setDayBenefit(double dayBenefit) {
    this.dayBenefit = dayBenefit;
  }


  public double getOneYearMaxEquity() {
    return oneYearMaxEquity;
  }

  public void setOneYearMaxEquity(double oneYearMaxEquity) {
    this.oneYearMaxEquity = oneYearMaxEquity;
  }


  public double getOneYearMinEquity() {
    return oneYearMinEquity;
  }

  public void setOneYearMinEquity(double oneYearMinEquity) {
    this.oneYearMinEquity = oneYearMinEquity;
  }


  public double getOneWeekRedound() {
    return oneWeekRedound;
  }

  public void setOneWeekRedound(double oneWeekRedound) {
    this.oneWeekRedound = oneWeekRedound;
  }


  public double getOneWeekRedoundSort() {
    return oneWeekRedoundSort;
  }

  public void setOneWeekRedoundSort(double oneWeekRedoundSort) {
    this.oneWeekRedoundSort = oneWeekRedoundSort;
  }


  public double getOneMonthRedound() {
    return oneMonthRedound;
  }

  public void setOneMonthRedound(double oneMonthRedound) {
    this.oneMonthRedound = oneMonthRedound;
  }


  public double getOneMonthRedoundSort() {
    return oneMonthRedoundSort;
  }

  public void setOneMonthRedoundSort(double oneMonthRedoundSort) {
    this.oneMonthRedoundSort = oneMonthRedoundSort;
  }


  public double getThreeMonthRedound() {
    return threeMonthRedound;
  }

  public void setThreeMonthRedound(double threeMonthRedound) {
    this.threeMonthRedound = threeMonthRedound;
  }


  public double getThreeMonthRedoundSort() {
    return threeMonthRedoundSort;
  }

  public void setThreeMonthRedoundSort(double threeMonthRedoundSort) {
    this.threeMonthRedoundSort = threeMonthRedoundSort;
  }


  public double getSixMonthRedound() {
    return sixMonthRedound;
  }

  public void setSixMonthRedound(double sixMonthRedound) {
    this.sixMonthRedound = sixMonthRedound;
  }


  public double getSixMonthRedoundSort() {
    return sixMonthRedoundSort;
  }

  public void setSixMonthRedoundSort(double sixMonthRedoundSort) {
    this.sixMonthRedoundSort = sixMonthRedoundSort;
  }


  public double getOneYearRedound() {
    return oneYearRedound;
  }

  public void setOneYearRedound(double oneYearRedound) {
    this.oneYearRedound = oneYearRedound;
  }


  public double getOneYearRedoundSort() {
    return oneYearRedoundSort;
  }

  public void setOneYearRedoundSort(double oneYearRedoundSort) {
    this.oneYearRedoundSort = oneYearRedoundSort;
  }


  public double getTwoYearRedound() {
    return twoYearRedound;
  }

  public void setTwoYearRedound(double twoYearRedound) {
    this.twoYearRedound = twoYearRedound;
  }


  public double getTwoYearRedoundSort() {
    return twoYearRedoundSort;
  }

  public void setTwoYearRedoundSort(double twoYearRedoundSort) {
    this.twoYearRedoundSort = twoYearRedoundSort;
  }


  public double getThreeYearRedound() {
    return threeYearRedound;
  }

  public void setThreeYearRedound(double threeYearRedound) {
    this.threeYearRedound = threeYearRedound;
  }


  public double getThreeYearRedoundSort() {
    return threeYearRedoundSort;
  }

  public void setThreeYearRedoundSort(double threeYearRedoundSort) {
    this.threeYearRedoundSort = threeYearRedoundSort;
  }


  public double getThisYearRedound() {
    return thisYearRedound;
  }

  public void setThisYearRedound(double thisYearRedound) {
    this.thisYearRedound = thisYearRedound;
  }


  public double getThisYearRedoundSort() {
    return thisYearRedoundSort;
  }

  public void setThisYearRedoundSort(double thisYearRedoundSort) {
    this.thisYearRedoundSort = thisYearRedoundSort;
  }


  public double getUpToNowRedound() {
    return upToNowRedound;
  }

  public void setUpToNowRedound(double upToNowRedound) {
    this.upToNowRedound = upToNowRedound;
  }


  public double getUpToNowRedoundSort() {
    return upToNowRedoundSort;
  }

  public void setUpToNowRedoundSort(double upToNowRedoundSort) {
    this.upToNowRedoundSort = upToNowRedoundSort;
  }


  public double getDateAreaRedound() {
    return dateAreaRedound;
  }

  public void setDateAreaRedound(double dateAreaRedound) {
    this.dateAreaRedound = dateAreaRedound;
  }


  public double getDateAreaAverRedound() {
    return dateAreaAverRedound;
  }

  public void setDateAreaAverRedound(double dateAreaAverRedound) {
    this.dateAreaAverRedound = dateAreaAverRedound;
  }


  public double getSurfwaysRedound() {
    return surfwaysRedound;
  }

  public void setSurfwaysRedound(double surfwaysRedound) {
    this.surfwaysRedound = surfwaysRedound;
  }


  public double getYearRedoundLastSeven() {
    return yearRedoundLastSeven;
  }

  public void setYearRedoundLastSeven(double yearRedoundLastSeven) {
    this.yearRedoundLastSeven = yearRedoundLastSeven;
  }


  public double getYearRedoundLastSevenSort() {
    return yearRedoundLastSevenSort;
  }

  public void setYearRedoundLastSevenSort(double yearRedoundLastSevenSort) {
    this.yearRedoundLastSevenSort = yearRedoundLastSevenSort;
  }


  public double getYearRedoundLastSix() {
    return yearRedoundLastSix;
  }

  public void setYearRedoundLastSix(double yearRedoundLastSix) {
    this.yearRedoundLastSix = yearRedoundLastSix;
  }


  public double getYearRedoundLastSixSort() {
    return yearRedoundLastSixSort;
  }

  public void setYearRedoundLastSixSort(double yearRedoundLastSixSort) {
    this.yearRedoundLastSixSort = yearRedoundLastSixSort;
  }


  public double getYearRedoundLastFive() {
    return yearRedoundLastFive;
  }

  public void setYearRedoundLastFive(double yearRedoundLastFive) {
    this.yearRedoundLastFive = yearRedoundLastFive;
  }


  public double getYearRedoundLastFiveSort() {
    return yearRedoundLastFiveSort;
  }

  public void setYearRedoundLastFiveSort(double yearRedoundLastFiveSort) {
    this.yearRedoundLastFiveSort = yearRedoundLastFiveSort;
  }


  public double getYearRedoundLastFour() {
    return yearRedoundLastFour;
  }

  public void setYearRedoundLastFour(double yearRedoundLastFour) {
    this.yearRedoundLastFour = yearRedoundLastFour;
  }


  public double getYearRedoundLastFourSort() {
    return yearRedoundLastFourSort;
  }

  public void setYearRedoundLastFourSort(double yearRedoundLastFourSort) {
    this.yearRedoundLastFourSort = yearRedoundLastFourSort;
  }


  public double getYearRedoundLastThree() {
    return yearRedoundLastThree;
  }

  public void setYearRedoundLastThree(double yearRedoundLastThree) {
    this.yearRedoundLastThree = yearRedoundLastThree;
  }


  public double getYearRedoundLastThreeSort() {
    return yearRedoundLastThreeSort;
  }

  public void setYearRedoundLastThreeSort(double yearRedoundLastThreeSort) {
    this.yearRedoundLastThreeSort = yearRedoundLastThreeSort;
  }


  public double getYearRedoundLastTwo() {
    return yearRedoundLastTwo;
  }

  public void setYearRedoundLastTwo(double yearRedoundLastTwo) {
    this.yearRedoundLastTwo = yearRedoundLastTwo;
  }


  public double getYearRedoundLastTwoSort() {
    return yearRedoundLastTwoSort;
  }

  public void setYearRedoundLastTwoSort(double yearRedoundLastTwoSort) {
    this.yearRedoundLastTwoSort = yearRedoundLastTwoSort;
  }


  public double getYearRedoundLastOne() {
    return yearRedoundLastOne;
  }

  public void setYearRedoundLastOne(double yearRedoundLastOne) {
    this.yearRedoundLastOne = yearRedoundLastOne;
  }


  public double getYearRedoundLastOneSort() {
    return yearRedoundLastOneSort;
  }

  public void setYearRedoundLastOneSort(double yearRedoundLastOneSort) {
    this.yearRedoundLastOneSort = yearRedoundLastOneSort;
  }


  public String getSurfWayStar() {
    return surfWayStar;
  }

  public void setSurfWayStar(String surfWayStar) {
    this.surfWayStar = surfWayStar;
  }


  public double getSharpRate() {
    return sharpRate;
  }

  public void setSharpRate(double sharpRate) {
    this.sharpRate = sharpRate;
  }


  public double getLsValue() {
    return lsValue;
  }

  public void setLsValue(double lsValue) {
    this.lsValue = lsValue;
  }


  public double getTlyRate() {
    return tlyRate;
  }

  public void setTlyRate(double tlyRate) {
    this.tlyRate = tlyRate;
  }


  public double getMessageRate() {
    return messageRate;
  }

  public void setMessageRate(double messageRate) {
    this.messageRate = messageRate;
  }


  public double getStutzer() {
    return stutzer;
  }

  public void setStutzer(double stutzer) {
    this.stutzer = stutzer;
  }


  public double getM2Scale() {
    return m2Scale;
  }

  public void setM2Scale(double m2Scale) {
    this.m2Scale = m2Scale;
  }


  public double getMcv() {
    return mcv;
  }

  public void setMcv(double mcv) {
    this.mcv = mcv;
  }


  public double getRiskValue95() {
    return riskValue95;
  }

  public void setRiskValue95(double riskValue95) {
    this.riskValue95 = riskValue95;
  }


  public double getAlphaValue() {
    return alphaValue;
  }

  public void setAlphaValue(double alphaValue) {
    this.alphaValue = alphaValue;
  }


  public double getBetaValue() {
    return betaValue;
  }

  public void setBetaValue(double betaValue) {
    this.betaValue = betaValue;
  }


  public double getMarketRelative() {
    return marketRelative;
  }

  public void setMarketRelative(double marketRelative) {
    this.marketRelative = marketRelative;
  }


  public double getOneYearStdDiff() {
    return oneYearStdDiff;
  }

  public void setOneYearStdDiff(double oneYearStdDiff) {
    this.oneYearStdDiff = oneYearStdDiff;
  }


  public double getMgrPositivity() {
    return mgrPositivity;
  }

  public void setMgrPositivity(double mgrPositivity) {
    this.mgrPositivity = mgrPositivity;
  }


  public double getGrailPanStyle() {
    return grailPanStyle;
  }

  public void setGrailPanStyle(double grailPanStyle) {
    this.grailPanStyle = grailPanStyle;
  }


  public double getStyleExcursion() {
    return styleExcursion;
  }

  public void setStyleExcursion(double styleExcursion) {
    this.styleExcursion = styleExcursion;
  }


  public double getDownRisk() {
    return downRisk;
  }

  public void setDownRisk(double downRisk) {
    this.downRisk = downRisk;
  }


  public double getTMmodel() {
    return tMmodel;
  }

  public void setTMmodel(double tMmodel) {
    this.tMmodel = tMmodel;
  }


  public double getHMmodel() {
    return hMmodel;
  }

  public void setHMmodel(double hMmodel) {
    this.hMmodel = hMmodel;
  }


  public double getCLmodel() {
    return cLmodel;
  }

  public void setCLmodel(double cLmodel) {
    this.cLmodel = cLmodel;
  }


  public double getCtRedound() {
    return ctRedound;
  }

  public void setCtRedound(double ctRedound) {
    this.ctRedound = ctRedound;
  }


  public double getAssetConfigRatio() {
    return assetConfigRatio;
  }

  public void setAssetConfigRatio(double assetConfigRatio) {
    this.assetConfigRatio = assetConfigRatio;
  }


  public double getTenStockRatio() {
    return tenStockRatio;
  }

  public void setTenStockRatio(double tenStockRatio) {
    this.tenStockRatio = tenStockRatio;
  }


  public double getFiveBondRatio() {
    return fiveBondRatio;
  }

  public void setFiveBondRatio(double fiveBondRatio) {
    this.fiveBondRatio = fiveBondRatio;
  }


  public double getStockDistribRatio() {
    return stockDistribRatio;
  }

  public void setStockDistribRatio(double stockDistribRatio) {
    this.stockDistribRatio = stockDistribRatio;
  }


  public double getBondDistribRatio() {
    return bondDistribRatio;
  }

  public void setBondDistribRatio(double bondDistribRatio) {
    this.bondDistribRatio = bondDistribRatio;
  }


  public double getIndustryDistribRatio() {
    return industryDistribRatio;
  }

  public void setIndustryDistribRatio(double industryDistribRatio) {
    this.industryDistribRatio = industryDistribRatio;
  }


  public double getStockIncomeRatio() {
    return stockIncomeRatio;
  }

  public void setStockIncomeRatio(double stockIncomeRatio) {
    this.stockIncomeRatio = stockIncomeRatio;
  }


  public double getBondIncomeRatio() {
    return bondIncomeRatio;
  }

  public void setBondIncomeRatio(double bondIncomeRatio) {
    this.bondIncomeRatio = bondIncomeRatio;
  }


  public double getCurrencyIncomeRatio() {
    return currencyIncomeRatio;
  }

  public void setCurrencyIncomeRatio(double currencyIncomeRatio) {
    this.currencyIncomeRatio = currencyIncomeRatio;
  }


  public double getOtherIncomeRatio() {
    return otherIncomeRatio;
  }

  public void setOtherIncomeRatio(double otherIncomeRatio) {
    this.otherIncomeRatio = otherIncomeRatio;
  }


  public double getAssetContrib() {
    return assetContrib;
  }

  public void setAssetContrib(double assetContrib) {
    this.assetContrib = assetContrib;
  }


  public double getTotalLot() {
    return totalLot;
  }

  public void setTotalLot(double totalLot) {
    this.totalLot = totalLot;
  }


  public double getTotalAsset() {
    return totalAsset;
  }

  public void setTotalAsset(double totalAsset) {
    this.totalAsset = totalAsset;
  }


  public double getBuyAmount() {
    return buyAmount;
  }

  public void setBuyAmount(double buyAmount) {
    this.buyAmount = buyAmount;
  }


  public double getSellAmount() {
    return sellAmount;
  }

  public void setSellAmount(double sellAmount) {
    this.sellAmount = sellAmount;
  }


  public double getOnlyBuyAmount() {
    return onlyBuyAmount;
  }

  public void setOnlyBuyAmount(double onlyBuyAmount) {
    this.onlyBuyAmount = onlyBuyAmount;
  }


  public double getOneYearRedRate() {
    return oneYearRedRate;
  }

  public void setOneYearRedRate(double oneYearRedRate) {
    this.oneYearRedRate = oneYearRedRate;
  }


  public double getOneYearRedTimes() {
    return oneYearRedTimes;
  }

  public void setOneYearRedTimes(double oneYearRedTimes) {
    this.oneYearRedTimes = oneYearRedTimes;
  }


  public double getOneYearRedSum() {
    return oneYearRedSum;
  }

  public void setOneYearRedSum(double oneYearRedSum) {
    this.oneYearRedSum = oneYearRedSum;
  }


  public double getUpToNowRedRate() {
    return upToNowRedRate;
  }

  public void setUpToNowRedRate(double upToNowRedRate) {
    this.upToNowRedRate = upToNowRedRate;
  }


  public double getUpToNowRedTimes() {
    return upToNowRedTimes;
  }

  public void setUpToNowRedTimes(double upToNowRedTimes) {
    this.upToNowRedTimes = upToNowRedTimes;
  }


  public double getTotalIncome() {
    return totalIncome;
  }

  public void setTotalIncome(double totalIncome) {
    this.totalIncome = totalIncome;
  }


  public double getIncomeRatio() {
    return incomeRatio;
  }

  public void setIncomeRatio(double incomeRatio) {
    this.incomeRatio = incomeRatio;
  }


  public double getPayRatio() {
    return payRatio;
  }

  public void setPayRatio(double payRatio) {
    this.payRatio = payRatio;
  }


  public double getUnitIncome() {
    return unitIncome;
  }

  public void setUnitIncome(double unitIncome) {
    this.unitIncome = unitIncome;
  }


  public double getUnitFee() {
    return unitFee;
  }

  public void setUnitFee(double unitFee) {
    this.unitFee = unitFee;
  }


  public double getUnitEquityIncome() {
    return unitEquityIncome;
  }

  public void setUnitEquityIncome(double unitEquityIncome) {
    this.unitEquityIncome = unitEquityIncome;
  }


  public String getMFundType() {
    return mFundType;
  }

  public void setMFundType(String mFundType) {
    this.mFundType = mFundType;
  }


  public String getMSpanTerm() {
    return mSpanTerm;
  }

  public void setMSpanTerm(String mSpanTerm) {
    this.mSpanTerm = mSpanTerm;
  }


  public String getMDataPeriod() {
    return mDataPeriod;
  }

  public void setMDataPeriod(String mDataPeriod) {
    this.mDataPeriod = mDataPeriod;
  }


  public String getMPerformStable() {
    return mPerformStable;
  }

  public void setMPerformStable(String mPerformStable) {
    this.mPerformStable = mPerformStable;
  }


  public String getMVariance() {
    return mVariance;
  }

  public void setMVariance(String mVariance) {
    this.mVariance = mVariance;
  }


  public String getMAlphaValue() {
    return mAlphaValue;
  }

  public void setMAlphaValue(String mAlphaValue) {
    this.mAlphaValue = mAlphaValue;
  }


  public String getMBetaValue() {
    return mBetaValue;
  }

  public void setMBetaValue(String mBetaValue) {
    this.mBetaValue = mBetaValue;
  }


  public String getMMaxRetrace() {
    return mMaxRetrace;
  }

  public void setMMaxRetrace(String mMaxRetrace) {
    this.mMaxRetrace = mMaxRetrace;
  }


  public String getMDateAreaMaxRetrace() {
    return mDateAreaMaxRetrace;
  }

  public void setMDateAreaMaxRetrace(String mDateAreaMaxRetrace) {
    this.mDateAreaMaxRetrace = mDateAreaMaxRetrace;
  }


  public String getMInfoRatio() {
    return mInfoRatio;
  }

  public void setMInfoRatio(String mInfoRatio) {
    this.mInfoRatio = mInfoRatio;
  }


  public String getMSharpRatio() {
    return mSharpRatio;
  }

  public void setMSharpRatio(String mSharpRatio) {
    this.mSharpRatio = mSharpRatio;
  }


  public String getMSimpleYield() {
    return mSimpleYield;
  }

  public void setMSimpleYield(String mSimpleYield) {
    this.mSimpleYield = mSimpleYield;
  }


  public String getMCtAbility() {
    return mCtAbility;
  }

  public void setMCtAbility(String mCtAbility) {
    this.mCtAbility = mCtAbility;
  }


  public String getMCsAbility() {
    return mCsAbility;
  }

  public void setMCsAbility(String mCsAbility) {
    this.mCsAbility = mCsAbility;
  }


  public String getMTrackError() {
    return mTrackError;
  }

  public void setMTrackError(String mTrackError) {
    this.mTrackError = mTrackError;
  }


  public String getMManageFee() {
    return mManageFee;
  }

  public void setMManageFee(String mManageFee) {
    this.mManageFee = mManageFee;
  }


  public String getMTrusteeFee() {
    return mTrusteeFee;
  }

  public void setMTrusteeFee(String mTrusteeFee) {
    this.mTrusteeFee = mTrusteeFee;
  }


  public String getMMoneyScale() {
    return mMoneyScale;
  }

  public void setMMoneyScale(String mMoneyScale) {
    this.mMoneyScale = mMoneyScale;
  }


  public String getMMillionIncome() {
    return mMillionIncome;
  }

  public void setMMillionIncome(String mMillionIncome) {
    this.mMillionIncome = mMillionIncome;
  }


  public String getMFinalScore() {
    return mFinalScore;
  }

  public void setMFinalScore(String mFinalScore) {
    this.mFinalScore = mFinalScore;
  }


  public double getFuQuanUnitEquity() {
    return fuQuanUnitEquity;
  }

  public void setFuQuanUnitEquity(double fuQuanUnitEquity) {
    this.fuQuanUnitEquity = fuQuanUnitEquity;
  }


  public double getFuQuanUnitEquityRate() {
    return fuQuanUnitEquityRate;
  }

  public void setFuQuanUnitEquityRate(double fuQuanUnitEquityRate) {
    this.fuQuanUnitEquityRate = fuQuanUnitEquityRate;
  }


  public double getAveYieldSameKindOneWeek() {
    return aveYieldSameKindOneWeek;
  }

  public void setAveYieldSameKindOneWeek(double aveYieldSameKindOneWeek) {
    this.aveYieldSameKindOneWeek = aveYieldSameKindOneWeek;
  }


  public double getAveYieldSameKindOneMonth() {
    return aveYieldSameKindOneMonth;
  }

  public void setAveYieldSameKindOneMonth(double aveYieldSameKindOneMonth) {
    this.aveYieldSameKindOneMonth = aveYieldSameKindOneMonth;
  }


  public double getAveYieldSameKindThreeMonth() {
    return aveYieldSameKindThreeMonth;
  }

  public void setAveYieldSameKindThreeMonth(double aveYieldSameKindThreeMonth) {
    this.aveYieldSameKindThreeMonth = aveYieldSameKindThreeMonth;
  }


  public double getAveYieldSameKindSixMonth() {
    return aveYieldSameKindSixMonth;
  }

  public void setAveYieldSameKindSixMonth(double aveYieldSameKindSixMonth) {
    this.aveYieldSameKindSixMonth = aveYieldSameKindSixMonth;
  }


  public double getAveYieldSameKindOneYear() {
    return aveYieldSameKindOneYear;
  }

  public void setAveYieldSameKindOneYear(double aveYieldSameKindOneYear) {
    this.aveYieldSameKindOneYear = aveYieldSameKindOneYear;
  }


  public double getAveYieldSameKindThreeYear() {
    return aveYieldSameKindThreeYear;
  }

  public void setAveYieldSameKindThreeYear(double aveYieldSameKindThreeYear) {
    this.aveYieldSameKindThreeYear = aveYieldSameKindThreeYear;
  }


  public double getAveYieldSameKindThisYear() {
    return aveYieldSameKindThisYear;
  }

  public void setAveYieldSameKindThisYear(double aveYieldSameKindThisYear) {
    this.aveYieldSameKindThisYear = aveYieldSameKindThisYear;
  }


  public double getMMaxRetraceThisYear() {
    return mMaxRetraceThisYear;
  }

  public void setMMaxRetraceThisYear(double mMaxRetraceThisYear) {
    this.mMaxRetraceThisYear = mMaxRetraceThisYear;
  }


  public long getIsDx() {
    return isDx;
  }

  public void setIsDx(long isDx) {
    this.isDx = isDx;
  }


  public long getIsDt() {
    return isDt;
  }

  public void setIsDt(long isDt) {
    this.isDt = isDt;
  }


  public double getUnitEquityDenominator() {
    return unitEquityDenominator;
  }

  public void setUnitEquityDenominator(double unitEquityDenominator) {
    this.unitEquityDenominator = unitEquityDenominator;
  }


  public String getFundStatus() {
    return fundStatus;
  }

  public void setFundStatus(String fundStatus) {
    this.fundStatus = fundStatus;
  }


  public String getIsHotTheme() {
    return isHotTheme;
  }

  public void setIsHotTheme(String isHotTheme) {
    this.isHotTheme = isHotTheme;
  }*/


  public PubFundanalyseNewest() {
  }

  @Override
  public String toString() {
    return "{" +
            "id=" + id +
            ", fundCode='" + fundCode + '\'' +
            ", dealDate=" + dealDate +
            ", fundName='" + fundName + '\'' +
            ", fundType='" + fundType + '\'' +
            '}';
  }
}
