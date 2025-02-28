package com.waterQualityManagement.waterQualityManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class WaterQualityManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaterQualityManagementApplication.class, args);
	}

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("monitoring_service", r -> r.path("/monitoring/**")
						.uri("lb://MONITORING-SERVICE"))  // Load balancing
				.route("quality_check_service", r -> r.path("/quality/**")
						.uri("lb://QUALITY-SERVICE"))
				.build();
	}
}
