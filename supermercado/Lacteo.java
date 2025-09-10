package supermercado;

public record Lacteo(String nombre, double precio, int cantidad, int proteinas)
        implements Producto {
}