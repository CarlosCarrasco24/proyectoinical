/*Un  alumno  desea  saber  su  nota  final  en  la  asignatura  de  programaci�n;  dicha  nota  se  basa  en  los  siguientes  porcentajes:
 55%  de  la  media  de  las  3  notas  parciales.30%  de  la  calificaci�n  del  examen  final.15%  de  la  calificaci�n  del  trabajo  final.*/
package Practica04;
import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		double nota1,nota2,nota3,examen_final,trabajo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca 4 notas,separador espacio o intro");
		nota1=sc.nextDouble();
		nota2=sc.nextDouble();
		nota3=sc.nextDouble();
		examen_final=sc.nextDouble();
		trabajo=sc.nextDouble();

		double nota_final,nota_parcial,nota_trabajo,nota_examen;
		nota_parcial=((nota1+nota2+nota3)/3)*0.55;
		
		nota_trabajo=trabajo*0.15;
		
		nota_examen=examen_final*0.3;
		
		nota_final=nota_parcial+nota_trabajo+nota_examen;
		sc.close();
		System.out.println("La nota final es: "+nota_final);
	}

}
