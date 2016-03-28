package com.tecnilogica.controller

import java.util.concurrent.atomic.AtomicLong
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

import com.tecnilogica.model.Greeting

@RestController
public class GreetingRestController {

    private static final String template = "Hello, %s!"
    private final AtomicLong counter = new AtomicLong()

    @RequestMapping("/rest/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(
            id: counter.incrementAndGet(),
            content: String.format(template, name)

        )
    }

}
