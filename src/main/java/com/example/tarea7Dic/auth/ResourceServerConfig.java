package com.example.tarea7Dic.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;


@Configuration
@EnableResourceServer
//especificamos a qué daremos autorización
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	@Override
	//pasamos un método que sea accesible sin autenticación (api/alumnos)
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/api/alumnos").permitAll()
		.anyRequest().authenticated();
	}

	
	
}
