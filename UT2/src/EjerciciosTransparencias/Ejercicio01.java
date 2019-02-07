package EjerciciosTransparencias;
/*A partir  de  una  variable  num1  con  valor  inicial  12  y  una  variable  
num2  con  valor  inicial  4,  crear  nuevas  variables  que  almacenen  el  
resultado  de  realizar  la  suma,  resta,  multiplicación,  división  y  resto  
de  num1  y  num2.  Mostrar  el  valor  de  las  nuevas  variables  por  pantalla.*/

public class Ejercicio01 {

	public static void main(String[] args) {
		int num1=12;
		int num2=4;
		int suma,resta,producto,division,resto;
		suma = num1+num2;
		System.out.println("La suma es "+suma);
		resta = num1-num2;
		System.out.println("La resta es "+resta);
		producto= num1*num2;
		System.out.println("El producto es "+producto);
		division=num1/num2;
		System.out.println(num1==0?"Error,division por cero":" La division es "+division);
		resto=num1%num2;
		System.out.println(num1==0?"Error,division por cero":"El resto es "+resto);
	}
}
