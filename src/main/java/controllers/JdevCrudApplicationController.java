package controllers;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition;

/**
 * A sample greetings controller to return greeting text
 */
@RestController
public class JdevCrudApplicationController {
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {
        return "Curso Spring Boot API: " + name + "!";
    }
}
