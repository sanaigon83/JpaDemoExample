package com.example.jpademo.domain.entity

import com.example.jpademo.domain.enum.OrderStatus
import java.time.LocalDate
import javax.persistence.*

@Entity
class Order(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ORDER_ID")
    var id: Long,
    @Temporal(TemporalType.TIMESTAMP)
    var orderDate: LocalDate,
    @Enumerated(EnumType.STRING)
    var status: OrderStatus,
    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    var member: Member? = null,
    @OneToMany(mappedBy = "order")
    var oderItems: MutableList<OrderItem> = mutableListOf(),
    @OneToOne
    @JoinColumn(name = "DELIVERY_ID")
    var delivery: Delivery
)

fun Order.setMember(member: Member) {
    //기존 관계 제거
    this.member?.orders?.remove(this)
    this.member = member
    member.orders.add(this)
}

fun Order.setDelivery(delivery: Delivery) {
    this.delivery = delivery
    delivery.order = this
}



