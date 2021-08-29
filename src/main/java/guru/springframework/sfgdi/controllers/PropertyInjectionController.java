package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller //indica que essa classe é uma Bean que será adicionada ao Spring Context
public class PropertyInjectionController {

    /*
        Autowired siginifica que o construtor default será chamado
        Porém, a *IMPLEMENTAÇÃO* do serviço deve ter a anotação @Service
     */
    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
       return greetingService.sayGreeting();
    }
}
