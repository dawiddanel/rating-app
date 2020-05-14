package com.danel.ratingapp.domain

import com.danel.ratingapp.domain.common.Name
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "RATING")
internal class Rating(

        @Id
        @GeneratedValue
        var id: Long,

        @OneToMany(mappedBy = "rating")
        var products: MutableList<Product>,

        @Embedded
        @AttributeOverrides(AttributeOverride(name = "value", column = Column(name = "NAME")))
        var name: Name,

        @Column(name = "CREATION_DATE")
        var creationDate: Date

)
