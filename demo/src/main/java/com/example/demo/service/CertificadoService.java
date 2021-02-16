package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceService.ICertificadoService;
import com.example.demo.interfaces.ICertificado;
import com.example.demo.modelo.Certificado;

@Service
public class CertificadoService implements ICertificadoService{

	@Autowired
	private ICertificado data;
	@Override
	public List<Certificado> listar() {
		return (List<Certificado>)data.findAll();
	}

	@Override
	public Optional<Certificado> buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
