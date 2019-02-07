/*Escribir  un  programa  en  el  cual  se  ingresen  cuatro  n�meros,  calcular  e  informar  la  suma  de  los  dos  primeros  y  el  producto  del  tercero  y  el  cuarto. */
package Practica04;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		/*variables*/
	
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.println("Introduzca un numero"); 
		num1=sc.nextInt();
		int num2;
		System.out.println("Introduzca un numero"); 
		num2=sc.nextInt();
	
		int num3;
		System.out.println("Introduzca un numero"); 
		num3=sc.nextInt();
	
		int num4;
		System.out.println("Introduzca un numero"); 
		num4=sc.nextInt();
		
		
		sc.close();
		int suma,producto;
		
		
		
		suma=num1+num2;
		producto=num3*num4;
		
		System.out.println("La suma es: "+suma+"\nEl producto es: "+producto);
	}

}
