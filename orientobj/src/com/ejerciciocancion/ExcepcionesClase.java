package com.ejerciciocancion;

public class ExcepcionesClase extends Exception {

	public ExcepcionesClase() {
	}

	public ExcepcionesClase(String message) {
		super(message);
	}

	public ExcepcionesClase(Throwable cause) {
		super(cause);
	}

	public ExcepcionesClase(String message, Throwable cause) {
		super(message, cause);
	}

	public ExcepcionesClase(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
