package domain;

import testEmpleados.TestEmpleados;

public class Empleado extends Persona {
      
     private int idEmpleado;
     private  double salario;
     private static int contadorEmpleado;


     public Empleado(String nombre, int edad, String direccion, double salario) {
    	 super(nombre, edad, direccion);
    	 this.salario = salario;
    	 this.idEmpleado = ++ contadorEmpleado;
	
     }
     
     public int getIdEmpleado() {
    	 return idEmpleado;
     }
     
     public double getSalario() {
    	 return salario;
     }
     public void setSalario(double salario) {
    	 this.salario = salario;
     }
     
     
     public void aumentarSalario(double porcentaje) {
    	 
    	 double aumento = salario * porcentaje /100;
    	 salario = salario + aumento;
    	
    	 
     }
     
     public static void aumentarSalario() {
    	 
    	 System.out.println("Ingrese Id del empleado al que se desea aumentar el salario:");
    	 int id = LeerDatos.leerEntero();
    	 
    	 System.out.println("igrese el porcetaje de aumeto:");
    	 double porcentaje = LeerDatos.leerDouble();
    	 
    	 Empleado empleadoEncontrado = null;
    	 
    	 for(Empleado empleado : TestEmpleados.empleados) {
    		  
    		 if(empleado.getIdEmpleado() == id) {
    			 
    			 empleadoEncontrado = empleado;
    			 break;
    		 }
    		 
    	 }
    	 
    	 if (empleadoEncontrado != null) {
    		 empleadoEncontrado.aumentarSalario(porcentaje);
    		 System.out.println("Salario aumentado con exito");
    	 }else {
    		 System.out.println("Id incorrecto");
    	 }
    	 
    	 
     }

	public static void listaEmpleados() {
		// TODO Auto-generated method stub
		 if (TestEmpleados.empleados.isEmpty()) {
			 System.out.println("No hay empleados");
		 }else {
			 
			 System.out.println("Lista de empleados");
			 for(Empleado empleado : TestEmpleados.empleados) {
				 System.out.println(empleado);
			 }
		 }
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [id=");
		builder.append(idEmpleado);
		builder.append(", Nombre=");
		builder.append(getNombre());
		builder.append(", salario=");
		builder.append(salario);
		builder.append(", Edad=");
		builder.append(getEdad());
		builder.append("]");
		return builder.toString();
	}

    
     
}