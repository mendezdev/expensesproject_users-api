package com.expensesproject.usersapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class UsersApiApplication {
	@GetMapping
	fun hi(): String = "HELLO WORLD"
}

fun main(args: Array<String>) {
	runApplication<UsersApiApplication>(*args)
}
