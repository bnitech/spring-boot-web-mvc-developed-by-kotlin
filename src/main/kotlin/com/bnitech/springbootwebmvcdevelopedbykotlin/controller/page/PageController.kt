package com.bnitech.springbootwebmvcdevelopedbykotlin.controller.page

import com.bnitech.springbootwebmvcdevelopedbykotlin.model.http.UserRequest
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class PageController {

    @GetMapping("/main")
    fun main(): String {
        println("init main")
        return "main.html"
    }

    @ResponseBody
    @GetMapping("/test")
    fun response(): UserRequest {
        return UserRequest().apply {
            this.name = "steve"
        }
    }
}
