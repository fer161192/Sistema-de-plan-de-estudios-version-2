package paquete_fiuba;

public class Alumno extends Integrante{
	private int padron;
	
	private String nombre;
	
	public Alumno(String nombre_ingresado,int dni_ingresado,int padron_ingresado) {
		super(dni_ingresado,nombre_ingresado);
		this.padron = padron_ingresado;
	}
	
	public int getPadron() {
		return padron;
	}
	
	public String getNombre() {
		return super.getNombre();
	}
	
	public int getDni() {
		return super.getDni();
	}
	
}
