package ch.sebooom.dddlab.infratructure.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by seb on .
 * <p>
 * ${VERSION}
 */
@RestController
public class HelloWorldControlller {

    @RequestMapping("/hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
