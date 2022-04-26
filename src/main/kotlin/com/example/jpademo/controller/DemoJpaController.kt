package com.example.jpademo.controller

import com.example.jpademo.domain.dto.ApiRes
import com.example.jpademo.domain.dto.UserDto
import com.example.jpademo.domain.dto.toEntity
import com.example.jpademo.domain.entity.toDto
import com.example.jpademo.service.DemoJpaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("order")
class DemoJpaController @Autowired constructor(
    private val demoJpaService: DemoJpaService
){
    @GetMapping("/getuser")
    fun getUser(@RequestParam("id") id: Long): ApiRes {
        return ApiRes(result = demoJpaService.getUser(id).toDto())
    }

    @GetMapping("/adduser")
    fun addUser(@RequestParam("name") name: String, @RequestParam("age") age: Int, @RequestParam("order") order: Int): ApiRes {
        val dto = UserDto(name = name, age = age, order = order)
        val id = demoJpaService.saveUser(dto.toEntity())
        return ApiRes(result = UserDto(id, "jkpark", 40, 23))
    }
}