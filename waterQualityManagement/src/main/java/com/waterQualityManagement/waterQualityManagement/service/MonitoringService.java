package com.waterQualityManagement.waterQualityManagement.service;

import com.waterQualityManagement.waterQualityManagement.model.WaterSample;
import com.waterQualityManagement.waterQualityManagement.repository.WaterSampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonitoringService {

    @Autowired
    private WaterSampleRepository repository;

    public List<WaterSample> getAllSamples() {
        return repository.findAll();
    }

    public Optional<WaterSample> getSampleById(String id) {
        return repository.findById(id);
    }

    public WaterSample saveSample(WaterSample sample) {
        return repository.save(sample);
    }

    public void deleteSample(String id) {
        repository.deleteById(id);
    }
}
