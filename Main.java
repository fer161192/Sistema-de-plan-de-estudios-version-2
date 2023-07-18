package paquete_fiuba;

public class Main {

	public static void main(String[] args) {
		Registro registro = new Registro();
        registro.agregarIntegrante(new Docente("Juan", 12345678, 1234));
        registro.agregarIntegrante(new Alumno("Pedro", 87654321, 4321));
        registro.agregarIntegrante(new Alumno("Maria", 12345678, 1234));
        registro.agregarIntegrante(new Docente("Jose", 87654321, 4321));
        System.out.println("Listar Alumnos-----------------");
        registro.listarAlumnos();
        System.out.println("Listar Docentes-----------------");
        registro.listarDocentes();
        System.out.println("Listar Integrantes-----------------");
        registro.listarIntegrantes();
	}

}
