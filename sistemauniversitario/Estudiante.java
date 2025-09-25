package sistemauniversitario;

import java.util.HashSet;
import java.util.Set;

public class Estudiante {
    private final String id;
    private final String nombre;
    private final Set<Curso> cursosInscritos;

    public Estudiante(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.cursosInscritos = new HashSet<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public boolean inscribir(Curso curso) {
        for (Curso c : cursosInscritos) {
            if (c.seTraslapaCon(curso)) {
                System.out
                        .println("Conflicto de fechas: " + curso.getNombre() + " se traslapa con " + c.getNombre()
                                + " para el estudiante: " + nombre);
                return false;
            }
        }
        return cursosInscritos.add(curso);
    }

    public boolean retirar(Curso curso) {
        return cursosInscritos.remove(curso);
    }

    @Override
    public String toString() {
        return nombre + " (ID: " + id + ")";
    }
}
