package com.fx.deals;

import java.util.List;

public class FXDealValidator {

    public static void validateDeals(List<FXDealRequest> deals) {
        for (FXDealRequest deal : deals) {
            if (deal.getCurrencyPair() == null || deal.getCurrencyPair().isEmpty()) {
                throw new IllegalArgumentException("Currency pair is required");
            }
            if (deal.getAmount() <= 0) {
                throw new IllegalArgumentException("Amount must be positive");
            }
            if (deal.getDealTime() == null) {
                throw new IllegalArgumentException("Deal time is required");
            }
        }
    }
}
