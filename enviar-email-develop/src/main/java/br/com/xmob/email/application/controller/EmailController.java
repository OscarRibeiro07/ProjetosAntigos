package br.com.xmob.email.application.controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.xmob.email.application.service.EmailService;
import br.com.xmob.email.domain.EmailModel;
import br.com.xmob.email.dto.EmailDTO;
import ch.qos.logback.core.joran.util.beans.BeanUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequestMapping("/v1/email")
public class EmailController  {
	
	@Autowired
	private EmailService service;
	@PostMapping("/sending")
	public ResponseEntity<EmailModel> sendEmail(@RequestBody @Valid EmailDTO dto) {
		log.info("[inicia] EmailController - sendEmail");
		EmailModel emailModel = new EmailModel();
		BeanUtils.copyProperties(dto, emailModel);
		service.sendEmail(emailModel);
		log.info("[finaliza] EmailController - sendEmail");
		return new ResponseEntity<>(emailModel,HttpStatus.OK);
	}

}
