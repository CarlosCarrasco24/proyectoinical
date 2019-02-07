package Practica06;

public class Persona {
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private char sexo;
	private int edad;
	private String direccion;
	
		
	public Persona() {	
	this.nombre= "Carlos";
	this.apellido_paterno="Carrasco";
	this.apellido_materno="Ureña";
	this.sexo='M';
	this.edad=24;
	this.direccion="Federico Garcia Lorca 123";
	
	}
	public Persona(String nombre, String apellido_paterno, String apellido_materno, char sexo, int edad,
			String direccion) {
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.sexo = sexo;
		this.edad = edad;
		this.direccion = direccion;
	}
	public Persona(Persona persona) {
		this.nombre = persona.nombre;
		this.apellido_paterno = persona.apellido_paterno;
		this.apellido_materno = persona.apellido_materno;
		this.sexo = persona.sexo;
		this.edad = persona.edad;
		this.direccion = persona.direccion;
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

	public String toString() {
		return "Persona: nombre=" + nombre + ", apellido_paterno=" + apellido_paterno + ", apellido_materno="
				+ apellido_materno + ", sexo=" + sexo + ", edad=" + edad + ", direccion=" + direccion + "";
	}
	public String mayor_edad() {
		return edad>=18?"Mayor de edad":"Menor de edad";
	}
	
	
	
}
