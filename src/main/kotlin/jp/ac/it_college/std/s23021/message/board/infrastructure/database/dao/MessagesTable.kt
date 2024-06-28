package jp.ac.it_college.std.s23021.message.board.infrastructure.database.dao


object MessagesTable : LongIdTable() {
    val threadId = long("thread_id")
    val userId = long("user_id")
    val message = text("message")
    val postedAt = datetime("posted_at")
    val updatedAt = datetime("updated_at")
    val deleted = bool("deleted")
}