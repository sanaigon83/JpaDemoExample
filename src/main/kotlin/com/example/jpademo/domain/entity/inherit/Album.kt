package com.example.jpademo.domain.entity.inherit

import javax.persistence.DiscriminatorColumn
import javax.persistence.DiscriminatorValue
import javax.persistence.Entity
import javax.persistence.PrimaryKeyJoinColumn

@Entity
@DiscriminatorValue("A") // 엔티티를 저장할 때 구분 컬럼에 입력할 값을 지정한다.
//@PrimaryKeyJoinColumn(name = "ALBUM_ID") // 기본으로 부모 ID컬럼명을 그대로 사용하는데 만약 자식 테이블의 기본키 컬럼명을 변경하고 싶다면 이 옵션을 사용하면 된다.
class Album(
    val atrist: String
) : MainItem()

