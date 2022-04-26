package com.example.jpademo.domain.entity

import com.example.jpademo.domain.dto.UserDto
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.UniqueConstraint

@Entity
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Long?,

    @Column(unique = true)
    var name: String,

    var age: Int,
    var orderCode: Int
)

fun User.toDto(): UserDto {
    return UserDto(id ?: 0, name, age, orderCode)
}