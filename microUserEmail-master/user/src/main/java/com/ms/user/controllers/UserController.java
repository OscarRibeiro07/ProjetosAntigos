package com.ms.user.controllers;

import com.ms.user.dto.UserRecordDto;
import com.ms.user.models.UserModel;
import com.ms.user.repository.UserRepository;
import com.ms.user.services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@Log4j2
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping("/save")
    @ResponseStatus(value = HttpStatus.CREATED)
    ResponseEntity<UserModel> saveUser(@RequestBody @Valid UserRecordDto userRecordDto){
        log.info("[inicia] UserController - saveUser ");
        var userModel = new UserModel();
        BeanUtils.copyProperties(userRecordDto, userModel);
        log.info("[finaliza] UserController - saveUser ");
        return  ResponseEntity.accepted().body(userService.save(userModel));
    }

}
