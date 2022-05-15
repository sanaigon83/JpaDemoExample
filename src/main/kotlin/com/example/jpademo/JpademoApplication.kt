package com.example.jpademo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import javax.persistence.EntityManager
import javax.persistence.EntityTransaction
import javax.persistence.Persistence

@SpringBootApplication
class JpademoApplication

fun main(args: Array<String>) {
    runApplication<JpademoApplication>(*args)
}
