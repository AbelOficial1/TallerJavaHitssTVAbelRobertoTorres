package arreglos;

public class Matrices {
    public static void main(String[] args) {
        final int FILAS = 2, COLUMNAS = 3;
        int[][] matriz = new int[FILAS][COLUMNAS];
        int[][] m = {
                { 1, 2, 3 },
                { 4, 5, 6, 7 },
                { 8, 9 }
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("For each con matrices");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.println(elemento + " ");
            }
            System.out.println();
        }
        for (int[] fila : m) {
            for (int el : fila) {
                System.out.println(el + " ");
            }
            System.out.println();
        }
    }
}
