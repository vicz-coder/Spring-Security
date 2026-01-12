package com.self.security.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://www.ui-bank.com",
        allowCredentials = "true",
        methods = {RequestMethod.GET,RequestMethod.POST}
)
@RestController
public class AccountController {


    @GetMapping("/accounts")
    public String accounts(){
        return "Welcome User To The Account Page";
    }
}
