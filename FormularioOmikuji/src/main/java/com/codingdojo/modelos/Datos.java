package com.codingdojo.modelos;

public class Datos {
	private int numero;
	private String ciudad;
	private String persona;
	private String hobby;
	private String servivo;
	private String descripcion;
	
	public Datos(int numero, String ciudad, String persona, String hobby, String servivo, String descripcion) {
		this.numero = numero;
		this.ciudad = ciudad;
		this.persona = persona;
		this.hobby = hobby;
		this.servivo = servivo;
		this.descripcion = descripcion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getServivo() {
		return servivo;
	}

	public void setServivo(String servivo) {
		this.servivo = servivo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
