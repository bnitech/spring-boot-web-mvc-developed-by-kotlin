package com.bnitech.springbootwebmvcdevelopedbykotlin.controller.put

import com.bnitech.springbootwebmvcdevelopedbykotlin.model.http.Result
import com.bnitech.springbootwebmvcdevelopedbykotlin.model.http.UserRequest
import com.bnitech.springbootwebmvcdevelopedbykotlin.model.http.UserResponse
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class PutApiController {

    @PutMapping("/put-mapping")
    fun postMapping(): String {
        return "put-mapping"
    }

    @RequestMapping(method = [RequestMethod.PUT], path = ["/request-mapping"])
    fun requestMapping(): String {
        return "request-mapping"
    }

    @PutMapping(path = ["/put-mapping/object"])
    fun postMappingObject(@RequestBody userRequest: UserRequest): UserResponse {

        return UserResponse().apply {
            this.result = Result().apply {
                this.resultCode = "OK"
                this.resultMessage = "성공"
            }
        }.apply {
            this.description = "~~~~~~~"
        }.apply {
            val userList = mutableListOf<UserRequest>()

            userList.add(userRequest)

            userList.add(UserRequest().apply {
                this.name = "a"
                this.age = 10
                this.email = "a@gmail.com"
                this.address = "a address"
                this.phoneNumber = "010-1111-aaaa"
            })

            userList.add(UserRequest().apply {
                this.name = "b"
                this.age = 20
                this.email = "b@gmail.com"
                this.address = "b address"
                this.phoneNumber = "010-1111-bbbb"
            })

            this.userRequest = userList
        }
    }
}
