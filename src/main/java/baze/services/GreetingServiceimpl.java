package baze.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceimpl implements GreetingService{
    public static final String HELLO = "Hello everyone!!! -- original";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
