package Practica07_Ej02;
public class Complejos {
	private double a;
	private double b;
	double suma,suma2,resta,resta2,producto,producto2,conjugado;
	//defecto con valor
	public Complejos() {
		a=1;
		b=1;
	}
	//parametrizado
	public Complejos(int a,int b) {
		this.a=a;
		this.b=b;	
	}
	//copia
	public Complejos(Complejos complejos) {
		this.a=complejos.a;
		this.b=complejos.b;
	}
	//set y get
	public double getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public double getBi() {
		return b;
	}

	public void setBi(int bi) {
		this.b = bi;
	}
	
	public String toString() {
		return "Numero complejo: "+a+"+"+b+"i";
	}
	
	String Suma(double a, double b,double c,double d) {
		
		suma=(a+c);
		suma2=(b+d);
		return +suma+"+"+suma2+"i";		
	}
	String Resta (double a, double b,double c,double d) {
	
		resta=(a-c);
		resta2=(b-d);
		return resta2<0?+resta+""+resta2+"i":+resta+"+"+resta2+"i";		
	}
	String Producto (double a, double b,double c,double d) {
	
		producto=(a*c-b*d);
		producto2=(a*d+b*c);
		return +producto+"+"+producto2+"i";
	}
	String Conjugado (double a, double b,double c,double d) {
		return +a+""+(+(-b))+"i";
	}
	}
	

