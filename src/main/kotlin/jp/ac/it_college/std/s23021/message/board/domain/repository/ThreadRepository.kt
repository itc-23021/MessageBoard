package jp.ac.it_college.std.s23021.message.board.domain.repository

@Repository
interface ThreadRepository {
    fun findAll(): List<Thread>
    fun findById(id: Long): Thread?
}