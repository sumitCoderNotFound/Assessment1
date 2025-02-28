package com.waterQualityManagement.waterQualityManagement.controller;

import com.waterQualityManagement.waterQualityManagement.model.QualityCheck;
import com.waterQualityManagement.waterQualityManagement.service.QualityCheckService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quality")
public class QualityCheckController {

    private final QualityCheckService service;

    public QualityCheckController(QualityCheckService service) {
        this.service = service;
    }

    @GetMapping("/check")
    public QualityCheck checkQuality(@RequestParam double pH, @RequestParam double turbidity, @RequestParam double contaminants) {
        return service.checkWaterQuality(pH, turbidity, contaminants);
    }
}
