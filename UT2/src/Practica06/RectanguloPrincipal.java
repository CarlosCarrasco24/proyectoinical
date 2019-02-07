package Practica06;

public class RectanguloPrincipal {

	public static void main(String[] args) {
		Rectangulo rect1=new Rectangulo();
		System.out.println(rect1.toString());
		
		Rectangulo rect2=new Rectangulo(new Punto(1,1),new Punto(3,3));
		System.out.println(rect2.toString());
		
		Rectangulo rect3=new Rectangulo(rect1);
		System.out.println(rect3.toString());
		
		
		//Rectangulo rect3=new Punto(rect1.getCoordenada_x(),rect2.getCoordenada_y());
		//Punto punto4=new Punto(punto2.getCoordenada_x(),punto1.getCoordenada_y());
	}
}
	
