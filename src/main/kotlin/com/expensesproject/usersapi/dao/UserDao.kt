package com.expensesproject.usersapi.dao

import com.expensesproject.usersapi.domain.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserDao: MongoRepository<User, String>