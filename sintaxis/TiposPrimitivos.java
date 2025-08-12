package sintaxis;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Enteros ==> byte (Tipo de referencia: Byte)
        byte enteroByte = 127;
        System.out.println("Byte: " + enteroByte);
        System.out.println("Valor minimo de byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo de byte: " + Byte.MAX_VALUE);

        // Enteros ==> short (tipo de referencia: Short)
        short enteroShort = 32767;
        System.out.println("Short: " + enteroShort);
        System.out.println("Valor minimo de short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo de short: " + Short.MAX_VALUE);

        // Enteros ==> int (Tipo de referencia: Integer)
        int entero = 32768;
        System.out.println("Int: " + entero);
        System.out.println("Valor minimo de int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo de int: " + Integer.MAX_VALUE);

        // Enteros ==> long (Tipo de referencia: Long)
        long enteroLong = 9223372036854775807L;
        System.out.println("Long: " + enteroLong);
        System.out.println("Valor minimo de Long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo de Long: " + Long.MAX_VALUE);

        // Punto flotante ==> float (Tipo de referencia: Float)
        float numeroDecimal = 34.23F;
        System.out.println("Float: " + numeroDecimal);
        System.out.println("Valor minimo de float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo de float: " + Float.MAX_VALUE);

        // Punto flotante ==> double (Tipo de referencia: Float)
        double numeroDouble = 34.23;
        System.out.println("Double: " + numeroDouble);
        System.out.println("Valor minimo de double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo de double: " + Double.MAX_VALUE);

        // Caracteres ==> Char (Tipo de referencia: Character)
        char caracter = 'c';
        System.out.println("Caracter: ");
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        // Boleanos ==> boolean (Tipo de referencia: Boolean)
        boolean esValido = false;
        System.out.println("Boolean: " + esValido);
        System.out.println(Boolean.TRUE);

        Boolean isLogin = true;

        // Tipo de referencia: Cadenas
        String nombre = "Eloy";
        System.out.println("Nombre: " + nombre.toUpperCase());
        System.out.println("Nombre: " + nombre);

        // Conversion de tipos
        int i = 100;
        System.out.println("Entero: " + i);
        double d = 100; // conversion de forma directa
        System.out.println("Double: " + d);

        int x = (int) d; // conversion explicita
        System.out.println("Entero: " + x);

    }
}
