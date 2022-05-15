package com.example.jpademo.domain.entity.inherit

import javax.persistence.*

@Entity
//@Inheritance(strategy = InheritanceType.JOINED) // 매핑 전략을 조인 전략으로 지정한다.
@DiscriminatorColumn(name = "DTYPE")  // 부모 클래스에 구분 컬럼을 지정한다. (따로 만들지는 않는다.) 기본값이 DTYPE 이므로 @DiscriminatorColumn 으로 써도 무방하다.
open class MainItem(
    val name: String? = null,
    val price: Int? = null
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEM_ID")
    private var id: Long? = null
}
