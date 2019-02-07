/*Carlos Carrasco*/
package Practica07;

public class Persona {
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private char sexo;
	private int edad;
	private String direccion;
	private double peso;
	private double altura;
	//private double IMC;
	//defecto
	public Persona() {
		
	}
	//parametrizado
	public Persona(String nombre,String apellido_paterno,String apellido_materno,char sexo,int edad,String direccion,double peso,double altura) {
		this.nombre=nombre;
		this.apellido_paterno=apellido_paterno;
		this.apellido_materno=apellido_materno;
		this.sexo=sexo;
		this.edad=edad;
		this.direccion=direccion;
		this.peso=peso;
		this.altura=altura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido_paterno() {
		return apellido_paterno;
	}
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}
	public String getApellido_materno() {
		return apellido_materno;
	}
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String toString() {
		return "Nombre:"+nombre+"\nApellido paterno:"+apellido_paterno+"\nApellido Materno:"+apellido_materno+"\nSexo:"+sexo+"\nEdad:"+edad+"\nDireccion:"+direccion+"\nPeso:"+peso+"\nAltura:"+altura;
	}
	String Edad(int edad) {
		return edad>=18?"Mayor de edad":"Menor de edad";
	}
	String IMC(double peso,double altura) {
		return peso>0&&altura>0?"El IMC es: "+peso/(altura*2):"Datos incorrectos";
		
	}
	String diagnostico(double peso,double altura) {
		double IMC;
		this.peso=peso;
		this.altura=altura;
		
		IMC=peso/(altura*altura);
		return IMC<20?"Peso ideal":IMC>=20&&IMC<=25?"Por debajo del peso ideal":"Sobrepeso";
	}
}
