package com.tech.auth_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String home() {
        return "Home page";
    }

    @GetMapping("/resources")
    public String resources() {
        return "Resources";
    }
}
