package model;

import java.util.Collection;

public class Programador implements Comparable<Programador>{
	private String nombre;
	private String telefono;
	private String direccion;
	private String eMail;
	private Programador izq;
	private Programador der;
	
	public Programador(String nombre, String telefono, String direccion, String eMail) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.eMail = eMail;
	}
	
	@Override
	public int compareTo(Programador p) {
		return nombre.compareToIgnoreCase(p.darNombre());
	}
	
	public String darNombre() {
		return nombre;
	}
	
	public String darTelefono() {
		return telefono;
	}

	public String darDireccion() {
		return direccion;
	}

	public String darEmail() {
		return eMail;
	}
	
	public boolean esHoja() {
		boolean esHoja = false;
		if(izq == null && der == null) {
			esHoja = true;
		}
		return esHoja;
	}
	
	public Programador darMenor() {
		return izq;
	}
	
	public Programador darMayor() {
		return der;
	}
	
	public int darAltura() {
		
		return 1;
	}
	
	public int darPeso() {
		
		return 1;
	}
	
	public void insertar() {
		
		
	}
	
	public Programador buscar(String nombre) {
		Programador p = null;
		
		return p;
	}
	
	public Programador eliminar(String nombre) {
		Programador p = null;
		
		return p;
	}
	
	public void inorden(Collection<?> programadores) {
		
		
	}

	
}
