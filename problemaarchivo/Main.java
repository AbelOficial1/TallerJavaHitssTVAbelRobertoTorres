package problemaarchivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Path rutaArchivo = Path.of("usuarios.txt");

        try {
            List<String> nombres = Files.readAllLines(rutaArchivo);
            System.out.println("=== Lista de usuarios ===");

            for (String nombre : nombres) {
                nombre = nombre.trim();
                try {
                    validarNombre(nombre);
                    System.out.println("Usuario válido: " + nombre);
                } catch (Excepcion e) {
                    System.out.println("Error -> " + e.getMessage());
                }
            }

        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo: " + rutaArchivo.toAbsolutePath());
        }
    }

    public static void validarNombre(String nombre) throws Excepcion {
        if (nombre.length() < 3) {
            throw new Excepcion("Nombre invalido: " + nombre + " (tiene menos de 3 caracteres)");
        }
    }
}