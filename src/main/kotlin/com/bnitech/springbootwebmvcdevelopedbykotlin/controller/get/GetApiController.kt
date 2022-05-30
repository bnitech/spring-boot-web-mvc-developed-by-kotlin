package com.bnitech.springbootwebmvcdevelopedbykotlin.controller.get

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class GetApiController {

    @GetMapping(path = ["/hello", "abcd"])
    fun hello(): String {
        return "hello kotlin"
    }

    @RequestMapping(method = [RequestMethod.GET], path = ["/request-mapping"])
    fun requestMapping(): String {
        return "request-mapping"
    }

    @GetMapping("/get-mapping/path-variable/{name}/{age}")
    fun pathVariable(@PathVariable name: String, @PathVariable age: Int): String {
        println("name = [${name}], age = [${age}]")
        return "$name $age"
    }
}
