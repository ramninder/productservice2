//package com.ramninder.springcloud.security.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import com.ramninder.springcloud.security.UserDetailsServiceImpl;
//
//@Configuration
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	private UserDetailsServiceImpl userDetailService;
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(userDetailService);
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//
//		//http.httpBasic();
//		http.authorizeRequests().mvcMatchers(HttpMethod.GET, "/productapi", "/index").hasAnyRole("USER","ADMIN")
//		.mvcMatchers(HttpMethod.POST, "/productapi").hasRole("ADMIN")
//		.mvcMatchers("/", "/login").permitAll()
//		.and().csrf().disable();
//	}
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//	
//	
//	@Bean
//	public AuthenticationManager authenticationManagerBean() throws Exception {
//		return super.authenticationManagerBean();
//	}
//
//}
