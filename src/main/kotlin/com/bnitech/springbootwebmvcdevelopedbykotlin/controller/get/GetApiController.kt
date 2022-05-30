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

    @GetMapping("/get-mapping/path-variable2/{name}/{age}")
    fun pathVariable2(@PathVariable(value = "name") _name: String, @PathVariable(name = "age") age: Int): String {
        val name = "kotlin"
        println("name = [${_name}], age = [${age}]")
        return "$_name $age"
    }

    @GetMapping("/get-mapping/query-param")
    fun queryParam(@RequestParam name: String, @RequestParam(value = "age") age: Int): String {
        println("name = [${name}], age = [${age}]")
        return "$name $age"
    }
}
