package baze.springframework.didemo.controllers;

import baze.services.GreetingServiceimpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {
    ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp(){
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceimpl());
    }

    @Test
    public void testGreetings(){
        assertEquals(GreetingServiceimpl.HELLO, constructorInjectedController.sayHello());
    }

}
