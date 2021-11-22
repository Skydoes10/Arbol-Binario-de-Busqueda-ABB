package model;

import java.util.Collection;

public class Programador {
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
		this.der = null;
		this.izq = null;
	}
	
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
		if(izq == null && der == null) {
			return true;
		}
		return false;
	}
	
	public Programador darMenor() {
		return izq;
	}
	
	public Programador darMayor() {
		return der;
	}
	
	public void setIzq(Programador izq) {
		this.izq = izq;
	}
	
	public void setDer(Programador der) {
		this.der = der;
	}
	
	public int darAltura() {
		return 0;
	}
	
	public int darPeso() {
		
		return 0;
	}
	
	public void insertar(Programador p) {
		
	}
	
	public Programador buscar(String nombre) {
		Programador p = null;
		
		return p;
	}
	
	public Programador eliminar(String nombre) {
		Programador p = null;
		
		return p;
	}
	
	public void inorden(Collection<String> acumulado) {
		
		
	}
	
}
