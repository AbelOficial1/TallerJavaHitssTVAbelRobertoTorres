package torneo;

import java.util.*;

public class Gestion {
    private Map<String, Set<Jugador>> disciplinas = new HashMap<>();

    public Gestion() {
        disciplinas.put("Futbol", new HashSet<>());
        disciplinas.put("Basquetbol", new HashSet<>());
        disciplinas.put("Voleibol", new HashSet<>());
    }

    public void registrarJugador(String deporte, Jugador jugador) {
        Set<Jugador> jugadores = disciplinas.get(deporte);
        if (jugadores != null) {
            if (jugadores.add(jugador)) {
                System.out.println("Jugador inscrito en " + deporte);
            } else {
                System.out.println("El jugador ya está inscrito en " + deporte);
            }
        } else {
            System.out.println("Disciplina no encontrada.");
        }
    }

    public void mostrarJugadores(String deporte, String tipoSet) {
        Set<Jugador> jugadores = disciplinas.get(deporte);
        if (jugadores == null) {
            System.out.println("Disciplina no encontrada.");
            return;
        }

        Set<Jugador> conjunto;
        switch (tipoSet) {
            case "LinkedHashSet":
                conjunto = new LinkedHashSet<>(jugadores);
                break;
            case "TreeSet":
                conjunto = new TreeSet<>(jugadores);
                break;
            default:
                conjunto = new HashSet<>(jugadores);
        }

        System.out.println("Jugadores en " + deporte + " (" + tipoSet + "): ");
        conjunto.forEach(System.out::println);
    }

    public void contarJugadores() {
        disciplinas
                .forEach((deporte, jugadores) -> System.out.println(deporte + ": " + jugadores.size() + " jugadores"));
    }

    public void fusionar(String deporte1, String deporte2) {
        Set<Jugador> union = new HashSet<>(disciplinas.get(deporte1));
        union.addAll(disciplinas.get(deporte2));
        System.out.println("Fusion de " + deporte1 + " y " + deporte2 + ": ");
        union.forEach(System.out::println);
    }

    public void interseccion(String deporte1, String deporte2) {
        Set<Jugador> interseccion = new HashSet<>(disciplinas.get(deporte1));
        interseccion.retainAll(disciplinas.get(deporte2));
        System.out.println("Jugadores en comun: ");
        interseccion.forEach(System.out::println);
    }

    public void transferir(Jugador jugador, String de, String a) {
        if (disciplinas.get(de).remove(jugador)) {
            registrarJugador(a, jugador);
            System.out.println("Jugador transferido de " + de + " a " + a);
        } else {
            System.out.println("El jugador no estaba en " + de);
        }
    }

    public void mostrarOrdenadosPorNombre() {
        TreeSet<Jugador> todos = new TreeSet<>();
        disciplinas.values().forEach(todos::addAll);
        System.out.println("Jugadores ordenados por nombre:");
        todos.forEach(System.out::println);
    }

    public void mostrarOrdenInscripcion() {
        LinkedHashSet<Jugador> todos = new LinkedHashSet<>();
        disciplinas.values().forEach(todos::addAll);
        System.out.println("Orden de inscripcion:");
        todos.forEach(System.out::println);
    }

    public void rankingPorId() {
        TreeSet<Jugador> ranking = new TreeSet<>(Comparator.comparingInt(Jugador::getId));
        disciplinas.values().forEach(ranking::addAll);
        System.out.println("Ranking por ID:");
        ranking.forEach(System.out::println);
    }
}