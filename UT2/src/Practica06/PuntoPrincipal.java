package Practica06;
import java.util.Scanner;
public class PuntoPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		Punto punto1=new Punto();
		System.out.println("Introduzca unas coordenadas");
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		
		Punto punto2;
		punto2=new Punto(a,b);
		
		Punto punto3=new Punto(punto2);
		
		System.out.println(punto1.toString());
		System.out.println(punto2.toString()+punto2.igualdad(punto1));
		System.out.println(punto3.toString()+punto3.igualdad(punto1));
		System.out.println(punto2.distancia());
		System.out.println(punto2.distancia(punto1));
		System.out.println(punto2.cuadrante());
		}

}
