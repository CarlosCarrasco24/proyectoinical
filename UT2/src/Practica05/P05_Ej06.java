/*Programa para calcular el volumen de una esfera*/
package Practica05;

import java.util.Scanner;
public class P05_Ej06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radio;
		
		System.out.println("Introduzca el radio,positivo y mayor que cero");
		radio=sc.nextDouble();
		double volumen;
		
		volumen=(4/3)*Math.PI*Math.pow(radio,3);
		sc.close();
		System.out.println(radio>0? "El volumen de la esfera es: "+volumen:"El radio no es mayor que cero");
		
		
		
	} 

}
