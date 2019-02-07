/*Realizar  un  programa  que  lea  cuatro  valores  numericos  e  informar  su  suma  y  promedio. */
package Practica04;
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3,num4;
		System.out.println("Introduzca 4 numeros,separador espacio o intro"); 
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		num4=sc.nextInt();
		
		sc.close();

		
		
		int suma;
		float promedio;
		
		
		
		suma = num1+num2+num3+num4;
		promedio=(num1+num2+num3+num4)/(float)4;
		System.out.println("La suma de los numeros es: "+suma+"\nEl promedio es: "+promedio);
	}

}
