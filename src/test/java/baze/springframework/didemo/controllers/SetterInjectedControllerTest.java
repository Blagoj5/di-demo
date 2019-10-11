package baze.springframework.didemo.controllers;

import baze.services.GreetingServiceimpl;
import org.junit.Before;
import org.junit.Test;

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
