package com.danel.ratingapp.domain

import com.danel.ratingapp.domain.common.Content
import com.danel.ratingapp.domain.common.Grade
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "OPINION")
internal class Opinion(

        @Id
        @GeneratedValue
        var id: Long,

        @ManyToOne(fetch = FetchType.LAZY)
        var product: Product,

        @Embedded
        @AttributeOverrides(AttributeOverride(name = "value", column = Column(name = "GRADE")))
        var grade: Grade,

        @Embedded
        @AttributeOverrides(AttributeOverride(name = "value", column = Column(name = "CONTENT")))
        var content: Content,

        @Column(name = "CREATION_DATE")
        var creationDate: Date

)
