package com.ej1OBJ;

public class Triangulo {

	private double [] lados = new double [3];
	
	public Triangulo(){
		
		this.lados[0]=1;
		this.lados[1]=1;
		this.lados[2]=1;
	}
	
	public double[] getLados() {
		return lados;
	}

	public void setLados(double[] lados) {
		this.lados = lados;
	}

	public Triangulo (double lado1, double lado2, double lado3) {
		
		this.lados[0]=lado1;
		this.lados[1]=lado2;
		this.lados[2]=lado3;
	}
	
	public void obtenerArea () { //para mi la base es 0
		
			double a = lados[0], b = lados[1], c = lados[2];
	        double semiperimetro = (a + b + c) / 2.0;
	        double resultado= Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));
		
	}
	
	public void esIsosceles() {

		if (lados[0]==lados[1] || lados[0]==lados[2]) { //si la base es igual a la altura
			System.out.println("Es isósceles");
		}
	}
	
	public void esEquilatero() {
		
		if (lados[2]==lados[1] && lados[0]== lados[2] && lados[0]== lados[1]) {
			System.out.println("El triangulo es equilátero");
		}
	}
		
	public void esEscaleno() {
		
		if (lados[2]!=lados[1] && lados[0]!= lados[2] && lados[0]!= lados[1]) {
			System.out.println("Es escaleno");
		}
	}
	
	public void calcularPerimetro() {
		
		double resultado=lados[0]+lados[1]+lados[2];
	}
	
	public void CalcularLongitud(Linea linea) {
		
		double hipotenusa = Math.sqrt(Math.pow(lados[0], 2) + Math.pow(lados[1], 2)); }
	
			

}

