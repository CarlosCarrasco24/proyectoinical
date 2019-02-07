package Practica06;

public class Empleado {

		//declaracion de atributos
		private String nombre;
		private double sueldo;
			
			
		//declaracion de metodos
		//constructores
		//por defecto
			
		public Empleado(){
			this.nombre="Carlos";
			this.sueldo= 1200;
		}
		//parametros
		public Empleado(String nombre,double sueldo) {
			this.nombre=nombre;
			this.sueldo=sueldo;
		}
		//copia
		public Empleado(Empleado empleado){
			nombre=empleado.nombre;
			sueldo=empleado.sueldo;
		}	
		//metodos
		void setNombre(String nombre) {
			this.nombre=nombre;
		}
		void setSueldo(double sueldo) {
			this.sueldo=sueldo;
		}
		String getNombre(){
			return nombre;
		}
		double getSueldo() {
			return sueldo;
		}
		public String toString(){ 
			return "Nombre: "+nombre+" ,Sueldo: "+sueldo; 
		}
		String impuestos(){ 
			return sueldo>3000?"Debe pagar impuestos":"No debe pagar impuestos"; 
		}
		
}



