package jp.ac.it_college.std.s23021.message.board.domain.model

import kotlinx.datetime.LocalDateTime

data class Message (
    val id: Long = 0,
    val thread: Long,
    val users: Long,
    val message: String,
    val postedAt: LocalDateTime,
    val updateAt: LocalDateTime,
    val deleteAt: Boolean = false,
    val content: String
)