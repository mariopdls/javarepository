package com.ejerciciotarjeta;

import java.util.Scanner;

public class Tarjeta implements Comparable <Tarjeta>{
	
	private int acumcredito;
	private double calificacion_crediticia;
	private double limite_gasto;
	private double dineroacumulado;
	
	public Tarjeta(double calificacion_crediticia, double limite_gasto, double dinero){
		this.calificacion_crediticia=calificacion_crediticia;
		this.limite_gasto=limite_gasto;
		this.dineroacumulado=dinero;
		
		setLimite_gasto(limite_gasto);
		setCalificacion_crediticia(calificacion_crediticia);
		setDinero(dinero);
	}
	


	
	public void setLimite_gasto(double limite_gasto) {
		this.limite_gasto = limite_gasto;
		if (limite_gasto>2000) {
			System.out.println("El límite de gasto es de 0 a 2000");
		}
	}

	public void setCalificacion_crediticia(double calificacion_crediticia) {
		
		if (calificacion_crediticia<1 || calificacion_crediticia>10) {
			System.out.println("La calificación crediticia debe estar entre 1 y 10");
		}
		this.calificacion_crediticia = calificacion_crediticia;
	}
	
	public void setDinero(double dinero) {
		this.dineroacumulado = dinero;
		
		if (dinero>2000 || dinero <0) {
			System.out.println("El máximo que puedes tener es 2000"); //excepción :)
		}
	}
	
	public void fueraLimite() {
		
			System.out.println("Has pasado el límite de gasto. Te restaremos 1 en la calificación crediticia y 200 euros en limite de gasto.");
			double resultado= calificacion_crediticia-1;
			double resultadolimite= limite_gasto-200;
			System.out.println("Has superado el límite. Tu crédito se ha reiniciado. Ahora tu calificación crediticia es de " + resultado + " y tu límite es: " + resultadolimite);
			acumcredito+=1;
			dineroacumulado=0;
			limite_gasto=resultadolimite;
			calificacion_crediticia=resultado;		
	}
	
	public void infoTarjeta( ) {
		
		System.out.println("Tienes " + limite_gasto + " de límite para gastar. Has superado el límite " + acumcredito + " veces. Tu crédito actual es de " + dineroacumulado + " y tu calificacion crediticia de " + calificacion_crediticia);
	}
	
	public void saldar() {
	    dineroacumulado = 0;
	    System.out.println("Deuda saldada.Tu crédito gastado actual es de 0€");
	}

	
	public void comprarCosas() {
		
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Cuanto vale lo que vas a comprar");
	    double respuesta = sc.nextDouble();

	    dineroacumulado += respuesta;

	    if (dineroacumulado > limite_gasto) {
	        fueraLimite();
	    }

	    System.out.println("Quieres seguir comprando");
	    String respuesta2 = sc.next();

	    while (respuesta2.equalsIgnoreCase("si")) {

	        System.out.println("Cuanto vale lo que vas a comprar");
	        respuesta = sc.nextDouble();

	        dineroacumulado += respuesta;

	        if (dineroacumulado > limite_gasto) {
	            fueraLimite();
	        }

	        System.out.println("Quieres seguir comprando");
	        respuesta2 = sc.next();
	    }
	}




	@Override
	public String toString() {
		return "Tarjeta [acumcredito=" + acumcredito + ", calificacion_crediticia=" + calificacion_crediticia
				+ ", limite_gasto=" + limite_gasto + ", dineroacumulado=" + dineroacumulado + "]";
	}




	@Override
	public int compareTo(Tarjeta o) {
		
		return 0;
	}


	
}
