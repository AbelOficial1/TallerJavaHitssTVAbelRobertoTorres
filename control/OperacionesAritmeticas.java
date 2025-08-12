package control;

import java.util.Scanner;

public class OperacionesAritmeticas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b;
        char operador;
        System.out.print("Valor de a: ");
        a = entrada.nextInt();
        System.out.print("Valor de b: ");
        b = entrada.nextInt();
        System.out.print("Operacion: ");
        operador = entrada.next().charAt(0);
        int resultado = switch (operador) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '%' -> a % b;
            default -> 0;
        };
        System.out.println(a + "" + operador + b + " = " + resultado);
    }
}
