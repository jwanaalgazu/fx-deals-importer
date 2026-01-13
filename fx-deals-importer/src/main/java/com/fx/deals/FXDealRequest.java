package com.fx.deals;

import java.time.LocalDateTime;

public class FXDealRequest {

    private String currencyPair;
    private double amount;
    private LocalDateTime dealTime;

    // Constructors
    public FXDealRequest() { }

    public FXDealRequest(String currencyPair, double amount, LocalDateTime dealTime) {
        this.currencyPair = currencyPair;
        this.amount = amount;
        this.dealTime = dealTime;
    }

    // Getters
    public String getCurrencyPair() {
        return currencyPair;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getDealTime() {
        return dealTime;
    }

    // Setters
    public void setCurrencyPair(String currencyPair) {
        this.currencyPair = currencyPair;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDealTime(LocalDateTime dealTime) {
        this.dealTime = dealTime;
    }
}
