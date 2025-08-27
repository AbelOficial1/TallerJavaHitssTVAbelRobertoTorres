package banco;

public class Transaccion {
    private static int contadorTransacciones = 1;
    private int id;
    private String tipo;
    private double monto;
    private Cuenta cuenta;

    public Transaccion(String tipo, double monto, Cuenta cuenta) {
        this.id = contadorTransacciones++;
        this.tipo = tipo;
        this.monto = monto;
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "{Transaccion ID: " + id +
                ", Tipo: " + tipo +
                ", Monto: $" + monto +
                ", Cuenta ID: " + cuenta.getId() +
                " (" + cuenta.getTitular() + ")" + "}";
    }
}
