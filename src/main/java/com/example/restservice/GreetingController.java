package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

// @RestController marks the class as a controller where every method returns a domain object
// instead of a view. It is shorthand for including both @Controller and @ResponseBody.
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // @GetMapping ensures that HTTP GET requests to /greeting are mapped to the greeting() method.
    @GetMapping("/greeting")

    // @RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method.
    // If the name parameter is absent in the request, the defaultValue of World is used.
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
