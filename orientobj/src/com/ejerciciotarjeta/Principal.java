package com.ejerciciotarjeta;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		Tarjeta tarjeta1=new Tarjeta(4,2000,100);
		Tarjeta tarjeta2=new Tarjeta(2,2000,100);
		Tarjeta tarjeta3=new Tarjeta(1,2000,100);
		
		Tarjeta [] tarjetas=new Tarjeta [] {tarjeta1,tarjeta2,tarjeta3};
		
		Arrays.sort(tarjetas);
		
		System.out.println(Arrays.toString(tarjetas));
		
		
	}
	
}
