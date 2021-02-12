package com.rafael.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rafael.beans.Barcelona;
import com.rafael.beans.Jugador;
import com.rafael.beans.Juventus;
import com.rafael.beans.mundo;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Elija un equipo: 1.- Barcelona 2.- Juventus");
		int resp = sc.nextInt();
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Jugador jug = (Jugador) appContext.getBean("jugador1");
		
		
		switch (resp) {
		case 1:
			jug.setEquipo(new Barcelona());
			break;
		case 2:
			jug.setEquipo(new Juventus());
		default:
			break;
		}
		
		
		System.out.println(jug.getNombre() + " - " + jug.getEquipo().mostrar() + " - " + jug.getCamiseta().getNumero()+ " - " + jug.getCamiseta().getMarca().getNombre());
		
		
		((ConfigurableApplicationContext) appContext).close();

	}

}
