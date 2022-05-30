package com.bnitech.springbootwebmvcdevelopedbykotlin.model.http

import com.fasterxml.jackson.annotation.JsonProperty

data class UserRequest(
    var name: String? = null,
    var age: Int? = null,
    var email: String? = null,
    var address: String? = null,

    @JsonProperty("phone_number")
    var phoneNumber: String? = null
)
