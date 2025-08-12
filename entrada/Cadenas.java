package entrada;

public class Cadenas {
    public static void main(String[] args) {
        String nombre1 = "   Eloy Sanchez Salmoran   ";
        // index 0123456789.... length() -1
        String nombre2 = "Eloy SAnchez hola Salmoran elay hola sanchez salmoran hola xxxxx yyyyy";
        System.out.println("length(): " + nombre1.length());
        System.out.println("(==): " + (nombre1 == nombre2)); // No es recomendable en objetos
        System.out.println("equals(): " + nombre1.equals(nombre2));
        System.out.println("equalsIgnoreCase(String b): " + nombre1.equalsIgnoreCase(nombre2));

        System.out.println("nombre: " + nombre1);
        System.out.println("trim(): " + nombre1.trim());
        System.out.println("charAt(int i): " + nombre2.charAt(nombre2.length() - 1));

        // subcadenas
        System.out.println("substring(int a, int b): " + nombre2.substring(5, 12));
        System.out.println("substring(int i): " + nombre2.substring(5));

        System.out.println("indexof(String cadena): " + nombre2.indexOf("h"));
        System.out.println("lastIndexOf(String cadena): " + nombre2.lastIndexOf("hola"));

        System.out.println("startwith(String prefijo): " + nombre2.startsWith("loy"));
        System.out.println("endswith(String sufijo): " + nombre2.endsWith("yy"));
    }

}
