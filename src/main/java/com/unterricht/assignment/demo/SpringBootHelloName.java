package com.unterricht.assignment.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
//@RequestMapping(value = "hello")
public class SpringBootHelloName {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloName.class, args);
    }
    @RequestMapping(value="/{firstName}/{lastName}", method = RequestMethod.GET)

    public String hello(@PathVariable("firstName") String firstName,
                        @PathVariable("lastName") String lastName) {
        return String.format("{\"message\":\"Hello %s %s\"}", firstName,
                lastName);

    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String hello(@RequestBody Object object) {
        return String.format("{\"payload\":\"%s\"}", object);
    }
}
