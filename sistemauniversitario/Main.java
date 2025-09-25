package sistemauniversitario;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SistemaUniversitario sistema = new SistemaUniversitario();

        System.out.println("Agregando Profesores");
        Profesor prof1 = new Profesor("Roberto Rangel");
        Profesor prof2 = new Profesor("Veronica Sobrevilla");

        System.out.println("Agregando Cursos");
        Curso curso1 = new Curso("Programacion", prof1, LocalDate.of(2025, 1, 10), LocalDate.of(2025, 3, 10));
        Curso curso2 = new Curso("Bases de Datos", prof2, LocalDate.of(2025, 2, 1), LocalDate.of(2025, 4, 1));
        Curso curso3 = new Curso("Redes", prof1, LocalDate.of(2025, 4, 5), LocalDate.of(2025, 6, 5));

        sistema.agregarCurso(curso1);
        sistema.agregarCurso(curso2);
        sistema.agregarCurso(curso3);

        System.out.println("Agregando Estudiantes");
        Estudiante e1 = new Estudiante("001", "Ana");
        Estudiante e2 = new Estudiante("002", "Luis");

        curso1.agregarEstudiante(e1);
        curso2.agregarEstudiante(e1);
        curso3.agregarEstudiante(e1);

        curso2.agregarEstudiante(e2);

        curso1.retirarEstudiante(e2);

        sistema.listarCursosDeEstudiante(e1);
        sistema.listarCursosDeProfesor(prof1);
        sistema.listarCursosActivos(LocalDate.of(2025, 2, 15));
    }
}