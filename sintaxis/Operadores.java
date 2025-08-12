package sintaxis;

public class Operadores {
    public static void main(String[] args) {
        // Operadores aritmeticos
        int a = 13, b = 5;
        double c = 5.4;

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division: " + a / b);
        System.out.println("Modulo: " + a % b);
        System.out.println("Expresion: " + (a + b * b / 2 % b - a));

        // Operadores de asignacion:
        a += b + 2; // a = a + b + 2
        System.out.println(a);
        a -= 5; // a = a - 5;
        a *= 2; // a = a * 2;
        a /= b; // a = a / b;
        a %= 4; // a = a % 4;
        System.out.println(a);

        // Operadores relacionales (comparacion)
        System.out.println("Igual: " + (a == b)); // false
        System.out.println("Diferente: " + (a != b)); // True
        System.out.println("Mayor que: " + (a > b)); // False
        System.out.println("Menor que: " + (a < b)); // True
        System.out.println("Mayor o igual que: " + (a >= b)); // False
        System.out.println("Menor o igual que: " + (a <= b)); // True

        // Operadores Logicos
        // AND (&&)
        // true && true = false
        // true && false = false
        // false && true = flase
        // false && false = false

        // OR (||)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        // NOT (!)
        // !true = false
        // !false = true

        System.out.println("AND: " + ((a != b) && !(a <= b)));
        System.out.println("Or: " + ((a != b) || (a >= b)));
        System.out.println("NOT: " + (!(a != b)));

        // Operadores ++ y --
        int x = 5, y = 5;
        System.out.println("Pre incremento: " + (++x)); // x=6
        System.out.println("Post incremento: " + (x++)); // x=6
        System.out.println("X: " + x);

        System.out.println("Pre decremento: " + (--y)); // y=4
        System.out.println("Post decremento: " + (y--)); // y=4
        System.out.println("Y: " + y); // y = 3
    }
}
