package com.example.jpademo.domain.entity.inherit

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("M")
class Movie(
    val director: String?,
    val actor: String?
) : MainItem()