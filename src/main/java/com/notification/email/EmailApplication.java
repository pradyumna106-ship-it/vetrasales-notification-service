package com.notification.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.twilio.Twilio;
import com.twilio.rest.verify.v2.service.Verification;

import jakarta.annotation.PostConstruct;;

@SpringBootApplication(scanBasePackages = "com.notification.email")
@EnableJpaRepositories(basePackages = "com.notification.email.repository")
@EntityScan(basePackages = "com.notification.email.entity")
public class EmailApplication {
	
	@Autowired
	private TwilioConfig twilioconfig;
    
	@PostConstruct
	public void init() {
	    Twilio.init(twilioconfig.ACCOUNT_SID,twilioconfig.AUTH_TOKEN);
	}

	
	public static void main(String[] args) {
		SpringApplication.run(EmailApplication.class, args);
	}
}
