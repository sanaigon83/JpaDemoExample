package com.example.jpademo.domain.dto

import com.example.jpademo.domain.entity.User

data class UserDto(
    var id: Long? = null,
    var name: String,
    var age: Int,
    var order: Int
) : ResponseData

fun UserDto.toEntity(): User {
    return User(id, name, age, order)
}