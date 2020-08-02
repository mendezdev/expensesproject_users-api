package com.expensesproject.usersapi.services

import com.expensesproject.usersapi.dao.UserDao
import com.expensesproject.usersapi.domain.User
import com.expensesproject.usersapi.dto.AddUserRequest
import com.expensesproject.usersapi.dto.UserResponse
import com.expensesproject.usersapi.transformer.toUser
import com.expensesproject.usersapi.transformer.toUserResponse
import org.springframework.data.repository.findByIdOrNull

class UserManagementServiceImpl(
        private val userDao: UserDao
) : UserManagementService {
    override fun findById(id: String): UserResponse? = this.findUserById(id).toUserResponse()

    override fun save(userRequest: AddUserRequest): UserResponse {
        return this.userDao.insert(userRequest.toUser()).toUserResponse()
    }

    override fun deleteById(id: String) {
        this.deleteById(id)
    }

    private fun findUserById(id:String): User? = this.userDao.findByIdOrNull(id)
}