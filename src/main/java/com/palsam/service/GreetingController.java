package com.palsam.service;


@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    @RequestMapping("/greet")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(String.format(template, name));
    }
}
