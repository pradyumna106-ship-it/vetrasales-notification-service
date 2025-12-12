package com.notification.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.notification.email.dto.Smsdto;
import com.notification.email.entity.Mail;
import com.notification.email.service.NotificationService;


@RestController
@RequestMapping("/api/notification")
public class NotificationController  {
	@Autowired
    private NotificationService service;

    @PostMapping("/email")
    public String sendEmail(@RequestBody Mail mail) {
        service.sendEmail(mail);
        return "Email sent successfully!";
    }

    @PostMapping("/sms")
    public String sendSMS(@RequestBody Smsdto smsdto) {
    	
        service.sendSMS(smsdto.getPhoneNo(), smsdto.getContent());
        return "SMS sent!";
    }

}
