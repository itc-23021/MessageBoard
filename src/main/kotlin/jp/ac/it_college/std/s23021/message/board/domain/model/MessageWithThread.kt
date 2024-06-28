package jp.ac.it_college.std.s23021.message.board.domain.model

import kotlinx.datetime.LocalDateTime

data class Thread(
    val id: Long,
    val title: String,
    val createdAt: LocalDateTime
)