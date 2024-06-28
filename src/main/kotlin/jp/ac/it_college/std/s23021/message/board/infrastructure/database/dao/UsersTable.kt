package jp.ac.it_college.std.s23021.message.board.infrastructure.database.dao

object UsersTable : LongIdTable("users") {
    val viewName = varchar("view_name", 32)
    val email = varchar("email", 256).uniqueIndex()
    val password = varchar("password", 128)
}