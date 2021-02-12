package com.rafael.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rafael.beans.Barcelona;
import com.rafael.beans.Juventus;
import com.rafael.beans.Camiseta;
import com.rafael.beans.Jugador;
import com.rafael.beans.Marca;

@Configuration
public class AppConfig {
	
	@Bean
	public Jugador jugador1() {
		return new Jugador();
	}
	
	@Bean
	public Barcelona barcelona() {
		return new Barcelona();
	}
	
	@Bean
	public Juventus juventus() {
		return new Juventus();
	}
	
	@Bean
	public Camiseta camiseta() {
		return new Camiseta();
	}
	
	@Bean
	public Marca marca() {
		return new Marca();
	}
}
