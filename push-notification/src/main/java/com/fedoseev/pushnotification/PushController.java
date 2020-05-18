package com.fedoseev.pushnotification;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/push")
public class PushController {

    private static final Logger logger = LoggerFactory.getLogger(PushMessage.class);
    private static final String SUCCESS_RESPONSE = "Push successfully sent";

    @GetMapping("/getPush")
    public String sendPush(@Valid @RequestBody PushMessage pushMessage) {
        logger.info(SUCCESS_RESPONSE);
        return SUCCESS_RESPONSE;
    }
}
