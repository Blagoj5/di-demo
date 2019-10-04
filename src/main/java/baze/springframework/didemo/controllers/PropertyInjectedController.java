package baze.springframework.didemo.controllers;

import baze.springframework.didemo.services.GreetingService;
import baze.springframework.didemo.services.GreetingServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceimpl")
    public GreetingServiceimpl greetingService;

    public String sayHello(){
        return  greetingService.sayGreeting();
    }

}
