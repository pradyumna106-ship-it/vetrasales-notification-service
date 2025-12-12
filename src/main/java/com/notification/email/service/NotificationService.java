package com.notification.email.service;

import com.notification.email.entity.Mail;

public interface NotificationService {
    void sendEmail(Mail mail);
    void sendSMS(String phoneNumber, String message);
}

