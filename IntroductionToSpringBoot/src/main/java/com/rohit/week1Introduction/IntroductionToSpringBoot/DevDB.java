package com.rohit.week1Introduction.IntroductionToSpringBoot;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env", havingValue = "deployment")
public class DevDB implements DB{
    public String getData(){
        return "Dev Data";
    }
}
