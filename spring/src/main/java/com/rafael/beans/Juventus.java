package com.rafael.beans;

import org.springframework.stereotype.Component;

import com.rafael.interfaces.IEquipo;

@Component
public class Juventus implements IEquipo{

	@Override
	public String mostrar() {
		return "Juventus";
	}

}
