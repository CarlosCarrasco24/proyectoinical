//Lee  12345  y  escribe  5  4  3  2  1
package Practica05;

public class P05_Ej11 {

	public static void main(String[] args) {
		
		int numero,unidad,decena,centena,unidad_millar,decena_millar;
		
		numero=12345;
		
		//calculos
		
		unidad=numero%10;
		decena=(numero/10)%10;
		centena=(numero/100)%10;
		unidad_millar=(numero/1000)%10;
		decena_millar=numero/10000;
		
		System.out.println("El numero ordenado al reves es: "+unidad+" "+decena+" "+centena+" "+unidad_millar+" "+decena_millar);
		
	}

}
