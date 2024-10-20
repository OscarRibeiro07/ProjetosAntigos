package br.com.xmob.email.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "Email")
@Data
public class EmailModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "UUID",name = "idSend", unique = true,nullable = false, updatable = false)
	private UUID idSend;
	private String ownerRef;
	private String emailFrom;
	private String emailTo;
	@Column(columnDefinition = "TEXT")
	private String subject;
	private String text;
	private LocalDateTime timeSendEmail;
	@Enumerated(EnumType.STRING)
	private EmailStatus status;

}
