package com.ejerciciopersona;

public class Persona implements Comparable <Persona>{

	private String nombre;
	private String apellido;
	private int edad;
	private String direccion;
	private String telefono;
	
	
	public Persona(String nombre, String apellido, int edad, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido=apellido;
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;
	}


	@Override
	public int compareTo(Persona o) {
		return -(edad-o.edad);
		
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	


	
	

	

}
