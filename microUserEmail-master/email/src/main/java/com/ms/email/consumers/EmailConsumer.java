package com.ms.email.consumers;

import com.ms.email.dtos.EmailRecordDto;
import com.ms.email.model.EmailModel;
import com.ms.email.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailConsumer {
    private final EmailService emailService;

    @RabbitListener(queues = "${broker.queue.email.name}")
    public void ListenEmailQueue(@Payload EmailRecordDto emailRecordDto){
    var emailModel = new EmailModel();
        BeanUtils.copyProperties(emailRecordDto, emailModel);
        emailService.sendEmail(emailModel);
    }
}
