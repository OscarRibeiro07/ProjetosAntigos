package br.com.xmob.email.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import br.com.xmob.email.domain.EmailStatus;
import lombok.Data;
@Data
public class EmailDTO {
	@NotBlank 
	private String ownerRef;
	@NotBlank
	@Email
	private String emailFrom;
	@NotBlank
	@Email
	private String emailTo;
	@NotBlank
	private String subject;
	@NotBlank
	private String text;
	private LocalDateTime timeSendEmail;
	private EmailStatus status;

}
