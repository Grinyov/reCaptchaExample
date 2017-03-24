package com.grinyov.recaptcha.service;

import com.grinyov.recaptcha.dto.ReCaptchaResponseDto;
import lombok.NonNull;
import org.springframework.stereotype.Component;

/**
 * Created by vgrinyov.
 */
@Component
public class ReCaptchaApiClient {
    public ReCaptchaResponseDto verify(@NonNull String recaptchaResponseDto){
        return null;
    }
}
