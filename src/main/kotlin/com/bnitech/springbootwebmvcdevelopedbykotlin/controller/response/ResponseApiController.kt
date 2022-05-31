package com.bnitech.springbootwebmvcdevelopedbykotlin.controller.response

import com.bnitech.springbootwebmvcdevelopedbykotlin.model.http.UserRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

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

    @PostMapping
    fun postMapping(@RequestBody userRequest: UserRequest?): ResponseEntity<Any> {
        return ResponseEntity.status(200).body(userRequest)
    }

    @PutMapping
    fun putMapping(@RequestBody userRequest: UserRequest?): ResponseEntity<Any> {
        return ResponseEntity.status(HttpStatus.CREATED).body(userRequest)
    }

    @DeleteMapping("/{id}")
    fun deleteMapping(@PathVariable id: Int): ResponseEntity<Any> {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null)
    }
}
