package com.bnitech.springbootwebmvcdevelopedbykotlin.controller.response

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/response")
class ResponseApiController {

    @GetMapping
    fun getMapping(@RequestParam age: Int?): String {
        println("age = [${age}]")
        return "OK"
    }
}
