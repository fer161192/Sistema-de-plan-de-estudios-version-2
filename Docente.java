package paquete_fiuba;

public class Docente extends Integrante{
	private int padron;

	public Docente(String nombre_ingresado,int dni_ingresado, int legajo_ingresado) {
		super(dni_ingresado,nombre_ingresado);
		this.padron = legajo_ingresado;
	}
	
	public int getPadron() {
		return this.padron;
	}
	
	public int getDni()
	{
		return super.getDni();
	}
	
	public String getNombre() {
		return super.getNombre();
	}
}
