package proyectovuelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
        public static void main(String[] args) {

                DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("EEE dd MMM yyyy");
                DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

                List<Vuelo> vuelos = new ArrayList<>();

                vuelos.add(new Vuelo("AAL 933", "New York", "Santiago",
                                LocalDate.of(2021, 8, 29), LocalTime.of(5, 39), 62));
                vuelos.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago",
                                LocalDate.of(2021, 8, 30), LocalTime.of(4, 45), 47));
                vuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago",
                                LocalDate.of(2021, 8, 30), LocalTime.of(16, 0), 52));
                vuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago",
                                LocalDate.of(2021, 8, 30), LocalTime.of(21, 45), 59));
                vuelos.add(new Vuelo("AVA 241", "Bogota", "Santiago",
                                LocalDate.of(2021, 8, 31), LocalTime.of(14, 5), 25));
                vuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago",
                                LocalDate.of(2021, 8, 31), LocalTime.of(5, 20), 29));
                vuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago",
                                LocalDate.of(2021, 8, 30), LocalTime.of(8, 45), 55));
                vuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago",
                                LocalDate.of(2021, 8, 29), LocalTime.of(7, 41), 51));
                vuelos.add(new Vuelo("SKU 803", "Lima", "Santiago",
                                LocalDate.of(2021, 8, 30), LocalTime.of(10, 15), 48));
                vuelos.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago",
                                LocalDate.of(2021, 8, 29), LocalTime.of(9, 14), 59));
                vuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago",
                                LocalDate.of(2021, 8, 31), LocalTime.of(8, 33), 31));
                vuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago",
                                LocalDate.of(2021, 8, 31), LocalTime.of(15, 15), 29));
                vuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago",
                                LocalDate.of(2021, 8, 30), LocalTime.of(18, 19), 47));
                vuelos.add(new Vuelo("DAL 147", "Miami", "Santiago",
                                LocalDate.of(2021, 8, 29), LocalTime.of(22, 53), 60));
                vuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago",
                                LocalDate.of(2021, 8, 30), LocalTime.of(9, 57), 55));
                vuelos.add(new Vuelo("LAT 1283", "Cancún", "Santiago",
                                LocalDate.of(2021, 8, 31), LocalTime.of(4, 0), 59));
                vuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago",
                                LocalDate.of(2021, 8, 30), LocalTime.of(14, 45), 25));
                vuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago",
                                LocalDate.of(2021, 8, 30), LocalTime.of(7, 12), 61));
                vuelos.add(new Vuelo("LAT 501", "París", "Santiago",
                                LocalDate.of(2021, 8, 29), LocalTime.of(18, 29), 49));
                vuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago",
                                LocalDate.of(2021, 8, 30), LocalTime.of(15, 45), 39));

                vuelos.sort(Comparator.comparing(Vuelo::getFechaLlegada));

                System.out.println("=== Listado ordenado por fecha de llegada ===");
                vuelos.forEach(System.out::println);

                Vuelo ultimoVuelo = vuelos.get(vuelos.size() - 1);
                System.out.println("\nEl último vuelo en llegar es el " + ultimoVuelo);

                Vuelo menorPasajeros = vuelos.stream().min(Comparator.comparingInt(Vuelo::getPasajeros)).get();
                System.out.println("\nEl vuelo con menor número de pasajeros es el veulo: " +
                                menorPasajeros.getNombre() + ": " + menorPasajeros.getOrigen() +
                                ", con " + menorPasajeros.getPasajeros() + " pasajeros.");
        }
}