package com.vbank.cards.config;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
@Data
@Configuration
@ConfigurationProperties(prefix = "cards")
public class CardsServiceConfig {
private String msg;
private String buildVersion;
private Map<String,String> mailDetails;
private List<String> activeBranches;
}
