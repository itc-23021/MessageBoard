package jp.ac.it_college.std.s23021.message.board.presentation.contoroller

import jp.ac.it_college.std.s23021.message.board.application.service.security.MessageBoardUserDetails
import jp.ac.it_college.std.s23021.message.board.application.service.UserService
import jp.ac.it_college.std.s23021.message.board.infrastructure.database.dao.UsersTable.email
import jp.ac.it_college.std.s23021.message.board.infrastructure.database.dao.UsersTable.password
import jp.ac.it_college.std.s23021.message.board.infrastructure.database.dao.UsersTable.viewName
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
@CrossOrigin
class UserController(
    private val userService: UserService,
) {
    @PostMapping("/register")
    fun register(@RequestBody user: PostUserRegisterRequest) {
        user.run {
            userService.register(viewName, email, password)
        }
    }

    @GetMapping("/info")
    fun getInfo(
        @AuthenticationPrincipal user: MessageBoardUserDetails
    ): GetUserInfoResponse {
        return userService.find(user.getId()).run {
            GetUserInfoResponse(id, viewName)
        }
    }
}