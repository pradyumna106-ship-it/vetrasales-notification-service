package com.notification.email.service;

import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.notification.email.TwilioConfig;
import com.notification.email.entity.Mail;
import com.notification.email.repository.MailRepository;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import com.twilio.Twilio;

import jakarta.annotation.PostConstruct;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class NotificationServiceImpl implements NotificationService {
	
    @Autowired
    private MailRepository repo;

    @Autowired
    private JavaMailSender sender;
    
    @Autowired
	private TwilioConfig twilioconfig;
    

    @Override
    public void sendEmail(Mail mail) {
        MimeMessage msg = sender.createMimeMessage();
        
        try {
            MimeMessageHelper helper = new MimeMessageHelper(msg, true);
            helper.setTo(mail.getReceiver());
            helper.setSubject(mail.getSubject());
            helper.setText(mail.getBody(), true);

            sender.send(msg);
            repo.save(mail); // logs email in DB

        } catch (MessagingException e) {
            throw new RuntimeException("Email sending failed", e);
        }
    }
    @Override
    public void sendSMS(String phoneNumber, String content) {
        Message message = Message.creator(
          new PhoneNumber(phoneNumber),twilioconfig.messagingServiceSid,content).create();
        System.out.println(message.getSid());
      }
}

