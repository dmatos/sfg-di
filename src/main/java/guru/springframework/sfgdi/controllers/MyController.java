package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

<<<<<<< HEAD
=======
/**
 * Created by jt on 12/26/19.
 */
>>>>>>> dev
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
<<<<<<< HEAD
       return greetingService.sayGreeting();
=======
        return greetingService.sayGreeting();
>>>>>>> dev
    }
}
