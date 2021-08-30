package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

<<<<<<< HEAD
@Service
public class SetterInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world! - Setter Injected";
=======
/**
 * Created by jt on 12/27/19.
 */
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
>>>>>>> dev
    }
}
