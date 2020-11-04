package ru.study.hello_world

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


@RestController
class HelloWorldController {

    @GetMapping("/hello")
    fun hello(
            @RequestParam(value = "name", defaultValue = "World") name : String
    ) = HelloWorld( AtomicLong() , "Hello, $name!")


}