package sistemauniversitario;

import java.time.LocalDate;
import java.util.*;

public class SistemaUniversitario {
    private final Map<String, Curso> cursos;

    public SistemaUniversitario() {
        this.cursos = new HashMap<>();
    }

    public void agregarCurso(Curso curso) {
        cursos.put(curso.getNombre(), curso);
    }

    public Curso obtenerCurso(String nombre) {
        return cursos.get(nombre);
    }

    public void listarCursosDeEstudiante(Estudiante estudiante) {
        System.out.println("Cursos de " + estudiante.getNombre() + ":");
        for (Curso c : estudiante.getCursosInscritos()) {
            System.out.println(" - " + c);
        }
    }

    public void listarCursosDeProfesor(Profesor profesor) {
        System.out.println("Cursos del profesor " + profesor.getNombre() + ":");
        for (Curso c : profesor.getCursos()) {
            System.out.println(" - " + c);
        }
    }

    public void listarCursosActivos(LocalDate fecha) {
        System.out.println("Cursos activos en " + fecha + ":");
        for (Curso c : cursos.values()) {
            if (c.estaActivoEn(fecha)) {
                System.out.println(" - " + c);
            }
        }
    }
}