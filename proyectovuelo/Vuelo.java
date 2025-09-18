package proyectovuelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private LocalDateTime fechaLlegada;
    private int pasajeros;

    public Vuelo(String nombre, String origen, String destino, LocalDate fecha, LocalTime hora, int pasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = LocalDateTime.of(fecha, hora);
        this.pasajeros = pasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDateTime getFechaLlegada() {
        return fechaLlegada;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("E dd MMM yyyy HH:mm:ss");
        return "Vuelo: " + nombre + ": " + origen + " -> " + destino + ", llega el " + fechaLlegada.format(formato)
                + ", pasajeros: " + pasajeros;
    }
}