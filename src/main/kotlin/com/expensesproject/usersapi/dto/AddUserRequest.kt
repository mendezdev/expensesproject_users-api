package com.expensesproject.usersapi.dto

data class AddUserRequest(
        val nickname: String? = null,
        val email: String,
        val password: String)