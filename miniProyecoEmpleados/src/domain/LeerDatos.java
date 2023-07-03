package domain;

import java.util.Scanner;

public class LeerDatos {

	private static Scanner entrada = new Scanner(System.in);
	
	public static int leerEntero() {
		return entrada.nextInt();
	}
	public static String leerCadena() {
		return entrada.next();
	}
	public static double leerDouble() {
		return entrada.nextDouble();
	}
}
