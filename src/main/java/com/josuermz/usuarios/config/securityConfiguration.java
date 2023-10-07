package com.josuermz.usuarios.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.core.userdetails.User;

@Configuration
@EnableWebSecurity
public class securityConfiguration {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeRequests().requestMatchers("/datos").authenticated() // Página 'datos' requiere autenticación
				.anyRequest().permitAll() // Todas las demás rutas están permitidas sin autenticación
				.and().formLogin() // Habilitar el formulario de inicio de sesión
				.loginPage("/login") // Página de inicio de sesión personalizada
				.defaultSuccessUrl("/datos") // Página a la que se redirige después de una autenticación exitosa
				.permitAll();
		return http.build();
	}

	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
		UserDetails user = User.withDefaultPasswordEncoder().username("admin").password("contraseña").roles("USER")
				.build();
		return new InMemoryUserDetailsManager(user);
	}
}
