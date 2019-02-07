/*Programa  que  lee  un  número  de  3  cifras  y  muestra  sus  cifras  por  separado. */
package Practica05;
import java.util.Scanner;
public class P05_Ej13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero,unidad,decena,centena;
		
		
		System.out.println("Introduzca un numero de 3 cifras,positivo y mayor que cero");
		numero=sc.nextInt();
		
		//calculos
		
		unidad= numero%10;
		decena=  (numero/10)%10;
		centena= numero/100;
		
		sc.close();
		
		System.out.println(numero>100&&numero<999?"Las cifras son: "+centena+","+decena+" y "+unidad:"No introdujo un numero de 3 cifras");
				
	}

}
