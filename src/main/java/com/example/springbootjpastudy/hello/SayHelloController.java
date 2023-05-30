package com.example.springbootjpastudy.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController
@Controller
public class SayHelloController {
    // "say-hello" => "Hello! What are tou learning today?"


    @GetMapping("/say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! What are you learning today?";
    }

    @GetMapping("/say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();

        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My first html page with body</title>");
        sb.append("</head>");
        sb.append("</html>");

        return sb.toString();
    }

    // JSP
    @GetMapping("/say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }

}
