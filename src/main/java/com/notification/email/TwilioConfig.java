package com.notification.email;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "twilio")
public class TwilioConfig {
	public static final String ACCOUNT_SID = "AC1b686c659a729ac3a1dae9333f2425f4";
	  public static final String AUTH_TOKEN = "54c51a6ed01e041e04d50a4b91b2ce47";
	 public static final String messagingServiceSid = "MG6696d46b7e6f3c2d4de226c24da0b398"; 
}
