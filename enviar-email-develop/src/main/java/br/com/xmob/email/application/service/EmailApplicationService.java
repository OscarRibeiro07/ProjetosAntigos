package br.com.xmob.email.application.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import br.com.xmob.email.domain.EmailModel;
import br.com.xmob.email.domain.EmailStatus;
import br.com.xmob.email.infra.JPARepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class EmailApplicationService implements EmailService {
	@Autowired
	private final JPARepository repository;
	@Autowired
	private JavaMailSender mailSender;
	
	@Override
	public EmailModel sendEmail(EmailModel emailModel) {
		emailModel.setTimeSendEmail(LocalDateTime.now());
		log.info("[inicia] EmailApplicationService - sendEmail");
		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom(emailModel.getEmailFrom());
			message.setTo(emailModel.getEmailTo());
			message.setSubject(emailModel.getSubject());
			message.setText(emailModel.getText()); 
			mailSender.send(message);
			emailModel.setStatus(EmailStatus.SENT);
		} catch (Exception e) {
			emailModel.setStatus(EmailStatus.ERROR);
		}
		log.info("[finaliza] EmailApplicationService - sendEmail");
		return repository.save(emailModel);
	}

}
