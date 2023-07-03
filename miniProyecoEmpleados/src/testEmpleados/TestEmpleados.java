package testEmpleados;

import java.util.ArrayList;
import java.util.List;

import domain.ContratarEmpleado;
import domain.DespedirEmpleado;
import domain.Empleado;
import domain.LeerDatos;

public class TestEmpleados {
	
	public static List<Empleado> empleados = new ArrayList<>();

	public static void main(String[] args) {

		boolean salir = false;
		
		while (!salir) {
			
			System.out.println("SISTEMA DE CONTROL DE EMPLEADOS");
			System.out.println("1. CONTRATAR EMPLEADO");
			System.out.println("2. DESPEDIR EMPLEADO");
			System.out.println("3. AUMENTAR SALARIO");
			System.out.println("4. LISTAR EMPLEADOS");
			System.out.println("5. SALIR");
			System.out.println("ELIJA UNA OPCION");
			
			int opcion = LeerDatos.leerEntero();
			
		switch(opcion) {
		
		case 1: 
			ContratarEmpleado contratarEmpleado = new ContratarEmpleado();
			contratarEmpleado.contratar();
			break;
			
		case 2:
			DespedirEmpleado despedirEmpleado = new DespedirEmpleado();
			despedirEmpleado.despedir();
			break;
			
		case 3:
			Empleado.aumentarSalario();
			break;
			
		case 4:
			Empleado.listaEmpleados();
			break;
		
		case 5:
			salir = true;
			break;
		
		default:
			System.out.println("Opcion invalida, Intente de nuevo");
			
		
		}
			
		}
	}
		
		
}


