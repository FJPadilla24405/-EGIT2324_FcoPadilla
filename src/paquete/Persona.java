package paquete;

public class Persona {
	
	// Atributos
		private String nombre;
		private int edad;
		private String apellido;
			
	// Constructor
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellido;
		this.edad = edad;
			
	}
	
	// Métodos
	
	public int Cumpleaños() {
		edad ++;
		return edad;
	}

}
