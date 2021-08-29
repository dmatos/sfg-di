package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    /*
        Na Constructor Injection a anotação  @Autowired não é necessário
        IMPORTANTE: Não se esqueça de colocar a anotação @Service no *GreetingServiceImpl* <- Impl

        A anotação @Qualifier("nome") indica qual implementação injetar no caso de várias implementações para uma mesma
        interface
     */
    public ConstructorInjectedController(@Qualifier("constructorGreetingService" ) GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}