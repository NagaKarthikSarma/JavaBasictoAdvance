package com.org.oauthsec.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigure {
	
	@Bean
	public SecurityFilterChain  secfilterchain(HttpSecurity http) throws Exception {
		
	     http  //.csrf(csrfToken-> csrfToken.disable())
	          .authorizeHttpRequests(httprequest->httprequest.anyRequest().authenticated()) 
	         // .httpBasic(Customizer.withDefaults())
	          
	          .oauth2Client(Customizer.withDefaults())
	          .formLogin(Customizer.withDefaults())
	          .sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
	     
		return http.build();
	}

	

}
