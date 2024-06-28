package jp.ac.it_college.std.s23021.message.board.infrastructure.database.dao

class UserEntity(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<UserEntity>(UsersTable)

    var viewName by UsersTable.viewName
    var email by UsersTable.email
    var password by UsersTable.password

    fun toDomain() = User(
        id.value,
        viewName,
        email,
        password
    )
}