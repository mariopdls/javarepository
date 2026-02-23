package com.ejult;

import java.time.*;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Usuario usuario1=new Usuario ("mario2002", "marpor2@gmail.com", "papasfritas", false);
		
		
		Lista lista1 = new Lista();
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Dime una cancion");
		String titulo= sc.nextLine();
		
		System.out.println("Dime un artista");
		String artista= sc.nextLine();
		
		
		System.out.println("Dime la duracion (formato x,xx");
		double duracion= sc.nextDouble();
		
		
		System.out.println("Dime el disco");
		String disco= sc.nextLine();
		
		System.out.println("Dime el año de creacion");
		int aniocreacion= sc.nextInt();

		System.out.println("Dime el numero de reproducciones");
		long numrepros= sc.nextLong();
		
		
		Cancion song1= new Cancion (titulo, artista, duracion, disco, aniocreacion, numrepros);

		
		
	}

}
