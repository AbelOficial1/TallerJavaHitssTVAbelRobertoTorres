package ciclos;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();

        boolean negativo = false;
        if (num1 < 0) {
            negativo = !negativo;
            num1 = -num1;
        }
        if (num2 < 0) {
            negativo = !negativo;
            num2 = -num2;
        }

        int resultado = 0;
        for (int i = 0; i < num2; i++) {
            resultado += num1;
        }

        if (negativo) {
            resultado = -resultado;
        }

        System.out.println("El resultado es: " + resultado);

    }

}
