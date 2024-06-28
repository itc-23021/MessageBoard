package jp.ac.it_college.std.s23021.message.board.infrastructure.database.dao
import org.jetbrains.exposed.dao.id.LongIdTable
import org.jetbrains.exposed.sql.SqlExpressionBuilder.isNotNull

object UsersTable : LongIdTable("users") {
    val viewName = varchar("view_name", 32)
    val email = varchar("email", 256).uniqueIndex()
    val password = varchar("password", 128)
}