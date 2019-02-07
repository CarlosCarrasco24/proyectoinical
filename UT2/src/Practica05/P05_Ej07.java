/*Programa  que  pida  al  usuario  un  valor  para  una  variable  X  y  calcule  y  escriba  el  valor  de  y  en  la  función  y  =  6x2+  8x  -17.*/
package Practica05;
import java.util.Scanner;
public class P05_Ej07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		
		System.out.println("Introduzca un valor para x" );
		x=sc.nextInt();
		
		//calcular
		
		y= 6*x*2+8*x-17;
		
		//cerrar teclado
		sc.close();
		
		//pantalla
		
		System.out.println("El valor de y es: "+y);
				
	
	}

}
