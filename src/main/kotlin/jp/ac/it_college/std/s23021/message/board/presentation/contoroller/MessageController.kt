package jp.ac.it_college.std.s23021.message.board.presentation.contoroller

//@RestController
//@RequestMapping("/messages")
//@CrossOrigin
//class MessageController(
//    private val messageService: MessageService,
//    private val threadService: ThreadService,
//) {
//    @GetMapping("/list/thread/{thread_id}")
//    fun getList(@PathVariable(value = "thread_id") threadId: Long): GetMessageListResponse {
//        val thread = threadService.getDetails(threadId)
//        val messages = messageService.getListByThread(thread.id)
//        return GetMessageListResponse(
//            threadId = thread.id, title = thread.title,
//            messages = messages.map(::MessageInfo)
//        )
//    }
//
//    @PostMapping("/post/thread/{thread_id}")
//    fun postMessage(
//        @PathVariable(value = "thread_id") threadId: Long,
//        @RequestBody req: PostMessageRequest,
//        @AuthenticationPrincipal user: MessageBoardUserDetails
//    ): PostedMessageResponse {
//        val newMessage = messageService.newPost(threadId, req.message, user.id)
//        return PostedMessageResponse(newMessage)
//    }
//
//    @PutMapping("/update/{id}")
//    fun putMessage(
//        @PathVariable(value = "id") id: Long,
//        @RequestBody req: PutMessageUpdateRequest,
//        @AuthenticationPrincipal user: MessageBoardUserDetails
//    ): MessageUpdateResponse {
//        val updatedMessage = messageService.updateMessage(id, req.message, user.id)
//        return updatedMessage.run {
//            MessageUpdateResponse(
//                id = id, threadId = thread?.id ?: IllegalArgumentException("Thread not found"), message = message, updatedAt = updatedAt
//            )
//        }
//    }
//
//    @DeleteMapping("/delete/{id}")
//    fun deleteMessage(
//        @PathVariable("id") id: Long,
//        @AuthenticationPrincipal user: MessageBoardUserDetails
//    ): MessageDeleteResponse {
//        val result = messageService.deleteMessage(id, user.id)
//        return result.run {
//            MessageDeleteResponse(id, thread?.id ?: throw IllegalArgumentException("Thread not found"), updatedAt)
//        }
//    }
//}