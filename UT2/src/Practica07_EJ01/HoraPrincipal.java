package Practica07_EJ01;

import java.util.Scanner;
public class HoraPrincipal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int hora;
		int minutos;
		int segundos;
		int segundos_principal;
		int horas_medianoche,minutos_medianoche,segundos_medianoche;
		int horas_mediodia,minutos_mediodia,segundos_mediodia;
		//hora con el constructor por defecto
		Hora hora1 =new Hora();
		
		System.out.println(hora1.toString());
		
		
		
		System.out.println("Introduzca la hora, los minutos y los segundos, despues de cada dato pulse intro o espacio");
		hora=sc.nextInt();
		minutos=sc.nextInt();
		segundos=sc.nextInt();
		
		
	
		//hora con el constructor parametrizado
		Hora hora2= new Hora(hora,minutos,segundos);
		System.out.println(hora2.toString());
		
		//constructo copia, se copia a la hora2
		
		Hora hora3=new Hora(hora2);
		System.out.println(hora3.toString());	
		
		//Introducir unos segundos y convertirlos en horas,minutos y segundos
		
		System.out.println("Introduzca la hora, los minutos y los segundos,para pasarlo a un reloj de 12 horas");
		Hora hora4=new Hora(hora,minutos,segundos);
		hora=sc.nextInt();
		minutos=sc.nextInt();
		segundos=sc.nextInt();
		System.out.println(hora4.relojam_pm(hora, minutos, segundos));
		
		
		System.out.println("Introduzca los segundos que desea convertir");
		segundos_principal=sc.nextInt();
		Hora hora5=new Hora(segundos_principal);
		System.out.println(hora5.convertir_segundos());
		//pedir una hora y decir cuantos segundos han pasado desde medianoche 00:00:00
		
		System.out.println("Escriba una hora para saber los segundos que han pasado desde medianoche");
		horas_medianoche=sc.nextInt();
		minutos_medianoche=sc.nextInt();
		segundos_medianoche=sc.nextInt();
		Hora hora6=new Hora(horas_medianoche,minutos_medianoche,segundos_medianoche);
		System.out.println(hora6.segundos_medianoche(horas_medianoche, minutos_medianoche, segundos_medianoche));
		
		System.out.println("Escriba una hora para saber los segundos que han pasado desde mediodia");
		horas_mediodia=sc.nextInt();
		minutos_mediodia=sc.nextInt();
		segundos_mediodia=sc.nextInt();
		sc.close();
		Hora hora7=new Hora(horas_mediodia,minutos_mediodia,segundos_mediodia);
		System.out.println(hora7.segundos_mediodia(horas_mediodia, minutos_mediodia, segundos_mediodia));
	}

	}


