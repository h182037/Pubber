package controllers;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class SpringBootHelloWorld {

    @RequestMapping("/")
    String home() {
        return "Hello, Dat251!";
    }

    public static void main(String[] args){
        SpringApplication.run(SpringBootHelloWorld.class, args);
    }

}