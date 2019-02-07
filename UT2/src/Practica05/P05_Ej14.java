//Programaque  lea  un  número  entero  N  de  5  cifras  y  muestre  sus  cifras  desde  el  principio  como  en  el  ejemplo.
package Practica05;
import java.util.Scanner;
public class P05_Ej14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero,unidad,decena,centena,unidad_millar,decena_millar;
		System.out.println("Introduzca un numero de 5 cifras");
		numero=sc.nextInt();
		
		unidad=numero%10;
		decena=(numero/10)%10;
		centena=(numero/100)%10;
		unidad_millar=(numero/1000)%10;
		decena_millar=numero/10000;
		sc.close();
		System.out.println(numero>10000&&numero<99999?"Las cifras desde el principio son: "+decena_millar+" "+unidad_millar+" "+centena+" "+decena+" "+unidad:"No introdujo un numero de 5 cifras");
		

	}

}
