package com.grinyov.recaptcha.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vgrinyov.
 */
@RestController
public class AuthController {
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void register(RegisterDto registerDto){

    }
}
