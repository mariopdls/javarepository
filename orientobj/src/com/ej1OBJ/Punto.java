package com.ej1OBJ;

public class Punto {

	private double coordenadax;
	private double coordenaday;
	private double coordenadaxpunto2;
	private double coordenadaypunto2;
	
	
	public Punto(){
		this(0,0);
	}
	
	//constructor por defecto

	public Punto(double coordenadax, double coordenaday) {

		this.coordenadax= coordenadax;
		this.coordenaday=coordenaday; 
		
	}
	
	//ya tengo el constructor con parámetros
	
	public double calcularDistancia(double coordenadaxpunto2, double coordenadaypunto2){
		this.coordenadaxpunto2=coordenadaxpunto2;
		this.coordenadaypunto2=coordenadaypunto2;

		
		double formula= Math.sqrt((Math.pow((coordenadaxpunto2-this.coordenadax),2)) + (Math.pow((coordenadaypunto2-this.coordenaday),2)));
	
		return formula;
	}
	
	//Método que calcula la distancia entre puntos
	
	public void desplazarHorizontal (double cantidad_desplazar) {
		

		if (cantidad_desplazar>0) {
			double resultadopositivox=this.coordenadax+cantidad_desplazar;
			}
		
		else if (cantidad_desplazar<0) {
			double resultadonegativox=this.coordenadax+cantidad_desplazar;
		}
	}
	
	//metodo desplazar horizontal
	
	public void desplazarVertical (double cantidad_desplazar2) {
		

		if (cantidad_desplazar2>0) {
			double resultadopositivoy=this.coordenaday+cantidad_desplazar2;
			}
		
		else if (cantidad_desplazar2<0) {
			double resultadonegativoy=this.coordenaday+cantidad_desplazar2;
		}
						
	}
	
	//metodo desplazar vertical
	
	public String toString() {
		return "Punto (" + this.coordenadax +", " + this.coordenaday + ")";
	}
	
	//toString
	
	@Override
	public boolean equals(Object p) {
		return this.coordenadax == ((Punto)p).coordenadaxpunto2 && this.coordenaday == ((Punto)p).coordenadaypunto2;
	}
		
	
	//equals
	
	public double getCoordenadax() {
		return coordenadax;
	}
	public double getCoordenaday() {
		return coordenaday;
	}
	
	
	
}


