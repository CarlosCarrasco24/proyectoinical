//usare el paquete utilidades
package P11_Ejercicio01;

import Utilidades.Entrada;

public class P11_Ejercicio01 {
	public static long acumulador(int num) {
		int i = 1; /* inicializada a 1 porque el factorial de 0 es 1 */
		long factorial = 1; /* Inicializado a 1 para evitar multiplicar por 0 */
		long acumulador = 0;

		/*
		 * Si el numero introducido es mayor de 0 ira por el if seguido del bucle, sino
		 * ira al else
		 */

		if (num > 0) {
			System.out.println("Vamos a hacer la suma de los factoriales del numero: " + num);

			/*
			 * La primera parte del bucle for no tiene nada porque ya esta inicializada
			 * arriba
			 */
			/*
			 * Este bucle lo hace para sacar por pantalla lo que seria la suma de todos los
			 * factoriales que se introduzca
			 */
			for (int j = 1; j <= num; j++) {
				/*
				 * Condicional para que en el momento que la j sea igual al numero introducido
				 * no escriba un signo de +
				 */
				System.out.print(j < num ? +j + "!" + "+" : j + "!" + "\n");
				for (; i <= j; i++) {
					/*
					 * Aqui recogera el valor de i y lo multiplicara por factorial para saber el
					 * factorial de un numero
					 */
					factorial = factorial * i;

					/*
					 * Aqui se sumara el resultado de factorial a lo acummulado para saber la suma
					 * de todos los factoriales desde 1 hasta el que introduce el usuario
					 */
					acumulador = acumulador + factorial;
				}
			}
		} else
			/*
			 * El acumulado esta iniciado a 0 por lo que le sumo uno para obtener el
			 * factorial de 0 que es 1
			 */
			acumulador = acumulador + 1;

		return acumulador;

	}

	public static void main(String[] args) {
		int num;
		/*
		 * He utilizado el do while para obligar al usuario a poner un numero que no sea
		 * negativo
		 */

		do {
			System.out.println("Introduzca el numero a factorizar");
			num = Entrada.entero();
		} while (num < 0);
		System.out.println("La suma es: " + P11_Ejercicio01.acumulador(num));
		System.out.println("FIN");
	}

}
