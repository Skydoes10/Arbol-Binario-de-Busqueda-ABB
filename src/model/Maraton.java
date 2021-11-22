package model;

import java.util.ArrayList;

public class Maraton {
	private int numProgramadores;
	private Programador programadorRaiz;

	public Maraton() {
		numProgramadores = 0;
	}
	
	public void agregarProgramador(String nombre, String telefono, String direccion, String eMail) throws ProgramadorRepetidoException {
		Programador p = new Programador(nombre, telefono, direccion, eMail);
		if(programadorRaiz == null) {
			programadorRaiz = p;
			numProgramadores++;
		}else {
			agregarProgramador(programadorRaiz, p);
		}
	}
	
	public void agregarProgramador(Programador padre, Programador nuevoP) throws ProgramadorRepetidoException {
		if(buscarProgramador(nuevoP) == null)	{
			if(nuevoP.compareTo(padre) < 0) {
				if(padre.darMenor() != null) {
					agregarProgramador(padre.darMenor(), nuevoP);
				}else {
					padre.setIzq(nuevoP);
					numProgramadores++;
				}
			}else if(nuevoP.compareTo(padre) >= 0) {	
				if(padre.darMayor() != null) {
					agregarProgramador(nuevoP, padre.darMayor());
				}else {
					padre.setDer(nuevoP);
					numProgramadores++;
				}
			}
		}else {
			throw new ProgramadorRepetidoException(nuevoP.darNombre());
		}
	}
	
	public void eliminarProgramador(String nombre) {

	}
	
	public Programador buscarProgramador(Programador buscar) {
		if(programadorRaiz == null) {
			return null;
		}else {
			return buscarProgramador(buscar, programadorRaiz);
		}
	}
	
	public Programador buscarProgramador(Programador buscar, Programador actualP) {
		if(actualP == null) {
			return actualP;
		}else if(buscar.darNombre().equalsIgnoreCase(actualP.darNombre())) {
			return actualP;
		}else if(buscar.compareTo(actualP) < 0){
			return buscarProgramador(buscar, actualP.darMenor());
		}else {
			return buscarProgramador(buscar, actualP.darMayor());
		}
	}
	
	public ArrayList<String> inorden(ArrayList<String> nombresP, Programador actualP) {
		if(actualP != null) {
			inorden(nombresP, actualP.darMenor());
			nombresP.add( actualP.darNombre());
			inorden(nombresP, actualP.darMayor());
		}
		return nombresP;
	}	
	
	public ArrayList<String> darListaProgramadores() {
		return null;
	}
	
	public int darAltura(Programador actualP) {
		if(actualP == null)	{
			return 0;
		}else {
			return 1 + Math.max(darAltura(actualP.darMenor()), darAltura(actualP.darMayor()));
		}
	}

	public int getNumProgramadores() {
		return numProgramadores;
	}

	public Programador getProgramadorRaiz() {
		return programadorRaiz;
	}
	
}
