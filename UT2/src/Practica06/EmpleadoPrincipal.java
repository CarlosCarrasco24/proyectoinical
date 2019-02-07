package Practica06;
import java.util.Scanner;
public class EmpleadoPrincipal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String nombre;
		double sueldo;
		
		Empleado empleado1=new Empleado();
		System.out.println("Introduzca el nombre del empleado");
		nombre=sc.next();
		System.out.println("Introduzca el sueldo");
		sueldo=sc.nextDouble();
		sc.close();
		
		Empleado empleado2;
		empleado2=new Empleado(nombre,sueldo); //utiliza lo pedido por teclado ya que empleado1 es el de por defecto
		
		Empleado empleado3=new Empleado(empleado1);
		
		System.out.println(empleado1.toString()+" "+empleado1.impuestos());
		System.out.println(empleado2.toString()+" "+empleado2.impuestos());
		System.out.println(empleado3.toString()+" "+empleado3.impuestos());
		
		
	}
	

}
