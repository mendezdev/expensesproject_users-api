package com.expensesproject.usersapi.transformer

import com.expensesproject.usersapi.domain.User
import com.expensesproject.usersapi.dto.AddUserRequest
import com.expensesproject.usersapi.dto.UserResponse

fun User?.toUserResponse(): UserResponse {
    return UserResponse(
            id = this?.id ?: "NO_ID",
            nickname = this?.nickname ?: "NO_NICKNAME",
            email = this?.email ?: "NO_EMAIL"
    )
}

fun AddUserRequest.toUser(): User {
    return User(
            nickname = this.nickname,
            email = this.email,
            password = this.password
    )
}