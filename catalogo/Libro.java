package catalogo;

import java.util.Date;

import catalogo.interfaces.ILibro;

public class Libro extends Producto implements ILibro {
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 1.15; // 15% más caro
    }

    @Override
    public String toString() {
        return "Tipo de producto: Libro\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Editorial: " + editorial + "\n" +
                "Fecha publicación: " + fechaPublicacion + "\n" +
                "Precio base: $" + getPrecio() + "\n" +
                "Precio de venta: $" + getPrecioVenta();
    }
}