package com.expensesproject.usersapi.services

import com.expensesproject.usersapi.dto.AddUserRequest
import com.expensesproject.usersapi.dto.UserResponse

interface UserManagementService {
    fun findById(id: String): UserResponse?
    fun save(userRequest: AddUserRequest): UserResponse
    fun deleteById(id: String)
}