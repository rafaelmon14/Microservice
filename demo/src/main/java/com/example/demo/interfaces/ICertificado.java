package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Certificado;

@Repository
public interface ICertificado extends CrudRepository<Certificado, Integer>{

}
