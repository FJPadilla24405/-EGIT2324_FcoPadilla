package paquete;

public class Persona {
	
	// Atributos
		private String nombre;
		private int edad;
		private String apellidos;
			
	// Constructor
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
			
	}
	
	// Métodos
	
	public int Cumpleaños() {
		edad ++;
		return edad;
	}

}
