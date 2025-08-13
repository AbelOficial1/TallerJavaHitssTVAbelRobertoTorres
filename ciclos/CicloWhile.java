package ciclos;

public class CicloWhile {
    public static void main(String[] args) {
        int i = 1;

        while (i < 1000) {
            System.out.println("===========Ciclo While===========");
            System.out.println("i: " + i);
            i *= 2; // i = i *2
        }

        System.out.println("===========Ciclo For===========");
        for (int j = 1; j < 1000; j *= 2) { // j++, ++j, j--, --j
            System.out.println("j: " + j);
        }
    }
}
