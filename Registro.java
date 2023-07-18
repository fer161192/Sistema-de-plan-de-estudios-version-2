package paquete_fiuba;
import java.util.List;
import java.util.ArrayList;

public class Registro {
	private List<Integrante> lista_personas;
	private List<Alumno> lista_alumnos;
	private List<Docente> lista_docentes;
	
	public Registro() {
		this.lista_personas = new ArrayList<Integrante>();
		this.lista_alumnos = new ArrayList<Alumno>();
		this.lista_docentes = new ArrayList<Docente>();
	}
	
	
	
	public void agregarIntegrante(Integrante integrante_ingresado) {
		if (!this.validarDni(integrante_ingresado.getDni())) {
			if (integrante_ingresado instanceof Alumno) {
				Alumno alumno = (Alumno) integrante_ingresado;
				if (!this.validarPadron(alumno.getPadron())) {
					this.lista_personas.add(alumno);
					this.lista_alumnos.add(alumno);
				}
			}
			else {
				Docente docente = (Docente) integrante_ingresado;
				if (!this.validarPadron(docente.getPadron())) {
					this.lista_personas.add(docente);
					this.lista_docentes.add(docente);
				}
			}
		}
	}
	
	public List<Integrante> getLista_personas(){
		return this.lista_personas;
	}
	
	public void listarIntegrantes() {
		for (int i = 0;i<this.lista_personas.size();i++) {
			System.out.println("Nombre: "+this.lista_personas.get(i).getNombre());
			System.out.println("Dni: "+this.lista_personas.get(i).getDni());
			if (this.lista_personas.get(i) instanceof Alumno) {
				Alumno alumno = (Alumno) this.lista_personas.get(i);
				System.out.println("Padron: "+alumno.getPadron());;
			}
			else {
				Docente docente = (Docente) this.lista_personas.get(i);
				System.out.println("Padron: "+docente.getPadron());
			}
		}
	}
	public void listarAlumnos() {
		for (int i = 0; i<this.lista_alumnos.size(); i++) {
			System.out.println("Nombre: "+this.lista_alumnos.get(i).getNombre());
			System.out.println("Dni: "+this.lista_alumnos.get(i).getDni());
			System.out.println("Padron: "+this.lista_alumnos.get(i).getPadron());
		}
	}
	
	public void listarDocentes() {
		for (int i = 0; i<this.lista_docentes.size();i++) {
			System.out.println("Nombre: "+this.lista_docentes.get(i).getNombre());
			System.out.println("Dni: "+this.lista_docentes.get(i).getDni());
			System.out.println("Padron: "+this.lista_docentes.get(i).getPadron());
		}
	}
	//Verifica que no haya dos intengrantes con el mismo dni
	private boolean validarDni(int dni_ingresado) {
		boolean repetido = false;
		if (this.lista_personas == null) {
			return (false);
		}
		else {
			for (int i = 0; i<this.lista_personas.size();i++) {
				if (this.lista_personas.get(i).getDni() == dni_ingresado) {
					repetido = true;
					break;
				}
			}
		}
		return(repetido);
	}
	
	//Verificar que no haya dos o mas alumos con el mismo padron?
	private boolean validarPadron(int padron_ingresado) {
		boolean repetido = false;
		for (int i = 0; i<this.lista_personas.size();i++) {
			if (this.lista_personas.get(i) instanceof Alumno) {
				Alumno alumno_auxiliar = (Alumno) this.lista_personas.get(i);
				if (alumno_auxiliar.getPadron() == padron_ingresado) {
					repetido = true;
					break;
				}
			}
			else {
				Docente docente_ingresado = (Docente) this.lista_personas.get(i);
				if (docente_ingresado.getPadron() == padron_ingresado) {
					repetido = true;
					break;
				}
			}
		}
		return(repetido);
	}	
}
