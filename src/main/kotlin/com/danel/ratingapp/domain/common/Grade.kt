package com.danel.ratingapp.domain.common

import java.io.Serializable
import javax.persistence.Embeddable

@Embeddable
internal data class Grade(var value: Int): Serializable {

    companion object {
        private const val min = 0
        private const val max = 100
    }

    init {
        require(value in min..max) {
            "Grade must be in 0-100 range, inserted: '$value'."
        }
    }

}
