package com.getarrays.employeemanager.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService implements HealthIndicator {

    private final String DATABASE_SERVICE = "Database Service";

    @Override
    public Health health() {
        return Health.up().withDetail(DATABASE_SERVICE, "Service is running").build();
    }
}
