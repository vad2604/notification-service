package com.example.emailnotification;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RibbonClient(name="email-service")
@RequestMapping("/email")
public class EMailController {

    @GetMapping("/getemail")
    public String getEmail() {
        return "email";
    }
}
