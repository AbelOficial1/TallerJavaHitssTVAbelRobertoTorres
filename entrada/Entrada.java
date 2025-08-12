package entrada;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        // ctrl + space ==> opciones disponibles

        // Creacion de objetos
        // NombreClase nombreObjeto = new NombreClase() --> Constructor
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        double estatura;
        long telefono;

        System.out.print("Ingresa tu nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingresa tu edad: ");
        edad = entrada.nextInt();
        System.out.println("Hola, " + nombre + ", tienes " + edad + " años");
        System.out.print("Ingresa tu estatura: ");
        estatura = entrada.nextDouble();
        System.out.println("tu estatura es: " + estatura);
        System.out.print("ingresa tu telefono: ");
        telefono = entrada.nextLong();
        System.out.println("tu telefono es: " + telefono);
        entrada.close();
    }

}
