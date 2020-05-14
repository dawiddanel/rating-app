package com.danel.ratingapp.domain.common

import java.io.Serializable
import javax.persistence.Embeddable

@Embeddable
internal data class Content(var value: String) : Serializable {

    companion object {
        private const val maximumSize = 255
    }

    init {
        require(value.length < maximumSize) {
            "Content cannot be longer than 255 characters, inserted: '$value'."
        }
    }

}
