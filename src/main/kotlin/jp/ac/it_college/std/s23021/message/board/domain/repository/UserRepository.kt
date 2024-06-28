package jp.ac.it_college.std.s23021.message.board.domain.repository

import jp.ac.it_college.std.s23021.message.board.domain.model.User

interface UserRepository {
    fun existsByEmail(email: String): Boolean
    fun save(user: User): User
    fun findById(id: Long): User?
    fun findByEmail(email: String): User?
}