package com.mock.bean;

import java.io.Serializable;

/**
 * @program: VV-MERCHANTBIZ-WEB
 * @description:
 * @author: fangming.zheng
 * @create: 2019-10-09 16:25
 **/
public class FirstPageStatisticsVO implements Serializable {

    private Integer todayCompletedOrderCount;
    private Integer todaySaleProductCount;

    private String todayIncome;
    private String totalWallet;

    private String currency;
    private String symbol;

    public Integer getTodayCompletedOrderCount() {
        return todayCompletedOrderCount;
    }

    public void setTodayCompletedOrderCount(Integer todayCompletedOrderCount) {
        this.todayCompletedOrderCount = todayCompletedOrderCount;
    }

    public Integer getTodaySaleProductCount() {
        return todaySaleProductCount;
    }

    public void setTodaySaleProductCount(Integer todaySaleProductCount) {
        this.todaySaleProductCount = todaySaleProductCount;
    }

    public String getTodayIncome() {
        return todayIncome;
    }

    public void setTodayIncome(String todayIncome) {
        this.todayIncome = todayIncome;
    }

    public String getTotalWallet() {
        return totalWallet;
    }

    public void setTotalWallet(String totalWallet) {
        this.totalWallet = totalWallet;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
