package com.fedoseev.pushnotification;

import com.fedoseev.entities.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/push")
public class PushController {

    private static final Logger logger = LoggerFactory.getLogger(PushMessage.class);
    private static final String SUCCESS_RESPONSE = "Push successfully sent";

    @PostMapping(path = "/sendPush", produces = "application/json", consumes = "application/json")
    public Response sendPush(@Valid @RequestBody PushMessage pushMessage) {
        logger.info(SUCCESS_RESPONSE);
        return new Response(SUCCESS_RESPONSE);
    }
}
