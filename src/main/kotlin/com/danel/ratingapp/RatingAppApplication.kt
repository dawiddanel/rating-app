package com.danel.ratingapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RatingAppApplication

fun main(args: Array<String>) {
	runApplication<RatingAppApplication>(*args)
}
