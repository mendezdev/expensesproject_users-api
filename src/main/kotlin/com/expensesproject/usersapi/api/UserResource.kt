package com.expensesproject.usersapi.api

import com.expensesproject.usersapi.api.UserResource.Companion.BASE_USER_URL
import com.expensesproject.usersapi.dto.AddUserRequest
import com.expensesproject.usersapi.dto.UserResponse
import com.expensesproject.usersapi.services.UserManagementService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RestController
@RequestMapping(value = [BASE_USER_URL])
class UserResource(
        private val userManagementService: UserManagementService
) {

    @GetMapping("/{id}")
    fun finById(@PathVariable id: String): ResponseEntity<UserResponse?> {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(this.userManagementService.findById(id))
    }

    @PostMapping
    fun save(@RequestBody addUserRequest: AddUserRequest): ResponseEntity<UserResponse> {
        val userResponse = this.userManagementService.save(addUserRequest)
        return ResponseEntity
                .created(URI.create(BASE_USER_URL.plus("/${userResponse.id}")))
                .body(userResponse)
    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: String): ResponseEntity<Unit> {
        this.userManagementService.deleteById(id)
        return ResponseEntity.noContent().build()
    }

    companion object {
        const val BASE_USER_URL: String = "/api/users"
    }
}