package com.example.emailnotification;

import com.fedoseev.entities.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RibbonClient(name="email-service")
@RequestMapping("/email")
public class EMailController {

    private static final Logger logger = LoggerFactory.getLogger(EMailController.class);
    private static final String SUCCESS_RESPONSE = "E-mail successfully sent";

    @PostMapping(path = "/sendEmail", produces = "application/json", consumes = "application/json")
    public Response sendEmail(@Valid @RequestBody EmailMessage emailMessage) {
        logger.info(SUCCESS_RESPONSE);
        return new Response(SUCCESS_RESPONSE);
    }
}
