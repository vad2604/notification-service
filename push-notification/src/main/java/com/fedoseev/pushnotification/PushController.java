package com.fedoseev.pushnotification;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.*;
import com.fedoseev.entities.Response;

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
