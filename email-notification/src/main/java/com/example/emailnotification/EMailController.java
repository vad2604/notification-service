package com.example.emailnotification;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RibbonClient(name="email-service")
@RequestMapping("/email")
public class EMailController {

    private static final Logger logger = LoggerFactory.getLogger(EMailController.class);
    private static final String SUCCESS_RESPONSE = "E-mail successfully sent";

    @PostMapping("/sendEmail")
    public String sendEmail(@Valid @RequestBody EmailMessage emailMessage) {
        logger.info(SUCCESS_RESPONSE);
        return SUCCESS_RESPONSE;
    }
}
