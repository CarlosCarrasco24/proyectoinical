package EjerciciosTransparencias;
/*Construir  un  programa  que,  dado  el  radio  de  una  esfera,  calcule  y  
devuelva  por  pantalla  el  valor  de  la  superficie  y  el  volumen  de  la  
esfera  correspondiente.  Para  obtener  el  valor  de  PI,  utilizar  la  
variable  estática Math.PI.*/
import java.util.Scanner;
public class Ejercicio09 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		//declaracion variables
		double radio;
		double volumen;
		double superficie;
		
		System.out.println("Introduce el valor del radio");
		radio= teclado.nextDouble();
		teclado.close();
		
		//operaciones
		volumen=(4/3.0)*Math.PI*Math.pow(radio,3);
		superficie= 4*Math.PI*Math.pow(radio,2);
		
		//escribe en pantalla
		System.out.println("El volumen es "+volumen+"\nLa superficie es "+superficie);
		
	}
}
