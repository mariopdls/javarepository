package com.ej1OBJ;

public class ExcepcionSegunda extends Exception {

	public ExcepcionSegunda() {
		
	}

	public ExcepcionSegunda(String message) {
		super(message);
	}

	public ExcepcionSegunda(Throwable cause) {
		super(cause);
	}

	public ExcepcionSegunda(String message, Throwable cause) {
		super(message, cause);
	}

	public ExcepcionSegunda(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
