package com.example.jpademo.service

import com.example.jpademo.domain.entity.User
import com.example.jpademo.repository.DemoJpaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DemoJpaServiceImpl @Autowired constructor(private val repo: DemoJpaRepository) : DemoJpaService {

    override fun saveUser(user: User): Long {
        return repo.save(user).id ?: throw java.lang.IllegalArgumentException("저장 실패")
    }

    override fun getUser(id: Long): User {
        return repo.getById(id)
    }
}