package com.springsecurity.testCredentials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class testSecurity {
	
	@Bean
	public SecurityFilterChain  secfilterchain(HttpSecurity http) throws Exception {
		
	     http.csrf(csrfToken-> csrfToken.disable())
	          .authorizeHttpRequests(httprequest->httprequest.anyRequest().authenticated()) 
	          .httpBasic(Customizer.withDefaults())
	          .sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		return http.build();
	}
	
	@Autowired
	testUserServicedet tusd;
	
	@Bean
	public AuthenticationProvider authProv() {
		
		DaoAuthenticationProvider prov = new DaoAuthenticationProvider();
		
		
		prov.setUserDetailsService(tusd);
		//prov.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		prov.setPasswordEncoder(new BCryptPasswordEncoder(12));
		
		
		return prov;
	}

	
	
}
