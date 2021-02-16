package com.example.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "certificado")
public class Certificado {
	
	// Datos certidicado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombreCurso;
	private String nombreInstitucion;
	private int numeroHoras;
	private String edicionCurso;
	private String nombreInstructor;
	private double costo;
	private String fecha;
	
	// Datos estudiante
	private String nombreEstudiante;
	private String email;
	private String estado;
	private String mencion;
	
	public Certificado() {
	
	}

	public Certificado(int id, String nombreCurso, String nombreInstitucion, int numeroHoras, String edicionCurso,
			String nombreInstructor, double costo, String fecha, String nombreEstudiante, String email, String estado,
			String mencion) {
		super();
		this.id = id;
		this.nombreCurso = nombreCurso;
		this.nombreInstitucion = nombreInstitucion;
		this.numeroHoras = numeroHoras;
		this.edicionCurso = edicionCurso;
		this.nombreInstructor = nombreInstructor;
		this.costo = costo;
		this.fecha = fecha;
		this.nombreEstudiante = nombreEstudiante;
		this.email = email;
		this.estado = estado;
		this.mencion = mencion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public String getNombreInstitucion() {
		return nombreInstitucion;
	}

	public void setNombreInstitucion(String nombreInstitucion) {
		this.nombreInstitucion = nombreInstitucion;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public String getEdicionCurso() {
		return edicionCurso;
	}

	public void setEdicionCurso(String edicionCurso) {
		this.edicionCurso = edicionCurso;
	}

	public String getNombreInstructor() {
		return nombreInstructor;
	}

	public void setNombreInstructor(String nombreInstructor) {
		this.nombreInstructor = nombreInstructor;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMencion() {
		return mencion;
	}

	public void setMencion(String mencion) {
		this.mencion = mencion;
	}
	
	
	
	
}
