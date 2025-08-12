package control;

public class Argumentos {
    public static void main(String[] args) {
        String username, password;
        username = args[0];
        password = args[1];
        if (username.equals("erxss") && password.equals("12345")) {
            System.out.println("Ingreso correctamente");
        } else {
            System.out.println("El username o password son incorrectos");
        }
    }

}
