package com.ejerciciocancion;

import java.time.*;

public class Cancion {

	private String titulo;
	private String artista;
	private double duracion;
	private String disco;
	private int anioCreacion; 
	private int numeroReproducciones;

	public Cancion (String titulo, String artista, double duracion, String disco, int anioCreacion, int numeroReproducciones){
		
		this.titulo=titulo;
		this.artista=artista;
		this.duracion=duracion;
		this.disco=disco;
		this.anioCreacion=anioCreacion;
		this.numeroReproducciones=numeroReproducciones;
		
	}
	
	@Override
	public String toString() {
		return titulo;
	}
	
	@Override
	public boolean equals(Object p) {
	    return this.titulo.equals(((Cancion)p).titulo);
	}
	
}