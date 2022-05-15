package com.example.jpademo.domain.entity

import javax.persistence.*

@Entity
@IdClass(MemberProductId::class)
data class MemberProduct(
    @Id
    @ManyToOne
    @JoinColumn(name="MEMBER_ID")
    var member: Member,  // MemberProduct.Id.member와 연결

    @Id
    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    var product: Product,

    var orderAmount: Int
)
