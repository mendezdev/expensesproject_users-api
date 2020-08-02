package com.expensesproject.usersapi.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "Users")
data class User (
        @Id
        val id: String? = null,
        val nickname: String? = null,
        val email: String,
        val password: String
)