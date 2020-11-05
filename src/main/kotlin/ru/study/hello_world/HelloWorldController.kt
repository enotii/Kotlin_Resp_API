package ru.study.hello_world

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


@RestController
class HelloWorldController {
    var counter = AtomicLong();

    @GetMapping("/hello")
    fun hello(
            @RequestParam(value = "name", defaultValue = "World") name : String
    ) = HelloWorld(counter.getAndIncrement(), "Hello, $name!")


}