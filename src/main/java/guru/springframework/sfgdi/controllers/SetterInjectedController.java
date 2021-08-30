package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

<<<<<<< HEAD
=======
/**
 * Created by jt on 12/26/19.
 */
>>>>>>> dev
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

<<<<<<< HEAD
    /*
        Na Setter Injection coloca-se o Autowired no setter.
        A Injeção de Dependência ocorrerá aqui
     */
=======
>>>>>>> dev
    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
