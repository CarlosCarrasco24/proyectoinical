/*Lee  un  numero  por  teclado  que  pida  el  precio  de  un  producto  (puede  tener  decimales)
  y  calcule  el  precio  final  con  IVA.  El  IVA  ser�  una  constante  que  ser�  del  21%.*/
package Practica04;

import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entradaScanner = new Scanner(System.in);
		double precio;
		double precio_total,suma;
		final double IVA;
	
		System.out.println("Introduzca el precio");
		precio=entradaScanner.nextDouble();
		IVA =0.21;
		suma=precio*IVA;
		precio_total=precio+suma;
		entradaScanner.close();
		System.out.println("El precio total es: "+precio_total);
			
		
		
		
	}

}
