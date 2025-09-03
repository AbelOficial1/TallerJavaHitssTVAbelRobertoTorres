package catalogo;

import java.util.Date;

import catalogo.interfaces.IProducto;

public class Main {
    public static void main(String[] args) {
        IProducto[] productos = new IProducto[5];

        productos[0] = new IPhone(25000, "Apple", "iPhone 15", "Negro");
        productos[1] = new TvLcd(15000, "Samsung", 55);
        productos[2] = new Libro(1800, new Date(), "Eric Gamma", "Patrones de Diseño", "Addison-Wesley");
        productos[3] = new Libro(1400, new Date(), "Martin Fowler", "UML Distilled", "Pearson");
        productos[4] = new Comics(900, new Date(), "Stan Lee", "Spider-Man", "Marvel", "Spider-Man");

        for (IProducto p : productos) {
            System.out.println("---------------------------------");
            System.out.println(p.toString());
        }
    }
}