package jp.ac.it_college.std.s23021.message.board.domain.repository

interface MessageRepository {
    fun findByThreadId(threadId: Long): List<Message>
    fun findById(id: Long): Message?
    fun create(message: Message): Message
    fun update(message: Message): Message
    fun deleteById(id: Long)
}