package com.example.springbootjpastudy.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    private AuthenticationService authenticationService;
    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    private Logger logger = LoggerFactory.getLogger(getClass());

//    @GetMapping("/login")
//    public String gotoLoginPage(@RequestParam String name, ModelMap modelMap) {
////        System.out.println("RequestParam is " + name);
//
//        logger.trace("trace");
//        logger.debug("RequestParam is {}", name);
//        logger.info("info");
//        logger.error("error");
//        logger.warn("warn");
//
//
//
//        modelMap.put("name", name);
//
//        return "login";
//    }

    @GetMapping("/login")
    public String gotoLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

        // 인증로직 추가
        if (authenticationService.authenticate(name, password)) {
            model.put("name", name);
            model.put("password", password);

            return "welcome";
        }

        model.put("error", "Login Error..! Pleas Try Again :)");
        return "login";

    }

} // end
