package com.fedoseev.pushnotification;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/push")
public class PushController {

    @GetMapping("/getpush")
    public String getPush() {
        return "push";
    }
}
