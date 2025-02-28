package com.waterQualityManagement.waterQualityManagement.service;

import com.waterQualityManagement.waterQualityManagement.model.QualityCheck;
import org.springframework.stereotype.Service;

@Service
public class QualityCheckService {

    public QualityCheck checkWaterQuality(double pH, double turbidity, double contaminants) {
        QualityCheck check = new QualityCheck();
        check.setSafe(pH >= 6.5 && pH <= 8.5 && turbidity < 5.0 && contaminants < 10.0);
        check.setReason(check.isSafe() ? "Safe" : "Unsafe: Parameters exceed WHO limits");
        return check;
    }
}
