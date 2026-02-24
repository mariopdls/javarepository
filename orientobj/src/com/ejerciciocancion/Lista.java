package com.ejerciciocancion;

import java.time.*;
import java.util.Arrays;

import com.ej1OBJ.Punto;

public class Lista {
	
 	private String nombre; 
 	private Usuario usuario1;
 	private int coleccionReproducciones;
 	private LocalDate fechaCreacion;
	private String ultimaCancionReproducida;
	private Cancion [] listarepro= new Cancion [10];
	private Cancion cancion;
	
	public Lista(Usuario usuario1, String nombre,int coleccionReproducciones,LocalDate fechaCreacion, String ultimaCancionReproducida) {
		
		this.nombre=nombre;
		this.usuario1=usuario1;
		this.coleccionReproducciones=coleccionReproducciones;
		this.fechaCreacion=fechaCreacion;
		this.ultimaCancionReproducida=ultimaCancionReproducida;
		
	}
	
	public void mostrarLista() {
		
		System.out.println(Arrays.toString(listarepro));
		
	}
	
	public void agregarCanciones(Cancion cancion) {
		
		for (int i = 0; i < listarepro.length; i++) {
			if (listarepro[i]==null) {
				listarepro[i]=cancion;
				break;
			}
		}
		
		
	}
	
	public boolean eliminarCanciones(Cancion cancion) throws ExcepcionesClase {

	    for (int i = 0; i < listarepro.length; i++) {
	        if (listarepro[i] != null && listarepro[i].equals(cancion)) {
	            listarepro[i] = null;
	            return true;
	        }
	    }

	    throw new ExcepcionesClase("No está");
	}

	public void reproducirSiguiente() {
		
	}

	
	public void reproducir() {
		
	}
	

}