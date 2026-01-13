package com.fx.deals;

import jakarta.persistence.*;

@Entity
@Table(name = "fx_deals")
public class FXDeal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;
    private String currency;

    // Default constructor
    public FXDeal() {}

    // Constructor
    public FXDeal(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }
}
