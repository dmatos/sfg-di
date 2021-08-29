package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/*
    A anotação @Primary identifica qual implementação será a injetada por Default no caso de não ser indicado um
    @Qualifier específico
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world! - From the PRIMARY Bean";
    }
}
