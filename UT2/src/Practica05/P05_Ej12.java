//Programa  que  calcula  el  área  de  un  triángulo  a  partir  de  la  longitud  de  sus  lados.
package Practica05;
import java.util.Scanner;
public class P05_Ej12 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		double lado1,lado2,lado3;
		double area;
		double semiperimetro;
		System.out.println("Introduzca un lado del triangulo, luego pulse enter para introducir el siguiente");
		lado1=sc.nextDouble();
		lado2=sc.nextDouble();
		lado3=sc.nextDouble();
		
		
		//calculos
		semiperimetro=(lado1+lado2+lado3)/2;
		
		area=Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
		
		sc.close();
		
		System.out.println(area>0?"El area es: "+area:"Error");
		
}
}