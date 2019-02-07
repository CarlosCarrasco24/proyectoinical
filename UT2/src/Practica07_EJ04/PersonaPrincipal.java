package Practica07_EJ04;

import java.util.Scanner;

public class PersonaPrincipal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nombre;
		String apellido_paterno;
		String apellido_materno;
		char sexo;
		int edad;
		String direccion;
		double peso;
		double altura;
		
		Persona persona1=new Persona();
		System.out.println(persona1.toString());
		
		System.out.println("Introduzca su nombre,apellido paterno y materno,sexo(M para hombres,F para mujeres),su edad,direccion,peso(kg) y altura(metros)");
		nombre=sc.nextLine();
		apellido_paterno=sc.nextLine();
		apellido_materno=sc.nextLine();
		sexo=sc.next().toUpperCase().charAt(0);
		edad=sc.nextInt();
		direccion=sc.next();
		peso=sc.nextDouble();
		altura=sc.nextDouble();
		sc.close();
		Persona persona2=new Persona(nombre,apellido_paterno,apellido_materno,sexo,edad,direccion,peso,altura);
		System.out.println(persona2.toString()+"\n"+persona2.Edad(edad)+"\n"+persona2.IMC(peso,altura)+"\n"+persona2.diagnostico(peso, altura));
		
	}
}

