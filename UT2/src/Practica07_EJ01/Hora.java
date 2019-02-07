package Practica07_EJ01;

public class Hora {
	private int segundos;
	private int minutos;
	private int horas;
	
	//constructor por defecto
	//hora por defecto 00:00:00
	public Hora() {
		this.segundos=00;
		this.minutos=00;
		this.horas=00;
	}
	//constructor parametrizado
	public Hora(int hora, int minutos,int segundos) {
		this.horas=hora;
		this.minutos=minutos;
		this.segundos=segundos;	
	}
	//constructor copia
	public Hora(Hora hora) {
		horas=hora.horas;
		minutos=hora.minutos;
		segundos=hora.segundos;
	}
	//metodo get
	public int getSegundos() {
		return segundos;
	}
	public int getMinutos() {
		return minutos;
	}
	public int getHora() {
		return horas;
	}
	//metodo set
	public void setSegundos(int segundos) {
		this.segundos=segundos;
	}
	public void setMinutos(int minutos) {
		this.minutos=minutos;
	}
	public void setHora(int horas) {
		this.horas=horas;
	}
	//metodo toString
	public String toString() {
		return ((horas<0||horas>23?"Hora:00":horas<10?"Hora:0"+horas:"Hora:"+horas)+(minutos<0||minutos>59?":00":minutos<10?":0"+minutos:":"+minutos)+(segundos<0||segundos>59?":00":segundos<10?":0"+segundos:":"+segundos));
	}
	String relojam_pm (int hora,int minutos,int segundos) {
		horas=hora<=12&&hora>=0?hora:hora-12;
		horas=hora>23||hora<0?00:horas;
		minutos=minutos<0||minutos>60?00:minutos;
		segundos=segundos<0||segundos>60?00:segundos;
		return horas<12&&horas>=0?"La hora es:"+horas+":"+minutos+":"+segundos+"am":"La hora es:"+horas+":"+minutos+":"+segundos+"pm";
	}
	
	public Hora (int segundos_principal){
		this.horas=((segundos_principal/3600));
		this.minutos=(segundos_principal-(3600*horas))/60;
		this.segundos=segundos_principal-((3600*horas)+(minutos*60));	
	}
		String convertir_segundos() {
		return horas>=0 && minutos>=0 &&segundos>=0?"Los segundos convertidos son:"+horas+"horas,"+":"+minutos+"minutos y"+":"+segundos+"segundos":"00:00:00";
		}
	
	String segundos_medianoche (int horas_medianoche,int minutos_medianoche, int segundos_medianoche) {
			horas=horas_medianoche>23||horas_medianoche<0?00:horas;
			this.horas=horas_medianoche*3600;
			minutos=minutos_medianoche<0||minutos_medianoche>60?00:minutos;
			this.minutos=minutos_medianoche*60;
			segundos=segundos_medianoche<0||segundos_medianoche>60?00:minutos;
			this.segundos=segundos_medianoche;
			this.segundos=horas+minutos+segundos;
			return this.segundos==0?"Los segundos pasados desde medianoche son: "+segundos:"Dato introducido incorrecto";
		}
		
	String segundos_mediodia (int horas_mediodia,int minutos_mediodia,int segundos_mediodia) {
		horas=horas_mediodia>23||horas_mediodia<0?00:horas;
		this.horas=horas_mediodia*3600;
		minutos=minutos_mediodia<0||minutos_mediodia>60?00:minutos;
		this.minutos=minutos_mediodia*60;
		segundos=segundos_mediodia<0||segundos_mediodia>60?00:minutos;
		this.segundos=segundos_mediodia;
		this.segundos=horas+minutos+segundos;
		//como es mediodia la hora sería 12:00:00 son 43200 segundos
		this.segundos=segundos-43200;
		return segundos>=0?"La hora introducida es posterior a mediodia: "+segundos+"segundos":"Hora introducida incorrecta";
	}	
		}
