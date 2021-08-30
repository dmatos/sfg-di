package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

<<<<<<< HEAD
@Controller //indica que essa classe é uma Bean que será adicionada ao Spring Context
public class PropertyInjectedController {

    /*
        Autowired siginifica que o construtor default será chamado
        Porém, a *IMPLEMENTAÇÃO* do serviço deve ter a anotação @Service
     */
    @Qualifier("propertyGreetingService" )
=======
/**
 * Created by jt on 12/26/19.
 */
@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
>>>>>>> dev
    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
<<<<<<< HEAD
       return greetingService.sayGreeting();
    }
=======
        return greetingService.sayGreeting();
    }

>>>>>>> dev
}
