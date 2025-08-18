package arreglos;

public class DeclaracionArreglos {
    public static void main(String[] args) {
        // Declaracion de arreglos
        // Declaracion: tipo [] nombreArreglo;
        final int N = 10;
        int[] numeros; // Declaracion
        numeros = new int[N]; // Inicializacion -> reserva el espacio en memoria

        // System.out.println("Direccion de memoria para numeros: " + numeros);
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[4] = 50;
        numeros[numeros.length - 1] = 100;

        for (int i = 0; i < numeros.length; i++) { // numeros[0]
            System.out.println("Elemento " + (i + 1) + ": " + numeros[i]);
            // numeros[i] = valor;
            // valor += 10;
        }
        System.out.println("Recorrer arreglo del primer elemento al ultimo");
        for (int numero : numeros) {
            System.out.println("numero: " + numero);
        }
        System.out.println("Recorrer arreglo del ultimo elemento al primero");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("numero: " + numeros[i]);
        }

        int j = 0;
        while (j < numeros.length) {
            System.out.println("Numero: " + numeros[j]);
            j++;

        }

        // Declaracion e inicializacion
        String[] nombres = new String[N];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + nombres[i]);
        }

        // Inicializacion Directa
        char[] letras = { 'a', 'b', 'c', 'd', 'e' };

        for (int i = 0; i < letras.length; i++) {
            System.out.println("Letra: " + letras[i]);
        }

        String descripcion = "Hola Mundo";

        System.out.println("Longitud de descripcion:" + descripcion.length());
        System.out.println("Tamaño del arreglo letras: " + letras.length);

        int edades[] = new int[N - 5];

    }
}
