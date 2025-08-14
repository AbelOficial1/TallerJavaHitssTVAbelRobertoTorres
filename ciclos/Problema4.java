package ciclos;

import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalVentas = 0.0;
        int opcion;

        do {

            System.out.println("Elija una opcion con su numero correspondiente:");
            System.out.println("1. Registrar un pedido");
            System.out.println("2. Mostrar el total de ventas");
            System.out.println("3. Salir del sistema");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el precio del pedido: $");
                    double precio = sc.nextDouble();

                    if (precio > 0) {
                        totalVentas += precio;
                        System.out.println("Pedido registrado correctamente.");
                    } else {
                        System.out.println("ERROR: El precio debe ser un valor positivo.");
                    }
                    break;

                case 2:
                    System.out.println("El total de ventas es: $" + String.format("%.2f", totalVentas));
                    break;

                case 3:
                    System.out.println("Saliendo del sistema... ¡Gracias!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 3);

    }
}