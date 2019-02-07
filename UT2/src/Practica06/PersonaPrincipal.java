package Practica06;
import java.util.Scanner;
public class PersonaPrincipal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String nombre,apellido_paterno,apellido_materno,direccion;
		char sexo;
		int edad;
		
		
		Persona persona1=new Persona();
		System.out.println(persona1.toString()+" "+persona1.mayor_edad());
		System.out.println("Introduzca su nombre,apellido paterno,apellido materno,sexo,direccion y edad, por cada dato introducido pulse intro para introducir el siguiente");
		nombre =sc.next();
		apellido_paterno= sc.next();
		apellido_materno= sc.next();
		sexo=sc.next().toUpperCase().charAt(0);
		direccion=sc.next();
		edad=sc.nextInt();
		sc.close();
		Persona persona2;
		persona2= new Persona(nombre,apellido_paterno,apellido_materno,sexo,edad,direccion);
		
		Persona persona3=new Persona(persona1);
		
		System.out.println(persona2.toString()+" "+persona2.mayor_edad());
		System.out.println(persona3.toString()+" "+persona3.mayor_edad());

		}

}
