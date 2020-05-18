package com.example.smsnotification;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sms")
public class SmsController {

    @GetMapping("/getsms")
    public String getSms() {
        return "sms";
    }
}
