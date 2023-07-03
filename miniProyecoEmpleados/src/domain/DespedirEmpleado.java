package domain;

import testEmpleados.TestEmpleados;

public class DespedirEmpleado {
	
	public void despedir() {
		
		System.out.println("Ingrese el Id del empleado a dar de baja");
		int id = LeerDatos.leerEntero();
		
		Empleado empleadoEncontado = null;
		
		for(Empleado empleado: TestEmpleados.empleados) {
			
			if (empleado.getIdEmpleado() == id) {
				
				empleadoEncontado = empleado;
				break;
				
			}
			
		}
		
		if(empleadoEncontado != null) {
			TestEmpleados.empleados.remove(empleadoEncontado);
			System.out.println("Empleado despedido Correctamente");
		}else {
			System.out.println("Id de empleado NO encontrado");
		}
		
	}

}
