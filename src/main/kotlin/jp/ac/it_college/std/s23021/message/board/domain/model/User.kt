package jp.ac.it_college.std.s23021.message.board.domain.model

import jp.ac.it_college.std.s23021.message.board.domain.types.RolyType
import kotlinx.serialization.Serializable

data class User(
    val id: Long = 0,
    val viewname: String,
    val email: String,
    val password: String,
    val roleType: RolyType,
    )