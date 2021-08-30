package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
/*
    A anotação @Primary identifica qual implementação será a injetada por Default no caso de não ser indicado um
    @Qualifier específico
=======
/**
 * Created by jt on 12/27/19.
>>>>>>> dev
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
<<<<<<< HEAD
        return "Hello world! - From the PRIMARY Bean";
=======
        return "Hello World - From the PRIMARY Bean";
>>>>>>> dev
    }
}
