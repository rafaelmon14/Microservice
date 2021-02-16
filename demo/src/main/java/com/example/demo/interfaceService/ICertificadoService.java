package com.example.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelo.Certificado;

public interface ICertificadoService {
	
	public List<Certificado>listar();
	public Optional<Certificado>buscar(int id);
}
