package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

<<<<<<< HEAD
@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world! - Constructor Injected";
=======
/**
 * Created by jt on 12/26/19.
 */
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
>>>>>>> dev
    }
}
