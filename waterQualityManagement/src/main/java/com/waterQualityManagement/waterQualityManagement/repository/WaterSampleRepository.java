package com.waterQualityManagement.waterQualityManagement.repository;

import com.waterQualityManagement.waterQualityManagement.model.WaterSample;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WaterSampleRepository extends MongoRepository<WaterSample, String> {
}
