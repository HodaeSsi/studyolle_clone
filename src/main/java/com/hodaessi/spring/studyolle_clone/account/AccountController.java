package com.hodaessi.spring.studyolle_clone.account;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {

    @GetMapping("/sign-up")
    public String signUpForm(Model model) {

        return "account/sign-up";
    }
}
