package rrhh;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args) {
                DecimalFormat df = new DecimalFormat("#,###.00");
                List<Empleado> empleados = List.of(
                                new Empleado(1, "Eloy", "IT", 60000, 6, List.of(
                                                new Evaluacion(2022, 85),
                                                new Evaluacion(2023, 92))),
                                new Empleado(2, "Bingo", "Ventas", 45000, 4, List.of(
                                                new Evaluacion(2022, 70),
                                                new Evaluacion(2023, 88))),
                                new Empleado(3, "Susana", "IT", 80000, 8, List.of(
                                                new Evaluacion(2022, 96),
                                                new Evaluacion(2023, 98))),
                                new Empleado(4, "Pedro", "Recursos Humanos", 55000, 10, List.of(
                                                new Evaluacion(2022, 89),
                                                new Evaluacion(2023, 91))),
                                new Empleado(5, "Marta", "IT", 50000, 3, List.of(
                                                new Evaluacion(2022, 85),
                                                new Evaluacion(2023, 82))));

                System.out.println("\n1. Empleados del departamento IT ordenados alfabeticamente:");
                empleados.stream()
                                .filter(e -> e.getDepartamento().equalsIgnoreCase("IT"))
                                .sorted(Comparator.comparing(Empleado::getNombre))
                                .forEach(System.out::println);

                System.out.println("\n2. Salario promedio por departamento:");
                empleados.stream()
                                .collect(Collectors.groupingBy(Empleado::getDepartamento,
                                                Collectors.averagingDouble(Empleado::getSalario)))
                                .forEach((dept, promedio) -> System.out.println(dept + " -> $" + df.format(promedio)));

                System.out.println("\n3. Empleado con mayor salario:");
                empleados.stream()
                                .max(Comparator.comparingDouble(Empleado::getSalario))
                                .ifPresent(System.out::println);

                System.out.println("\n4. Empleados con mas de 5 años y salario arriba de 50,000:");
                empleados.stream()
                                .filter(e -> e.getAniosExperiencia() > 5 && e.getSalario() > 50000)
                                .forEach(System.out::println);

                System.out.println("\n5. Top 3 de empleados con mejor puntaje en ultima evaluacion:");
                empleados.stream()
                                .sorted((e1, e2) -> Integer.compare(
                                                getUltimaEvaluacion(e2).getPuntaje(),
                                                getUltimaEvaluacion(e1).getPuntaje()))
                                .limit(3)
                                .forEach(e -> System.out
                                                .println(e.getNombre() + " -> " + getUltimaEvaluacion(e).getPuntaje()));

                long count = empleados.stream()
                                .filter(e -> e.getEvaluaciones().stream().anyMatch(ev -> ev.getPuntaje() > 90))
                                .count();
                System.out.println("\n6. Empleados con al menos una Evaluacion > 90: " + count);

                System.out.println("\n7. Ranking por promedio de evaluaciones:");
                empleados.stream()
                                .sorted((e1, e2) -> Double.compare(
                                                promedio(e2.getEvaluaciones()),
                                                promedio(e1.getEvaluaciones())))
                                .forEach(e -> System.out
                                                .println(e.getNombre() + " -> "
                                                                + df.format(promedio(e.getEvaluaciones()))));
        }

        private static Evaluacion getUltimaEvaluacion(Empleado e) {
                return e.getEvaluaciones().stream()
                                .max(Comparator.comparingInt(Evaluacion::getAnio))
                                .orElse(null);
        }

        private static double promedio(List<Evaluacion> evaluaciones) {
                return evaluaciones.stream()
                                .mapToInt(Evaluacion::getPuntaje)
                                .average()
                                .orElse(0);
        }
}