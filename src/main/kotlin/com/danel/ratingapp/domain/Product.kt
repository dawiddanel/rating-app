package com.danel.ratingapp.domain

import com.danel.ratingapp.domain.common.Name
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "PRODUCT")
internal class Product(

        @Id
        @GeneratedValue
        var id: Long,

        @OneToMany(mappedBy = "product")
        var opinions: MutableList<Opinion>,

        @ManyToOne(fetch = FetchType.LAZY)
        var rating: Rating,

        @Embedded
        @AttributeOverrides(AttributeOverride(name = "value", column = Column(name = "NAME")))
        var name: Name,

        @Embedded
        @Column(name = "PRICE")
        var price: Number,

        @Column(name = "CREATION_DATE")
        var creationDate: Date

)
