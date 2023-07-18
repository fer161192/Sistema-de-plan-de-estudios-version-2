package paquete_fiuba;

public class Integrante {
	private int dni;
	private String nombre;
	
	public Integrante(int dni_ingresado, String nombre_ingresado) {
		this.dni = dni_ingresado;
		this.nombre = nombre_ingresado;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getDni() {
		return this.dni;
	}
	
}
