package com.ramninder.springcloud.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements SecurityService {

	@Autowired
	private UserDetailsService userDetailService;
	
	@Autowired
	private AuthenticationManager authManager;

	public boolean login(String username, String password) {
		UserDetails loadUserByUsername = userDetailService.loadUserByUsername(username);
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(password,
				loadUserByUsername, loadUserByUsername.getAuthorities());
		authManager.authenticate(token);
		boolean result = token.isAuthenticated();
		
		if(result) {
			SecurityContextHolder.getContext().setAuthentication(token);
		}
		return result;
	}

}
