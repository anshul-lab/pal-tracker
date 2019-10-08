package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    String message = "hello";

    public WelcomeController(@Value("${welcome.message}") String message) {
        this.message = message;
    }

    @RequestMapping(method=RequestMethod.GET, value="/")
    public String hello(){
        return message;
    }
}
