package com.myfund.wxapplet.entity.primary;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "PUB_FUNDANALYSE_NEWEST")
public class ZxGuzhiOther{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fundCode;
    private java.sql.Timestamp dealDate;
    private String fundName;
    private String fundType;
    private double thisYearRedound;
    private String UnitEquity;
    private String DayBenefit;

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

    public Timestamp getDealDate() {
        return dealDate;
    }

    public void setDealDate(Timestamp dealDate) {
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

    public double getThisYearRedound() {
        return thisYearRedound;
    }

    public void setThisYearRedound(double thisYearRedound) {
        this.thisYearRedound = thisYearRedound;
    }

    public String getUnitEquity() {
        return UnitEquity;
    }

    public void setUnitEquity(String unitEquity) {
        UnitEquity = unitEquity;
    }

    public String getDayBenefit() {
        return DayBenefit;
    }

    public void setDayBenefit(String dayBenefit) {
        DayBenefit = dayBenefit;
    }

    @Override
    public String toString() {
        return "ZxGuzhiOther{" +
                "id=" + id +
                ", fundCode='" + fundCode + '\'' +
                ", dealDate=" + dealDate +
                ", fundName='" + fundName + '\'' +
                ", fundType='" + fundType + '\'' +
                ", thisYearRedound=" + thisYearRedound +
                ", UnitEquity='" + UnitEquity + '\'' +
                ", DayBenefit='" + DayBenefit + '\'' +
                '}';
    }
}
