package ciclos;

import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sumaMayores = 0;
        int contadorMayores = 0;

        double sumaMenores = 0;
        int contadorMenores = 0;

        int contadorNotas1 = 0;

        double sumaTotal = 0;
        int contadorTotal = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese la nota final del alumno " + i + " (1.0 a 10.0): ");
            double nota = sc.nextDouble();

            if (nota < 1.0 || nota > 10.0) {
                System.out.println("La nota debe estar entre 1.0 y 10.0.");
                System.exit(-1);

            }

            sumaTotal += nota;
            contadorTotal++;

            if (nota >= 6.0) {
                sumaMayores += nota;
                contadorMayores++;
            } else {
                sumaMenores += nota;
                contadorMenores++;
            }

            if (nota == 1.0) {
                contadorNotas1++;
            }
        }

        System.out.println("RESULTADOS:");

        if (contadorMayores > 0) {
            System.out.println("Promedio de notas mayores o iguales a 6.0: "
                    + String.format("%.2f", (sumaMayores / contadorMayores)));
        } else {
            System.out.println("No hay notas mayores o iguales a 6.0.");
        }

        if (contadorMenores > 0) {
            System.out.println(
                    "Promedio de notas menores a 6.0: " + String.format("%.2f", (sumaMenores / contadorMenores)));
        } else {
            System.out.println("No hay notas menores a 6.0.");
        }

        System.out.println("Cantidad de notas iguales a 1.0: " + contadorNotas1);
        System.out.println("Promedio total: " + String.format("%.2f", (sumaTotal / contadorTotal)));

    }
}
