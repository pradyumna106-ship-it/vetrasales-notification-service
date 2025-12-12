package com.notification.email;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "twilio")
public class TwilioConfig {
	public static final String ACCOUNT_SID = "AC1b686c659a729ac3a1dae9333f2425f4";
	  public static final String AUTH_TOKEN = "8803c4b6ecf3533c31112a9fd623298e";
	 public static final String messagingServiceSid = "MG6696d46b7e6f3c2d4de226c24da0b398"; 
}
