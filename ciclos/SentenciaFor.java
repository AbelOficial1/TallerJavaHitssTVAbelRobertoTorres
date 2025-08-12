package ciclos;

public class SentenciaFor {
    public static void main(String[] args) {
        // imprimir los numeros enteros del 1 al 10 secuencialmente
        int i;
        for (i = 1; i <= 20; i++) {
            // Break --> termina o corta el flujo de las iteraciones
            // continue --> omite el valor que cumple la condicion
            if (i % 2 == 0)

                continue;
            System.out.println(i);
        }

    }

}
