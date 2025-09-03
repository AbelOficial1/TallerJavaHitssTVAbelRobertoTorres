package catalogo;

public class TvLcd extends Electronico {
    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 1.10; // 10% más caro
    }

    @Override
    public String toString() {
        return "Tipo de producto: TV LCD\n" +
                "Fabricante: " + fabricante + "\n" +
                "Pulgadas: " + pulgada + "\n" +
                "Precio base: $" + getPrecio() + "\n" +
                "Precio de venta: $" + getPrecioVenta();
    }
}