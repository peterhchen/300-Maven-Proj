package com.phone.SpringAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Apple getPhone() {
		return new Apple();
	}
	@Bean
	public MobileProcessor getProcessor() {
		return new Cyclone();
	}
}