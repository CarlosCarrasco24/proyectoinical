package Practica06;

public class Rectangulo {
	private Punto vertice_superior,vertice_inferior;
	//private double area,base,altura,diagonal;
	//por defecto
	public Rectangulo() {
		vertice_superior=new Punto();
		vertice_inferior=new Punto(2,2);
		}
	//parametrizado
	public Rectangulo(Punto vertice_superior, Punto vertice_inferior) {
		this.vertice_inferior=vertice_inferior;
		this.vertice_superior=vertice_superior;
	}
	//copia
	public Rectangulo(Rectangulo rectangulo) {
		this.vertice_inferior=rectangulo.vertice_inferior;
		this.vertice_superior=rectangulo.vertice_superior;
	}
	//get
	public Punto getVertice_superior() {
		return vertice_superior;
	}
	public Punto getVertice_inferior() {
		return vertice_inferior;
	}
	//set
	public void setVertice_superior(Punto vertice_superior) {
		this.vertice_superior=vertice_superior;
	}
	public void setVertice_inferior(Punto vertice_inferior) {
		this.vertice_inferior=vertice_inferior;
	}
	@Override
	public String toString() {
		return "RectanguloPrincipal [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	//}
	//public double area() {
		//base=this.punto1.distancia(this.punto3);
		//altura=this.punto3.distancia(this.punto2);
		//return base*altura;
	//}
	//perimetro suma 4 lados(distancia entre puntos),diagonal
	//public double perimetro() {
		//base=this.punto1.distancia(this.punto3);
		//altura=this.punto3.distancia(this.punto2);
		//return 2*base+2*altura;
//	}
	//public double diagonal() {
		//base=this.punto1.distancia(this.punto3);
		//altura=this.punto3.distancia(this.punto2);
		//diagonal=Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
		//return diagonal;
	//}
	
}
}


