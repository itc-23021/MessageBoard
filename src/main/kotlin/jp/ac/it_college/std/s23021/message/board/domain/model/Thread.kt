package jp.ac.it_college.std.s23021.message.board.domain.model

import kotlinx.datetime.LocalDateTime

class Thread (
    val id: Long = 0,
    val title: String,
    val userId: Long,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val deleted: Boolean = false
    )