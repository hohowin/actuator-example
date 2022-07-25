package com.getarrays.employeemanager.monitoring;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Endpoint(id = "custom")
@Component
public class CustomEndpoint {

    @ReadOperation
    public Map<String, String> customEndpoint() {
        Map<String, String> map = new HashMap<>();
        map.put("Key", "Value");
        return map;
    }
}
