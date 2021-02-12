package com.rafael.beans;

import org.springframework.stereotype.Component;

import com.rafael.interfaces.IEquipo;

@Component
public class Barcelona implements IEquipo{

	@Override
	public String mostrar() {
		return "Barcelona FC";
	}

}
