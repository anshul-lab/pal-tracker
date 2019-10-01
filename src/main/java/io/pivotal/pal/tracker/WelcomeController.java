package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping(method=RequestMethod.GET, value="/")
    public String hello(){
        return "hello";
    }
}
