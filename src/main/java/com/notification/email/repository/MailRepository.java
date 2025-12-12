package com.notification.email.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.notification.email.entity.Mail;

public interface MailRepository extends JpaRepository<Mail, Integer> {

}
