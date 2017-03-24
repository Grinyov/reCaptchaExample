package com.grinyov.recaptcha.controller;

import com.grinyov.recaptcha.dto.ReCaptchaResponseDto;
import com.grinyov.recaptcha.dto.RegisterDto;
import com.grinyov.recaptcha.service.ReCaptchaApiClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vgrinyov.
 */
@Slf4j
@RestController
public class AuthController {

    @Autowired
    private ReCaptchaApiClient reCaptchaApiClient;

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void register(RegisterDto registerDto){
        log.info("{}", registerDto);

        ReCaptchaResponseDto reCaptchaResponse = reCaptchaApiClient.verify(registerDto.getRecaptchaResponse());
        log.info("{}", reCaptchaResponse);
    }
}
