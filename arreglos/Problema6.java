package arreglos;

import java.util.Scanner;

public class Problema6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("ERROR");
            System.exit(-1);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == (n - 1 - i)) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }

    }
}
