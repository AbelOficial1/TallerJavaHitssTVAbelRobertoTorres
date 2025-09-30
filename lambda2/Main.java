package lambda2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Function<String, Map<String, Integer>> palabraMasRepetida = frase -> {
            Map<String, Long> conteo = Arrays.stream(frase.toLowerCase().split("\\W+"))
                    .collect(Collectors.groupingBy(p -> p, Collectors.counting()));

            Optional<Map.Entry<String, Long>> max = conteo.entrySet()
                    .stream()
                    .max(Map.Entry.comparingByValue());

            Map<String, Integer> resultado = new HashMap<>();
            max.ifPresent(entry -> resultado.put(entry.getKey(), entry.getValue().intValue()));
            return resultado;
        };

        String texto = "Hola hola mundo, hola Java mundo mundo mundo";
        Map<String, Integer> resultado = palabraMasRepetida.apply(texto);

        System.out.println("Resultado:");
        resultado.forEach((palabra, cantidad) ->
                System.out.println("Palabra: " + palabra + " | Veces: " + cantidad));

        if (!resultado.isEmpty()) {
            String palabra = resultado.keySet().iterator().next();
            Integer repeticiones = resultado.get(palabra);
            System.out.println("La palabra más repetida es '" + palabra + "' con " + repeticiones + " repeticiones.");
        }
    }
}