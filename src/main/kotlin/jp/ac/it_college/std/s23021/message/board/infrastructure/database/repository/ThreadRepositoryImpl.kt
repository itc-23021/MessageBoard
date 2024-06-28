package jp.ac.it_college.std.s23021.message.board.infrastructure.database.repository


//import jp.ac.it_college.std.s23021.message.board.domain.model.Thread
//import jp.ac.it_college.std.s23021.message.board.domain.repository.ThreadRepository
//import jp.ac.it_college.std.s23021.message.board.infrastructure.database.dao.ThreadsTable
//import jp.ac.it_college.std.s23021.message.board.infrastructure.database.dao.ThreadsTable.toModel
//import org.jetbrains.exposed.sql.transactions.transaction
//import org.springframework.stereotype.Repository
//
//@Repository
//class ThreadRepositoryImpl : ThreadRepository {
//    override fun findAll(): List<Thread> {
//        return transaction {
//            ThreadsTable.selectAll().map { it.toModel() }
//        }
//    }
//}