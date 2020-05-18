package com.example.smsnotification;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("sms")
public class SmsController {

    private static final Logger logger = LoggerFactory.getLogger(SmsController.class);
    private static final String SUCCESS_RESPONSE = "SMS successfully sent";

    @PostMapping("/sendSms")
    public String sendSms(@Valid @RequestBody SmsMessage smsMessage) {
        logger.info(SUCCESS_RESPONSE);
        return SUCCESS_RESPONSE;
    }
}
