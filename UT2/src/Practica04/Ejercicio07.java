/*al introducir dos caracteres saber si son iguales o diferentes*/
package Practica04;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner entradaScanner =new Scanner(System.in);
		char caracter1,caracter2;
		System.out.println("Introduzca un caracter");
		caracter1=entradaScanner.next().charAt(0);
		System.out.println("Introduzca otro caracter");
		caracter2=entradaScanner.next().charAt(0);
		entradaScanner.close();
		System.out.println(caracter1==(caracter2)?"Los caracteres son iguales":"Son diferentes");
				
	}

}
