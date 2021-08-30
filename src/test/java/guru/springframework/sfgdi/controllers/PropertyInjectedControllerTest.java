package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

<<<<<<< HEAD
    //Don't go this way...

=======
>>>>>>> dev
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
<<<<<<< HEAD
=======

>>>>>>> dev
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
<<<<<<< HEAD
=======

>>>>>>> dev
        System.out.println(controller.getGreeting());
    }
}