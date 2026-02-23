package com.ej1OBJ;

public class ExcepcionCirculo extends Exception {

	public ExcepcionCirculo() {
	}

	public ExcepcionCirculo(String message) {
		super(message);
	}

	public ExcepcionCirculo(Throwable cause) {
		super(cause);
	}

	public ExcepcionCirculo(String message, Throwable cause) {
		super(message, cause);
	}

	public ExcepcionCirculo(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
