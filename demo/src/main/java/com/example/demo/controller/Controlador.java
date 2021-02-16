package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfaceService.ICertificadoService;
import com.example.demo.modelo.Certificado;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private ICertificadoService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Certificado>certificado=service.listar();
		model.addAttribute("certificados", certificado);
		return "index";
	}
	
	@GetMapping("/buscar/{id}")
	public String buscar(@PathVariable int id, Model model) {
		model.addAttribute("certificados", service.buscar(id));
		return "form";
	}
	
	
	
}
