package com.bnitech.springbootwebmvcdevelopedbykotlin.controller.response

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/response")
class ResponseApiController {

    @GetMapping
    fun getMapping(@RequestParam age: Int?): ResponseEntity<String> {

        return age?.let {
            if (age < 20) {
                return ResponseEntity.status(400).body("age 값은 20보다 커야합니다.")
            }

            ResponseEntity.ok("OK")
        } ?: kotlin.run {
            return ResponseEntity.status(400).body("age 값이 누락되었습니다.")
        }
    }
}
