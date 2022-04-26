package com.example.jpademo.repository

import com.example.jpademo.domain.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface DemoJpaRepository : JpaRepository<User, Long>