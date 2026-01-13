package com.fx.deals;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/fx")
public class FXDealController {

    private final FXDealService service;

    public FXDealController(FXDealService service) {
        this.service = service;
    }

    @PostMapping("/import")
    public void importDeals(@RequestBody List<FXDealRequest> deals) {
        FXDealValidator.validateDeals(deals); // التحقق من صحة البيانات
        System.out.println(">>> CONTROLLER HIT, size = " + deals.size());
        service.importDeals(deals);
    }
}
