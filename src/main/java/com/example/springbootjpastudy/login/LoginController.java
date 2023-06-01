package com.example.springbootjpastudy.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String gotoLoginPage(@RequestParam String name, ModelMap modelMap) {
        System.out.println("RequestParam is " + name);

        modelMap.put("name", name);

        return "login";
    }

} // end
