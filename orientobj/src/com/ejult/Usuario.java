package com.ejult;

public class Usuario {

	private String nombre_usuario;
	private String correo;
	private String contrasenia;
	private boolean espremium=false;
	
	public Usuario() {
		super();
	}
	
	public Usuario(String nombre_usuario,String correo,String contrasenia,boolean espremium) {
		super();
		this.nombre_usuario=nombre_usuario;
		this.correo=correo;
		this.contrasenia=contrasenia;
		this.espremium=espremium;

	}

}
