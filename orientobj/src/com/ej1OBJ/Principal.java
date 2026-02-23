package com.ej1OBJ;

public class Principal {
	
	public static void main(String[] args) {
		

		try {
			Circulo circulo1= new Circulo (9);
		} catch (ExcepcionCirculo e) {
			System.err.println(e);
		} catch (ExcepcionSegunda e) {
			System.err.println(e);
		}
		
		
	}
}
