package sistemauniversitario;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Curso {
    private final String nombre;
    private final Profesor profesor;
    private final LocalDate fechaInicio;
    private final LocalDate fechaFin;
    private final Set<Estudiante> estudiantes;

    public Curso(String nombre, Profesor profesor, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estudiantes = new HashSet<>();
        profesor.asignarCurso(this);
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public Set<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public boolean agregarEstudiante(Estudiante estudiante) {
        if (estudiante.inscribir(this)) {
            System.out.println("Agregando a " + estudiante.getNombre() + " al curso " + nombre);
            return estudiantes.add(estudiante);
        }
        System.out.println("Error al agregar a " + estudiante.getNombre() + " al curso " + nombre);
        return false;
    }

    public boolean retirarEstudiante(Estudiante estudiante) {
        estudiante.retirar(this);
        System.out.println("Retirando a " + estudiante.getNombre() + " del curso " + nombre);
        return estudiantes.remove(estudiante);
    }

    public boolean seTraslapaCon(Curso otro) {
        return !(this.fechaFin.isBefore(otro.fechaInicio) || this.fechaInicio.isAfter(otro.fechaFin));
    }

    public boolean estaActivoEn(LocalDate fecha) {
        return !(fecha.isBefore(fechaInicio) || fecha.isAfter(fechaFin));
    }

    @Override
    public String toString() {
        return "Curso: " + nombre + " (" + fechaInicio + " a " + fechaFin + ") - Profesor: " + profesor.getNombre();
    }
}