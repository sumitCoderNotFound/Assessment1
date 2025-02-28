package com.waterQualityManagement.waterQualityManagement.model;

import lombok.Data;

@Data
public class QualityCheck {
    private String id;
    private boolean isSafe;
    private String reason;
}
