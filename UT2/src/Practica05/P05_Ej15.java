//Programa  que  lea  un  número  entero  N  de  5  cifras  y  muestre  sus  cifras  desde  el  final  igual  que  en  el  ejemplo.

package Practica05;
import java.util.Scanner;
public class P05_Ej15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numero,unidad,decena,centena,unidad_millar,decena_millar;
		System.out.println("Introduzca un numero de 5 cifras");
		numero=sc.nextInt();
		
		//calculos
		
		unidad=numero%10;
		decena=(numero/10)%10;
		centena=(numero/100)%10;
		unidad_millar=(numero/1000)%10;
		decena_millar=numero/10000;
		sc.close();
		System.out.println(numero>10000&&numero<99999?"El numero desde el final es: "+unidad+" "+decena+" "+centena+" "+unidad_millar+" "+decena_millar:"No se introdujo un numero de 5 cifras");
		
	}

}
