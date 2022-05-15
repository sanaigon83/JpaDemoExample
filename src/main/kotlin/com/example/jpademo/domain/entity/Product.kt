package com.example.jpademo.domain.entity

import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToMany

data class Product(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID")
    var id: Long,
    var name: String,
    @ManyToMany(mappedBy = "products")
    var members: MutableList<Member> = mutableListOf()
)
