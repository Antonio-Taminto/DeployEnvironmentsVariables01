package com.DeployEnvironmentsVariables01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired
    private Environment environment;
    @GetMapping
    public String greetingMessage(){
        return environment.getProperty("devName") + " " + environment.getProperty("authCode");
    }

}
