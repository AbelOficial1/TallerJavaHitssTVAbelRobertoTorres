package catalogo;

public class IPhone extends Electronico {
    private String modelo;
    private String color;

    public IPhone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 1.20; // 20% más caro
    }

    @Override
    public String toString() {
        return "Tipo de producto: iPhone\n" +
                "Fabricante: " + fabricante + "\n" +
                "Modelo: " + modelo + ", Color: " + color + "\n" +
                "Precio base: $" + getPrecio() + "\n" +
                "Precio de venta: $" + getPrecioVenta();
    }
}