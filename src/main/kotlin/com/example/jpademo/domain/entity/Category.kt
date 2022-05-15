package com.example.jpademo.domain.entity

import org.hibernate.mapping.Join
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.ManyToMany
import javax.persistence.ManyToOne
import javax.persistence.OneToMany

@Entity
data class Category(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORY_ID")
    var id: Long,

    var name: String,

    @ManyToMany
    @JoinTable(
        name = "CATEGOTY_ITEM",
        joinColumns = [JoinColumn(name = "CATEGORY_ID")],
        inverseJoinColumns = [JoinColumn(name = "ITEM_ID")]
    )
    var items: MutableList<Item> = mutableListOf(),

    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    var parent: Category,

    @OneToMany(mappedBy = "parent")
    var child: MutableList<Category> = mutableListOf()
    )

fun Category.addChildCategory(category: Category) {
    this.child.add(category)
    category.parent = this
}

fun Category.addItem(item: Item) {
    items.add(item)
}
