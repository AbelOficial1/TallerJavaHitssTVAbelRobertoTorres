package sistemauniversitario;

import java.util.HashSet;
import java.util.Set;

public class Profesor {
    private final String nombre;
    private final Set<Curso> cursos;

    public Profesor(String nombre) {
        this.nombre = nombre;
        this.cursos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void asignarCurso(Curso curso) {
        cursos.add(curso);
    }

    @Override
    public String toString() {
        return "Profesor: " + nombre;
    }
}