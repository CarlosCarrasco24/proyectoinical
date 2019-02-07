//Lee  315  y muestra  3  1  5
package Practica05;

public class P05_Ej09 {

	public static void main(String[] args) {
		
		
		int numero,unidad,decena,centena;
		
		numero=315;
		
		//calculos
		
		unidad= numero%10;
		decena=  (numero/10)%10;
		centena= numero/100;
		
		System.out.println("Las cifras son: "+centena+","+decena+" y "+unidad);
				
	}

}
