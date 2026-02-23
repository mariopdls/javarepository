package com.ejult;

import java.time.*;

public class Cancion {
	
	private String titulo;
	private String artista;
	private double duracion;
	private String disco;
	private int anio_creacion;
	private long numero_reproducciones;

	
	public Cancion(String titulo, String artista, double duracion, String disco, int anioCreacion, long numero_reproducciones) {
		super();
		this.titulo=titulo;
		this.artista=artista;
		this.duracion=duracion;
		this.disco=disco;
		this.anio_creacion=anio_creacion;
		this.numero_reproducciones=numero_reproducciones;
		
		
	}
	
	

}
