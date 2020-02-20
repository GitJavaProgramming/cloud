package org.pp.servicegateway.jwt;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@ConfigurationProperties(prefix = "data-filter", ignoreUnknownFields = false)
@Data
@Component
public class DataFilterConfig {
    private List<String> authPath;
    private List<String> userLoginPath;
}
