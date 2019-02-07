//Programa  que  calcula  el  n�mero  de  la  suerte  de  una  persona  a  partir  de  su  fecha  de  nacimiento
package Practica05;
import java.util.Scanner;
public class P05_Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anyo, suerte, suma, cifra1, cifra2, cifra3, cifra4;
        System.out.println("Introduzca fecha de nacimiento, primero el dia,pulse intro e introduzca el mes, vuelva a pulsar intro e introduzca el anyo, recuerde poner datos mayores que cero");
        System.out.print("dia: ");
        dia = sc.nextInt();
        System.out.print("mes: ");
        mes = sc.nextInt();
        System.out.print("anyo: ");
        anyo = sc.nextInt();
        sc.close();
        //calculos
        //Para calcular tu numero de la suerte sumas el dia,mes y anyo de nacimiento
        suma = dia + mes + anyo;
        
       //El numero que salga siempre tendra 4 cifras por lo que las separamos y una vez separadas, se suman 
        cifra1=suma/1000;
        cifra2=(suma/100)%10;  
        cifra3=(suma/10)%10;   
        cifra4=suma%10;        
        suerte=cifra1 + cifra2 + cifra3 + cifra4;
        System.out.println("Su numero de la suerte es: " +suerte);
    }
}