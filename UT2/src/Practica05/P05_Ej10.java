//Programa  que  lea  un  número  entero  N  de  5  cifras  y  muestre  sus  cifras  desde  el  final.
package Practica05;
import java.util.Scanner;
public class P05_Ej10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero,unidad,decena,centena,unidad_millar,decena_millar;
		
		
		System.out.println("Introduzca un numero de 5 cifras,positivo y mayor que cero");
		numero=sc.nextInt();
		
		//calculos
		
		unidad= numero%10;
		decena=  (numero/10)%10;
		centena= (numero/100)%10;
		unidad_millar=(numero/1000)%10;
		decena_millar=numero/10000;
		sc.close();
		
		System.out.println(numero>10000&&numero<99999? "Las unidades son: "+unidad+"\nLas decenas son:"+decena+"\nLas centenas son: "+centena+"\nLas unidades de millar son: "+unidad_millar+"\nLas decenas de millar son: "+decena_millar:"No se introdujo un numero de 5 cifras");
				
	}

}
