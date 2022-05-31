package com.bnitech.springbootwebmvcdevelopedbykotlin.controller.delete

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class DeleteApiController {

    @DeleteMapping(path = ["/delete-mapping"])
    fun deleteMapping(
        @RequestParam name: String,
        @RequestParam age: Int
    ): String {
        println("name = [${name}], age = [${age}]")
        return "$name $age"
    }

    @DeleteMapping(path = ["/delete-mapping/path/name/{name}/age/{age}"])
    fun deleteMappingPath(
        @PathVariable(name = "name") _name: String,
        @PathVariable(value = "age") _age: Int
    ): String {
        println("name = [${_name}], age = [${_age}]")
        return "$_name $_age"
    }
}
