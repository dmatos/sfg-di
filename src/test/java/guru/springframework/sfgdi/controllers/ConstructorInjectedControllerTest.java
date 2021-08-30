package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

<<<<<<< HEAD

    //Way to go!!!

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp(){
=======
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
>>>>>>> dev
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
<<<<<<< HEAD
        System.out.println(controller.getGreeting());
=======

        System.out.println(controller.getGreeting());

>>>>>>> dev
    }
}