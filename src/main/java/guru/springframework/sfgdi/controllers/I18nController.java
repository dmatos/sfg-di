package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

<<<<<<< HEAD
//Internationalization controller name convention as it is 18 chars long
=======
/**
 * Created by jt on 12/27/19.
 */
>>>>>>> dev
@Controller
public class I18nController {

    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
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
