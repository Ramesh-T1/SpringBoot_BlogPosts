package blogpost.project.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class SecurityConfig {
	
	public static final String[] WHITELIST= {
			"/",
			"/home",
			"/login",
			"/register",
			"/addPost",
			"/db-console/**",
			"/logout"
	};
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		http
		.authorizeHttpRequests()
		.requestMatchers(WHITELIST)
		.permitAll()
		.anyRequest()
		.authenticated();
		
		
		return http.build();
		
	}
	
	// TODO: remove these after upgrading the DB from H2 infile DB
   // http.csrf().disable();
   // http.headers().frameOptions().disable();


}
