package com.ms.user.producers;

import com.ms.user.dto.EmailDto;
import com.ms.user.models.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserProducers {
    public final RabbitTemplate rabbitTamplate;

    @Value(value = "${broker.queue.email.name}" )
    private String routingKey;

    public void publishMessageEmail(UserModel userModel){
        var emailDto = new EmailDto();
        emailDto.setUserId(userModel.getUserId());
        emailDto.setEmailTo(userModel.getEmail());
        emailDto.setSubject("Cadastro realizado com sucesso!");
        emailDto.setText(userModel.getName() + " Seja Bem vindo(a)! \n Agradecemos o seu cadastro");

        rabbitTamplate.convertAndSend("",routingKey, emailDto);
    }

}
