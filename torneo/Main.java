package torneo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gestion torneo = new Gestion();
        Scanner sc = new Scanner(System.in);

        torneo.registrarJugador("Futbol", new Jugador(1, "Eloy"));
        torneo.registrarJugador("Futbol", new Jugador(2, "Bingo"));
        torneo.registrarJugador("Basquetbol", new Jugador(3, "Susana"));
        torneo.registrarJugador("Basquetbol", new Jugador(4, "Luis"));
        torneo.registrarJugador("Voleibol", new Jugador(5, "Marta"));

        int opcion;
        do {
            System.out.println("\n=== Menu Torneo ===");
            System.out.println("1. Mostrar jugadores por deporte");
            System.out.println("2. Contar jugadores en cada disciplina");
            System.out.println("3. Fusionar equipos");
            System.out.println("4. Ver jugadores en común");
            System.out.println("5. Transferir jugador");
            System.out.println("6. Mostrar jugadores ordenados por nombre");
            System.out.println("7. Mostrar jugadores en orden de inscripción");
            System.out.println("8. Ranking por ID");
            System.out.println("9. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> torneo.mostrarJugadores("Futbol", "TreeSet");
                case 2 -> torneo.contarJugadores();
                case 3 -> torneo.fusionar("Futbol", "Basquetbol");
                case 4 -> torneo.interseccion("Futbol", "Basquetbol");
                case 5 -> torneo.transferir(new Jugador(2, "Luis"), "Basquetbol", "Futbol");
                case 6 -> torneo.mostrarOrdenadosPorNombre();
                case 7 -> torneo.mostrarOrdenInscripcion();
                case 8 -> torneo.rankingPorId();
                case 9 -> System.out.println("👋 Saliendo...");
                default -> System.out.println("❌ Opción inválida.");
            }

        } while (opcion != 9);
    }
}