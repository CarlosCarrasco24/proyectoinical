/*Calcular  el  �rea  de  un  rect�ngulo.*/
package Practica04;
import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float base,altura;
		System.out.println("Introduzca la base, pulse intro e introduzca la altura"); 
		base=sc.nextFloat();
		altura=sc.nextFloat();
		sc.close();
		double area;
		
		
		
		area=base*altura;
		System.out.println(base<0?"El area del rectangulo es: "+area+" metros cuadrados":"La base o altura no puede ser 0 o un caracter");
	}

}
