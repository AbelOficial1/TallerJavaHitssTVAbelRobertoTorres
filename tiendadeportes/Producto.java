package tiendadeportes;

import java.util.Objects;

public class Producto implements Comparable<Producto> {
    private String sku; // Código único
    private String nombre;
    private String categoria;
    private int stock;

    public Producto(String sku, String nombre, String categoria, int stock) {
        this.sku = sku;
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
    }

    public String getSku() {
        return sku;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Producto))
            return false;
        Producto producto = (Producto) o;
        return sku.equals(producto.sku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku);
    }

    @Override
    public int compareTo(Producto otro) {
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }

    @Override
    public String toString() {
        return "SKU: " + sku +
                ", Nombre: " + nombre +
                ", Categoría: " + categoria +
                ", Stock: " + stock;
    }
}