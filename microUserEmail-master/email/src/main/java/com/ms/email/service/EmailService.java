package com.ms.email.service;

import com.ms.email.consumers.EmailConsumer;
import com.ms.email.model.EmailModel;
import com.ms.email.model.StatusEmail;
import com.ms.email.repository.EmailRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Service
public class EmailService {

    final EmailRepository emailRepository;
    final JavaMailSender javaMailSender;

    public EmailService(EmailRepository emailRepository, JavaMailSender javaMailSender) {
        this.emailRepository = emailRepository;
        this.javaMailSender = javaMailSender;
    }

    @Value(value = "${broker.queue.email.name}")
    private String emailFrom;


    @Transactional
    public EmailModel sendEmail(EmailModel emailModel){

        try {
            SimpleMailMessage message = new SimpleMailMessage();
            emailModel.setSendDateEmail(LocalDateTime.now());
            emailModel.setEmailFrom(emailFrom);

            message.setTo(emailModel.getEmailTo());
            message.setSubject(emailModel.getSubject());
            message.setText(emailModel.getText());

            javaMailSender.send(message);

            emailModel.setStatusEmail(StatusEmail.SENT);

        }catch (MailException e){
            emailModel.setStatusEmail(StatusEmail.ERROR);

        } return emailRepository.save(emailModel);
    }
}
