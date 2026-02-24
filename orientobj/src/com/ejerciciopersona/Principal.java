package com.ejerciciopersona;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		Persona persona1= new Persona ("Juan", "Perez", 20, "Calle lopez 32","98766621");
		Persona persona2= new Persona ("Hombre", "mas largo", 50, "Calle lopez 10","98766621");
		Persona persona3= new Persona ("Luis", "Porra", 32, "Calle Julia 32","98766621");
		Persona persona4= new Persona ("Pepe", "Orozco", 20, "Calle olo 32","98766621");
		
		Persona [] arraypersona = new Persona [] {persona1,persona2,persona3,persona4};
		
		Arrays.sort(arraypersona);
		
		System.out.println(Arrays.toString(arraypersona));
		
	}
	
	

}
