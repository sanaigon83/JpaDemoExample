package com.example.jpademo.domain.entity

import javax.persistence.*

@Entity
data class Item(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ITEM_ID")
    var id: Long,
    var name: String,
    var price: Int,
    var stockQuantity: Int,
    @ManyToMany(mappedBy = "items")
    var categories: MutableList<Category> = mutableListOf()
)