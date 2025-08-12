package control;

import java.util.Scanner;

public class Caracteres {
    public static void main(String[] args) {
        // saber si un caracter dado por el usuario, es
        // una letra (decir si es vocal o consonante),
        // un numero o un caracter especial
        Scanner entrada = new Scanner(System.in);
        char caracter;
        System.out.print("Caracter: ");
        caracter = entrada.next().charAt(0);
        if (Character.isLetter(caracter)) {
            // si es vocal o consonante
            char c = Character.toLowerCase(caracter);
            switch (c) { // if(c == 'a' || c == 'e' || c == 'i' || c== 'o' || c == 'u')
                case 'a', 'e', 'i', 'o', 'u' ->
                    System.out.println("El caracter " + caracter + " es una vocal");

                default ->
                    System.out.println("El caracter " + caracter + " es una consonante");
            }
        } else if (Character.isDigit(caracter)) {
            // si es un numero
            System.out.println("El caracter " + caracter + " es un numero");
        } else {
            System.out.println("El caracter " + caracter + " es un caracter especial");
        }
    }
}
