package jp.ac.it_college.std.s23021.message.board.application.service.security

import jp.ac.it_college.std.s23021.message.board.domain.model.User
import jp.ac.it_college.std.s23021.message.board.domain.repository.UserRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class MessageBoardUserDetailsService (private val userRepository: UserRepository) : UserDetailsService {
    override fun loadUserByUsername(username: String?): UserDetails {
        val user: User = userRepository.findByEmail(username ?: throw UsernameNotFoundException("Email not provided"))
            ?: throw UsernameNotFoundException("User not found with username: $username")

        return MessageBoardUserDetails(user)
    }
}
class MessageBoardUserDetails(private val user: User) : UserDetails {
    override fun getAuthorities() = emptyList<org.springframework.security.core.GrantedAuthority>()
    override fun getPassword() = user.password
    override fun getUsername() = user.email
    override fun isAccountNonExpired() = true
    override fun isAccountNonLocked() = true
    override fun isCredentialsNonExpired() = true
    override fun isEnabled() = true

    fun getId(): Long {
        return user.id
    }
}