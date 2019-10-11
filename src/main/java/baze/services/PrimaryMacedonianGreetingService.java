package baze.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("mkd")
@Primary
public class PrimaryMacedonianGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Zdravo na site !!! [MKD]";
    }


}
