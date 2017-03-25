package com.grinyov.recaptcha.service;


import com.grinyov.recaptcha.dto.ReCaptchaResponseDto;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * Created by vgrinyov.
 */
@Component
public class ReCaptchaApiClient {
    @Value("${app.reCaptcha.apiUrl}")
    private String reCaptchaApiUrl;
    @Value("${app.reCaptcha.secretKey}")
    private String secretKey;

    private RestTemplate restTemplate = new RestTemplate();

    public ReCaptchaResponseDto verify(@NonNull String recaptchaResponse) {
        MultiValueMap<String, String> form = new LinkedMultiValueMap<>();
        form.add("secret", secretKey);
        form.add("response", recaptchaResponse);

        return restTemplate.postForObject(reCaptchaApiUrl, form, ReCaptchaResponseDto.class);
    }
}
