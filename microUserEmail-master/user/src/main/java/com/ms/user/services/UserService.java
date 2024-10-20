package com.ms.user.services;

import com.ms.user.models.UserModel;
import com.ms.user.producers.UserProducers;
import com.ms.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class UserService {
    public final UserProducers userProducers;
    private final UserRepository userRepository;
    @Transactional
    public UserModel save(UserModel userModel){
        log.info("[inicia] UserRepository - save ");
        var userSaved = userRepository.save(userModel);
        userProducers.publishMessageEmail(userModel);
        log.info("[finaliza] UserRepository - save ");
        return userSaved;
    }

}