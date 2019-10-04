package baze.springframework.didemo.controllers;

import baze.springframework.didemo.services.GreetingServiceimpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp(){
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceimpl();
    }

    @Test
    public void testGreetings(){
        assertEquals(GreetingServiceimpl.HELLO, propertyInjectedController.sayHello());
    }

}
