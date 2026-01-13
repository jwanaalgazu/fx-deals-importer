package com.fx.deals;

public class FXDealResponse {
    private Long id;
    private double amount;
    private String currency;

    public FXDealResponse(Long id, double amount, String currency) {
        this.id = id;
        this.amount = amount;
        this.currency = currency;
    }

    public Long getId() { return id; }
    public double getAmount() { return amount; }
    public String getCurrency() { return currency; }
}
