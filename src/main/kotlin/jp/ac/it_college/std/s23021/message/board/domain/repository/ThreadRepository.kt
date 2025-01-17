package jp.ac.it_college.std.s23021.message.board.domain.repository
import jp.ac.it_college.std.s23021.message.board.domain.model.Thread
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ThreadRepository {
    fun findAll(): List<Thread>
    fun findById(id: Long): Thread?
}