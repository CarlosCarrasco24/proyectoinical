package Practica07_Ej03;

import java.util.Scanner;
public class RelacionalPrincipal {
	/*********************
	 * IMPORTANTE, EN VEZ DE RACIONAL LO HE LLAMADO RELACIONAL*
	 * *************************/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,d;
		
		Relacional racional1=new Relacional();
		System.out.println(racional1.toString());
		System.out.println("Introduzca cuatro numeros");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		sc.close();
		
		Relacional racional2=new Relacional();
		System.out.println("Suma:"+racional2.Suma(a, b, c, d)+"\nResta:"+racional2.Resta(a, b, c, d)+"\nProducto:"+racional2.Producto(a, b, c, d)+"\nInverso:"+racional2.Inverso(a, b,c,d));
	}

	}


