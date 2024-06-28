package jp.ac.it_college.std.s23021.message.board.domain.model

import kotlinx.serialization.Serializable

data class User(
    val id: Long,
    var viewName: String,
    val email: String,
    var password: String
)