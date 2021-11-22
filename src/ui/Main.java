package ui;

import java.util.ArrayList;
import java.util.Scanner;
import model.Maraton;
import model.ProgramadorRepetidoException;

public class Main {
	
	public static Maraton maraton;
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		maraton = new Maraton();
		boolean menu = true;
		while(menu) {
			System.out.println("\nSeleccione una opcion:\n"
					+ "1. Registrar programador\n"
					+ "2. Mostrar número de programadores\n"
					+ "3. Mostrar lista de programadores\n"
					+ "4. Salir\n");
			
			int option = Integer.parseInt(sc.nextLine());
			
			switch(option) {
			case 1: registrarProgramador();
				break;
			case 2: mostrarNumerosDeP();
				break;
			case 3: mostrarLista();
				break;
			case 4: System.out.println("\nAdios!");
					menu = false;
				break;
			default:
					System.out.println("\nError, opción invalida");
			}
		}
	}
	
	public static void registrarProgramador() {
			System.out.println("\nEscriba el nombre:");
			String nombre = sc.nextLine();
			System.out.println("\nEscriba el telefono:");
			String telefono = sc.nextLine();
			System.out.println("\nEscriba la dirección:");
			String direccion = sc.nextLine();
			System.out.println("\nEscriba el email:");
			String email = sc.nextLine();
			try {
				maraton.agregarProgramador(nombre, telefono, direccion, email);
			} 
			catch (ProgramadorRepetidoException pre) {
				System.err.println(pre.getMessage());
			}
	}
	
	
	public static void mostrarLista() {
		ArrayList<String> nombresP = new ArrayList<String>();
		nombresP = maraton.inorden(nombresP, maraton.getProgramadorRaiz());
		if(nombresP.isEmpty()) {
			System.out.println("Sin datos");
		}else {
			System.out.println("\n");
			for(int i = 0; i < nombresP.size(); i++) {
				System.out.println(nombresP.get(i));
			}
			System.out.println("\nAltura: "+ maraton.darAltura(maraton.getProgramadorRaiz()) +"\n");
		}
	}
	
	public static void mostrarNumerosDeP() {
		System.out.println("\nNúmero de programadores: "+ maraton.getNumProgramadores() +"\n");
	}
	
}
