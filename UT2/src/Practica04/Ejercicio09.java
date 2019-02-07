/*Realizar  la  carga  del  lado  de  un  cuadrado,  mostrar  por  pantalla  el  per�metro  del  mismo  (El  per�metro  de  un  cuadrado  se  calcula  multiplicando  el  valor  del  lado  por  cuatro) */
package Practica04;
import java.util.Scanner;
public class Ejercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int lado;
		System.out.println("Introduzca un numero"); 
		lado=Integer.parseInt(sc.next());
		sc.close();

		
		
		lado=lado*4;
		System.out.println(lado>0?"El perimetro del cuadrado es: "+lado:"El lado tiene que sera mayor que cero");
			
	}

}
