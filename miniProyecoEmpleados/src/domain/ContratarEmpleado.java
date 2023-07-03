package domain;

import testEmpleados.TestEmpleados;

public class ContratarEmpleado {
	
	public void contratar () {
		
		System.out.println("Ingrese nombre del empleado:");
		String nombre = LeerDatos.leerCadena();
		
		System.out.println("Ingresa la direccion de contacto:");
		String direccion = LeerDatos.leerCadena();
		
		System.out.println("Ingresa edad:");
		int edad = LeerDatos.leerEntero();
		
		System.out.println("Ingresa el salario del Empleado: ");
		double salario = LeerDatos.leerDouble();
		
		Empleado empleado = new Empleado(nombre, edad, direccion, salario);
		TestEmpleados.empleados.add(empleado);
		
		
		System.out.println("Empleado contatado con exito\n\n");
	}

}
