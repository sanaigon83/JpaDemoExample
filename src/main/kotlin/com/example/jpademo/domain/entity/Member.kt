package com.example.jpademo.domain.entity

import javax.persistence.*

@Entity
data class Member(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    var id: Long,
    @Column
    var name: String,
    @Column
    var city: String,
    @Column
    var street: String,
    @Column
    var zipCode: String,
    @OneToMany(mappedBy = "member")
    var orders: MutableList<Order> = mutableListOf(),

    @ManyToMany
    @JoinTable(
        name = "MEMBER_PRODUCT",
        joinColumns = [JoinColumn(name="MEMBER_ID")],
        inverseJoinColumns = [JoinColumn(name="PRODUCT_ID")]
    )
    var products: MutableList<Product> = mutableListOf()

)