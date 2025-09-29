package expresionlambda;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, String> limpiarYMayusculas = s -> s.replaceAll("[ ,.]", "")
                .toUpperCase();

        String texto = "Hola, mundo. TallerJavaHitssTV.";
        String resultado = limpiarYMayusculas.apply(texto);

        System.out.println("texto original: " + texto);
        System.out.println("texto transformado: " + resultado);
    }
}