package jp.ac.it_college.std.s23021.message.board.presentation.contoroller

import jp.ac.it_college.std.s23021.message.board.application.service.security.*
import jp.ac.it_college.std.s23021.message.board.infrastructure.database.dao.MessagesTable.updatedAt
import org.bouncycastle.asn1.x500.style.RFC4519Style.title
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/threads")
@CrossOrigin
class ThreadController(
    private val service: ThreadService
) {
    @GetMapping("/list")
    fun getList(): GetThreadListResponse {
        val threadList = service.getList().map(::ThreadInfo)
        return GetThreadListResponse(threadList)
    }

    @PostMapping("/create")
    fun create(
        @RequestBody body: PostThreadRequest,
        @AuthenticationPrincipal user: MessageBoardUserDetails
    ): CreatedThreadResponse {
        val newId = service.newPost(body.title, body.message, user.id)
        return CreatedThreadResponse(newId)
    }

    @PutMapping("/update/{id}")
    fun update(
        @PathVariable id: Long,
        @RequestBody body: PutThreadUpdateRequest,
        @AuthenticationPrincipal user: MessageBoardUserDetails
    ): ThreadUpdateResponse {
        val thread = service.updateTitle(id, body.title, user.id)
        return thread.run { ThreadUpdateResponse(id, title) }
    }

    @DeleteMapping("/delete/{id}")
    fun deleteThread(
        @PathVariable id: Long,
        @AuthenticationPrincipal user: MessageBoardUserDetails
    ): ThreadDeleteResponse {
        val result = service.delete(id, user.id)
        return result.run {
            ThreadDeleteResponse(id, title, updatedAt)
        }
    }
}