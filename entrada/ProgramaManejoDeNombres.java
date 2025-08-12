package entrada;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre1, nombre2, nombre3, nombreConcatenado, nuevoNombre1, nuevoNombre2, nuevoNombre3;
        System.out.println("Nombre 1: ");
        nombre1 = entrada.nextLine();
        System.out.println("Nombre2: ");
        nombre2 = entrada.nextLine();
        System.out.println("Nombre3: ");
        nombre3 = entrada.nextLine();

        // nuevoNombre1 = Character.toUpperCase(nombre1.charAt(1)) + "." +
        // nombre1.substring(nombre1.length() - 2);
        // nuevoNombre2 = Character.toUpperCase(nombre2.charAt(1)) + "." +
        // nombre2.substring(nombre2.length() - 2);
        // nuevoNombre3 = nombre3.toUpperCase().charAt(1) + "." +
        // nombre3.substring(nombre3.length() - 2);
        // System.out.println(nuevoNombre1 + "_" + nuevoNombre2 + "_" + nuevoNombre3);

        // System.out.println(nuevoNombre1 + "_" + nuevoNombre2 + "_" + nuevoNombre3);
    }

    private static String extraCaracter(String nombre) {
        return nombre.toUpperCase().charAt(1) + "." + nombre.substring(nombre.length() - 2);
    }

}
