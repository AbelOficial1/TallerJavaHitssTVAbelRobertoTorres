package catalogo;

import java.util.Date;

public class Comics extends Libro {
    private String personaje;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 1.25; // 25% más caro
    }

    @Override
    public String toString() {
        return "Tipo de producto: Cómic\n" +
                "Título: " + getTitulo() + "\n" +
                "Autor: " + getAutor() + "\n" +
                "Editorial: " + getEditorial() + "\n" +
                "Personaje principal: " + personaje + "\n" +
                "Precio base: $" + getPrecio() + "\n" +
                "Precio de venta: $" + getPrecioVenta();
    }
}