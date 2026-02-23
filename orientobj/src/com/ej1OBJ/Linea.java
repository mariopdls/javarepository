package com.ej1OBJ;

public class Linea {

	private Punto extremo1;
	private Punto extremo2;
	
	public Linea() {
		super();
	}
	
	public Linea (double extremo1x, double extremo1y,double extremo2x, double extremo2y) {
		this.extremo1=new Punto (extremo1x,extremo1y);
		this.extremo2=new Punto (extremo2x,extremo2y);
	}

	public Linea (Punto extremo1, Punto extremo2) {
		this.extremo1=extremo1;
		this.extremo2=extremo2;
	}
	
	public void desplazarHorizontal (double desplazar) {
		extremo1.desplazarHorizontal(desplazar);
		extremo2.desplazarHorizontal(desplazar);
	}
	
	public void desplazarVertical (double desplazar) {
		extremo1.desplazarVertical(desplazar);
		extremo2.desplazarVertical(desplazar);
	}
	
	public void obtenerLong(double extremo1, double extremo2) {
		
	}
	
	@Override
	public String toString() {
		return "el punto 1 es " + this.extremo1 + " y el punto 2 es " + this.extremo2;
	}
	
	
	
}

