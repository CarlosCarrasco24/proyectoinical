
package Practica07_Ej03;

public class Relacional {
	private int a,b;
	private int suma,suma2,resta,resta2,producto,producto2;
	public Relacional() {
		a=1;
		b=1;
	}

	public Relacional(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public Relacional(Relacional relacional) {
		
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	public String toString() {
		return "El relacional es:" + a +"/"+ b;
	}
	String Suma(int a,int b,int c,int d) {
		b=b==0?b=1:b;
		d=d==0?d=1:d;
		suma=(a*d)+(b*c);
		suma2=b*d;
		
		return "La suma de dos fracciones es:"+suma+"/"+suma2;
	}
	String Resta(int a,int b,int c,int d) {
		b=b==0?b=1:b;
		d=d==0?d=1:d;
		resta=(a*d)-(b*c);
		resta2=b*d;
		return "La resta de dos fracciones es:"+resta+"/"+resta2;
	}
	String Producto(int a,int b,int c,int d) {
		b=b==0?b=1:b;
		d=d==0?d=1:d;
		producto=a*c;
		producto2=b*d;
		return "El producto de dos fracciones es:"+producto+"/"+producto2;
	}
	String Inverso(int a,int b,int c,int d) {
		b=b==0?b=1:b;
		d=d==0?d=1:d;
		return "El inverso es:"+b+"/"+a+" y "+d+"/"+c;
	}
}
