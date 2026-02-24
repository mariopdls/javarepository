package com.ejerciciocancion;

public class OtraExcepcion extends Exception {

	public OtraExcepcion() {
	}

	public OtraExcepcion(String message) {
		super(message);
	}

	public OtraExcepcion(Throwable cause) {
		super(cause);
	}

	public OtraExcepcion(String message, Throwable cause) {
		super(message, cause);
	}

	public OtraExcepcion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
