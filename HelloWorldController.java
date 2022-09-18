package com.CoBa.learning.restfulwebservices.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//Controller
@RestController
public class HelloWorldController {

    //GET
    //URI - /hello-world
    //method - "Hello world"

    //@RequestMapping(method = RequestMethod.GET, path = "/hello-world") but better way is next one
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello Beautiful World";
    }

    //hello-world-bean
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello Wonderful World");
    }

    //  /hello-world/path-variable/Mitashki (path parameter is Mitashki and it is mapped to path var {name})
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World and hello %s", name));
    }
}
