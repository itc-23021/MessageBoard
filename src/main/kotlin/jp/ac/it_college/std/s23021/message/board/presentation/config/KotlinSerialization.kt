package jp.ac.it_college.std.s23021.message.board.presentation.config

@Configuration
@EnableWebSecurity
class SecurityConfig {
    @Bean
    @Order(1)
    fun configure(http: HttpSecurity): SecurityFilterChain {
        http {
            csrf { disable() }
            authorizeHttpRequests {
                authorize("/users/register", "/login", authenticated)
                authorize(anyRequest, permitAll)
            }
            formLogin {
                loginPage = "/login"
                permitAll()
            }
            httpBasic {}
        }
        return http.build()
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return BCryptPasswordEncoder()
    }
}