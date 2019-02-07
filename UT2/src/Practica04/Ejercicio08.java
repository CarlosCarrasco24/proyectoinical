/*Programa  Java  que  lea  un  n�mero  entero  y  calcule  si  es  par  o  impar. */
package Practica04;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Introduzca un numero"); 
		num=Integer.parseInt(sc.next());
		sc.close();


		System.out.println(num % 2==0?"El numero es par":"El numero es impar");
				
	}

}
