package Practica06;

public class Punto {
	
	

	private int coordenada_x;
	private int coordenada_y;
	
	
	
	public Punto() {
		this.coordenada_x=0;
		this.coordenada_y=0;
	}

	public Punto(int coordenada_x, int coordenada_y) {
		this.coordenada_x = coordenada_x;
		this.coordenada_y = coordenada_y;
	}
	public Punto(Punto punto) {
		coordenada_x=punto.coordenada_x;
		coordenada_y=punto.coordenada_y;
	}
	public int getCoordenada_x() {
		return coordenada_x;
	}
	public void setCoordenada_x(int coordenada_x) {
		this.coordenada_x = coordenada_x;
	}
	public int getCoordenada_y() {
		return coordenada_y;
	}
	public void setCoordenada_y(int coordenada_y) {
		this.coordenada_y = coordenada_y;
	}
	
	public String toString() {
		return "posicion ="+coordenada_x+" y "+coordenada_y;		
	}
	String igualdad(Punto punto2) {
		return (coordenada_x==punto2.coordenada_x)&&(coordenada_y==punto2.coordenada_y)?"Las coordenadas son iguales":"Las coordenadas son distintas";
	}
	double distancia(Punto punto) {
		return Math.sqrt(Math.pow(punto.coordenada_x-coordenada_x,2)+Math.pow(punto.coordenada_y-coordenada_y,2));
	}
	double distancia() {
		return Math.sqrt(Math.pow(coordenada_x,2)+Math.pow(coordenada_y,2));
	}
	public String cuadrante() {
		return (coordenada_x>0 && coordenada_y>0)?"Cuadrante 1":(coordenada_x<0 &&  coordenada_y>0)?"Cuadrante 2":
			(coordenada_x<0 &&  coordenada_y<0)?"Cuadrante 3":
				(coordenada_x>0 &&  coordenada_y<0)?"Cuadrante 4":(coordenada_x==0 &&  coordenada_y==0)?"Origen de coordenadas":
			(coordenada_x==0 &&  coordenada_y!=0)?"Eje de ordenadas":"Eje de coordenas"; }
	}

