package com.example.smsnotification;

import com.fedoseev.entities.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("sms")
public class SmsController {

    private static final Logger logger = LoggerFactory.getLogger(SmsController.class);
    private static final String SUCCESS_RESPONSE = "SMS successfully sent";

    @PostMapping(path = "/sendSms", produces = "application/json", consumes = "application/json")
    public Response sendSms(@Valid @RequestBody SmsMessage smsMessage) {
        logger.info(SUCCESS_RESPONSE);
        return new Response(SUCCESS_RESPONSE);
    }
}
