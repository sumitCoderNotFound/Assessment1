package com.waterQualityManagement.waterQualityManagement.controller;

import com.waterQualityManagement.waterQualityManagement.model.WaterSample;
import com.waterQualityManagement.waterQualityManagement.service.MonitoringService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/monitoring")
@Tag(name = "Water Monitoring API", description = "API for managing water quality samples")
public class MonitoringController {

    @Autowired
    private MonitoringService service;

    @Operation(summary = "Upload a water sample", description = "Adds a new water sample to the database")
    @PostMapping("/upload")
    public WaterSample addSample(@RequestBody WaterSample sample) {
        return service.saveSample(sample);
    }

    @Operation(summary = "Get all water samples", description = "Retrieves all stored water samples")
    @GetMapping("/samples")
    public List<WaterSample> getSamples() {
        return service.getAllSamples();
    }

    @Operation(summary = "Get a sample by ID", description = "Retrieves a specific water sample by its ID")
    @GetMapping("/sample/{id}")
    public Optional<WaterSample> getSampleById(@PathVariable String id) {
        return service.getSampleById(id);
    }

    @Operation(summary = "Delete a sample", description = "Deletes a specific water sample by its ID")
    @DeleteMapping("/sample/{id}")
    public void deleteSample(@PathVariable String id) {
        service.deleteSample(id);
    }
}
