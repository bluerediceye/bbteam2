package com.learning.webservice.example.signin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class SigninController {

	@RequestMapping(value = "signin")
	public String signin(Principal principal) {
        if(principal != null) {
            return "home/index";
        }
        return "signin/signin";
    }
}
