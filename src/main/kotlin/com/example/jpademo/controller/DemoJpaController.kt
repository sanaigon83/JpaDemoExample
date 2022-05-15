package com.example.jpademo.controller
import com.example.jpademo.service.DemoJpaService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("product")
class DemoJpaController(private val demoJpaService: DemoJpaService) {
    /*
    @GetMapping("/user")
    fun getUser(@RequestParam("id") id: Long): ApiRes {
        return ApiRes(result = demoJpaService.getUser(id).toDto())
    }

    @GetMapping("/order")
    fun addUser(@RequestParam("name") name: String, @RequestParam("age") age: Int, @RequestParam("order") order: Int): ApiRes {
        val dto = UserDto(name = name, age = age, order = order)
        val id = demoJpaService.saveUser(dto.toEntity())
        return ApiRes(result = UserDto(id, "jkpark", 40, 23))
    }

    @GetMapping("/test/{name}/{age}/{order}")
    fun addUser2(@PathVariable("name") name: String, @PathVariable("age") age: Int, @PathVariable("order") order: Int): ApiRes {
        val dto = UserDto(name = name, age = age, order = order)
        val id = demoJpaService.saveUser(dto.toEntity())
        return ApiRes(result = UserDto(id, "jkpark", 40, 23))
    }

    @GetMapping("/member")
    fun newMember(): ApiRes {
        val dto = MemberDto(firstName = "jinkon", lastName = "park")
        demoJpaService.saveSample(dto.toEntity())
        return ApiRes(result = dto)
    }*/

}