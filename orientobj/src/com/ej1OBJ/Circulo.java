package com.ej1OBJ;

public class Circulo {

	private double radio;
	
	public Circulo (){
		super();
		this.radio=1;
	}
	
	public Circulo (double radio) throws ExcepcionCirculo, ExcepcionSegunda  {
		this.radio=radio;
		
		if (radio<0) {
			
			throw new ExcepcionCirculo("Radio no valido");
		}
		
		else if (Double.isNaN(radio) ) {
			throw new ExcepcionSegunda("Debe ser un numero");
			
		}
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public void calcularArea (Circulo circulo) {
		double resultado= Math.PI * Math.pow(radio, 2);
		System.out.println("El resultado es " + resultado);
	}
	
	public void calcularPerimetro(Circulo circulo) {
		double resultado= 2*Math.PI*radio;
		System.out.println("El resultado es " + resultado);
	}
	
	@Override
	public String toString() {
		return "El radio es " + radio;
	}
	
	 
	
}
