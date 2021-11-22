package model;


public class ProgramadorRepetidoException extends Exception {

	private static final long serialVersionUID = 1L;

	public ProgramadorRepetidoException(String message) {
		super("\nEl programador "+ message +" ya habia sido registrado antes\n");
	}
	
}
