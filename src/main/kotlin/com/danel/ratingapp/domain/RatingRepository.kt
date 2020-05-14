package com.danel.ratingapp.domain

import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

internal interface RatingRepository : JpaRepository<Rating, UUID>
