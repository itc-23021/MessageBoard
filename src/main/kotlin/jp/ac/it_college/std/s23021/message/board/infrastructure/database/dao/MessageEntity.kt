package jp.ac.it_college.std.s23021.message.board.infrastructure.database.dao

import jp.ac.it_college.std.s23021.message.board.domain.model.Message
import kotlinx.datetime.LocalDateTime

data class MessageEntity(
    val id: Long,
    val threadId: Long,
    val userId: Long,
    val message: String,
    val postedAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val deleted: Boolean
) {
    fun toMessage() = Message(
        id = id,
        threadId = threadId,
        userId = userId,
        message = message,
        postedAt = postedAt,
        updatedAt = updatedAt,
        deleted = deleted
    )
}