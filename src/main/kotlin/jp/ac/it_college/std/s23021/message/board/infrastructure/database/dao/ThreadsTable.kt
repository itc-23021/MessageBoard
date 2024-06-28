package jp.ac.it_college.std.s23021.message.board.infrastructure.database.dao

object ThreadsTable : Table("threads") {
    val id = long("id").autoIncrement()
    val title = varchar("title", 255)
    val createdAt = datetime("created_at")

    override val primaryKey = PrimaryKey(id)

    fun selectAll(): List<ResultRow> {
        return ThreadsTable.selectAll().toList()
    }

    fun ResultRow.toModel(): Thread {
        return Thread(
            id = this[ThreadsTable.id],
            title = this[ThreadsTable.title],
            createdAt = this[ThreadsTable.createdAt]
        )
    }
}