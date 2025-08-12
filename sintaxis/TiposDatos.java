package sintaxis;

public class TiposDatos {
    int altura;

    public static void main(String[] args) {
        int edad;
        // System.out.println("Altura: " + altura);
        TiposDatos objeto1 = new TiposDatos();
        objeto1.altura = 34;
        objeto1.saludar();
    }

    public void saludar() {
        int edad;
        edad = 40;
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
    }

}
