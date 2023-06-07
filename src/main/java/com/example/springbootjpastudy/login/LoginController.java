package com.example.springbootjpastudy.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

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

} // end
