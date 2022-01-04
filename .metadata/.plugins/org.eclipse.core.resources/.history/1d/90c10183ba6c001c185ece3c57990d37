package com.vbank.loans.config;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
@Data
@Configuration
@ConfigurationProperties(prefix = "loans")
public class LoansServiceConfig {
private String msg;
private String buildVersion;
private Map<String,String> mailDetails;
private List<String> activeBranches;
}
