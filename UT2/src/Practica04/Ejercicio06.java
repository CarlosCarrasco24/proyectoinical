package Practica04;

import java.util.Scanner;
public class Ejercicio06 { 
	/* * Programa que lea un carácter por teclado y compruebe si es una letra mayúscula. */ 
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
char letra;
System.out.println("Introduzca una letra"); 
letra=sc.next().charAt(0);
sc.close();
System.out.println(letra>='A' && letra<='Z'? "La letra es mayuscula": "El caracter es minúscula o no es una letra");
}
}