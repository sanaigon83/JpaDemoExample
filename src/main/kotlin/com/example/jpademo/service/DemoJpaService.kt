package com.example.jpademo.service

import com.example.jpademo.domain.entity.User

interface DemoJpaService {
    fun saveUser(user: User): Long
    fun getUser(id: Long): User
}