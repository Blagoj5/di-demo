package baze.springframework.didemo.controllers;

import baze.springframework.didemo.services.GreetingService;
import baze.springframework.didemo.services.GreetingServiceimpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.stereotype.Service;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @Before
    public void setUp(){
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceimpl());
    }

    @Test
    public void testGreetings(){
        assertEquals(GreetingServiceimpl.HELLO, setterInjectedController.sayHello());
    }


}
