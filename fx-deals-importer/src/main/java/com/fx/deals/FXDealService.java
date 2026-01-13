package com.fx.deals;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FXDealService {

    public void importDeals(List<FXDealRequest> deals) {
        for (FXDealRequest d : deals) {
            System.out.println("Importing deal: " + d.getCurrencyPair() +
                               ", amount: " + d.getAmount() +
                               ", time: " + d.getDealTime());
            // هنا يمكن إضافة منطق الحفظ في قاعدة البيانات لاحقاً
        }
    }
}
