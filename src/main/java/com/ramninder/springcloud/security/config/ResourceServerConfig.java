package com.ramninder.springcloud.security.config;

import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	private static final String PRODUCT_SERVICE = "productService";

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		resources.resourceId(PRODUCT_SERVICE);
	}

	public void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().mvcMatchers(HttpMethod.GET, "/productapi").hasAnyRole("USER", "ADMIN")
				.mvcMatchers(HttpMethod.POST, "/productapi").hasRole("ADMIN").and().csrf().disable();

	}
}