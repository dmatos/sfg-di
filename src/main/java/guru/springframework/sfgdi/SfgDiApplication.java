package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    /*

    }*/
    public static void main(String[] args) {
        //SpringApplication.run(SfgDiApplication.class, args);
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println("-----Primary Bean example");
        String greeting = myController.sayHello();

        System.out.println(greeting);

        System.out.println("--------Property Injection Controller (don't go this way)");
        PropertyInjectedController propertyController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyController.getGreeting());

        System.out.println("--------Setter Injection Controller (avoid going this way)");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("-----Constructor Injection Controller (way to go!!!)");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
