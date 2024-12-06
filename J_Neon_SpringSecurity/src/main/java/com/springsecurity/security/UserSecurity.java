package com.springsecurity.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.springsecurity.user.MyUserServiceDetails;

//@Configuration
//@EnableWebSecurity
public class UserSecurity {
	
	@Bean
	public SecurityFilterChain  secfilterchain(HttpSecurity http) throws Exception {
		
	     http.csrf(csrfToken-> csrfToken.disable())
	          .authorizeHttpRequests(httprequest->httprequest.anyRequest().authenticated()) 
	          .httpBasic(Customizer.withDefaults())
	          .sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		return http.build();
	}

//	@Bean
//	public UserDetailsService userdetser() {
//		
//		UserDetails user1 = User.withDefaultPasswordEncoder()
//									.username("Karthik")
//						             .password("K@123")
//						             .roles("USER")
//						             .build();
//		UserDetails user2 = User.withDefaultPasswordEncoder()
//				                 .username("sarma")
//				                 .password("12345")
//				                 .roles("Admin")
//				                 .build();
//		
//		return  new InMemoryUserDetailsManager(user1,user2);
//	}
	
@Autowired
MyUserServiceDetails myuseserdet;
	
	@Bean
	public AuthenticationProvider authProvider() {
		
	DaoAuthenticationProvider  provider = new  DaoAuthenticationProvider();
	
	provider.setUserDetailsService(myuseserdet);
	provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		
		return provider;
	}
	
	


	
}
