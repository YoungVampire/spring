package com.etoak.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.etoak.JayZhou;
import com.etoak.classroom.Classroom;
@Configuration
public class Config {
	@Bean
	public JayZhou jayZhou(){
		return new JayZhou();
	}
	@Bean
	public Classroom classroom(){
		return new Classroom();
	}
}
