package ucm.dii;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!!";
    }

    @RequestMapping("/helloagain")
    public String helloAgain() {
        return "Hola otra vez";
    }

    @RequestMapping("/temperature")
    public String temperature() {
        return "Temperatura actual: 45º";
    }

}
