package control;

public class Numeros {
    public static void main(String[] args) {
        int numero = 5;
        String resultado;
        resultado = (numero % 2 == 0) ? "par" : "impar"; // if(numero % 2 == 0 {} else {})
        System.out.println("El numero " + numero + " es " + resultado);
    }
}
