package com.example.jpademo.domain.entity

import com.example.jpademo.domain.enum.DeliveryStatus
import javax.persistence.*


@Entity
data class Delivery(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DELIVERY_ID")
    var id: Long,
    var city: String,
    var street: String,
    var zipCode: String,
    @Enumerated(EnumType.STRING)
    var status: DeliveryStatus,
    @OneToOne(mappedBy = "delivery")
    var order: Order
)

fun Delivery.setOrder(order: Order) {
    this.order = order
    order.delivery = this
}
