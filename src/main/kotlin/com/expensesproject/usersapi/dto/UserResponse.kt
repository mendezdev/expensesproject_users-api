package com.expensesproject.usersapi.dto

data class UserResponse(
        val id: String,
        val nickname: String,
        val email: String
)