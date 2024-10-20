package br.com.xmob.email.application.service;

import br.com.xmob.email.domain.EmailModel;

public interface EmailService {
	EmailModel sendEmail(EmailModel emailModel);
}
