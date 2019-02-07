//Carlos Carrasco
package Practica07;
import java.util.Scanner;
public class ComplejosPrincipal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b,c,d;
		
		//complejo por defecto
		Complejos complejo1=new Complejos();
		System.out.println(complejo1.toString());
		
		//constructor parametrizado
		System.out.println("Escriba dos numeros complejos, recuerde primero la parte entera y luego la parte imaginaria ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		d=sc.nextDouble();
		sc.close();
		
		Complejos complejo2=new Complejos();
		System.out.println("La suma es:"+complejo2.Suma(a, b, c, d)+"\nLa resta es:"+complejo2.Resta(a, b, c, d)+"\nEl producto es:"+complejo2.Producto(a, b, c, d)+"\nEl conjugado es:"+complejo2.Conjugado(a, b, c, d));
		
		
		
	}

}
