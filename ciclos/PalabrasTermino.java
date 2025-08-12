package ciclos;

public class PalabrasTermino {
    public static void main(String[] args) {
        otroMetodo();
        System.out.println("Otra Sentencia");
        System.out.println("Ejecuciondel del otro ciclo for");
        for (int i = 0; i < 15; i++) {
            System.out.println(i);
        }
    }

    public static void otroMetodo() {
        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                System.out.println("Termina la ejecucion del metodo otroMetodo");
                System.exit(0);
            }
            System.out.println(i);
        }
        System.out.println("Sentencia fuera del for en otro metodo");
    }

}
