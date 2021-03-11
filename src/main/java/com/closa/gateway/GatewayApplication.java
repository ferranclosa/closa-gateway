package com.closa.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;


@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient

public class GatewayApplication {

	@CrossOrigin(origins = {"http://localhost:3000"})
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	/*@Bean
	CorsConfigurationSource corsConfigurationSource(){
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowedOrigins(Arrays.asList("*"));
		config.setAllowedMethods(Arrays.asList("OPTIONS", "GET", "POST"));
		config.setAllowedHeaders(Arrays.asList("Origin", "X-Requested-Width", "X-PINGOTHER", "Content-Type", "Authorization"));
		config.applyPermitDefaultValues();
		config.setAllowCredentials(true);
		source.registerCorsConfiguration("/auth/**", config);
		source.registerCorsConfiguration("/api/**", config);
		return source;
	}*/
}
