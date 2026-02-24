package com.ejerciciocancion;

public class Usuario {

	private String nombreUsuario, correoElectronico, clavePrivada; 
	private boolean premium;
	
	public Usuario (String nombreUsuario, String correoElectronico, String clavePrivada, boolean premium){
		
		this.nombreUsuario=nombreUsuario;
		this.correoElectronico=correoElectronico;
		this.clavePrivada=clavePrivada;
		this.premium=premium;
		
	}
	
}
