package Practica04;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float nota1,nota2,nota3;
		System.out.println("Introduzca un numero, y pulse intro"); 
		nota1=sc.nextFloat();
		nota2=sc.nextFloat();
		nota3=sc.nextFloat();
		sc.close();
		float media;
		
		media=(nota1+nota2+nota3)/3;
		System.out.println("La media es: "+media);
	}

}
