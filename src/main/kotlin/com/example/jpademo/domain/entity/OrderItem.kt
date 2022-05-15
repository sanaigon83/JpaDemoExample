package com.example.jpademo.domain.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
data class OrderItem(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    var order: Order,
    @ManyToOne
    @JoinColumn(name= "ITEM_ID")
    var item: Item,
    @Column
    var orderPrice: Int,
    @Column
    var count: Int
)