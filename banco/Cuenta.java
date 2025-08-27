package banco;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private static int contadorCuentas = 1;
    private int id;
    private String titular;
    private double saldo;
    private List<Transaccion> transacciones;

    public Cuenta(String titular, double depositoInicial) {
        this.id = contadorCuentas++;
        this.titular = titular;
        this.saldo = depositoInicial;
        this.transacciones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            Transaccion t = new Transaccion("Deposito", monto, this);
            transacciones.add(t);
            System.out.println("Deposito realizado con exito.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            Transaccion t = new Transaccion("Retiro", monto, this);
            transacciones.add(t);
            System.out.println("Retiro realizado con exito.");
        } else {
            System.out.println("Fondos insuficientes en la cuenta de " + titular);
        }
    }

    public void mostrarCuenta() {
        System.out.println("Cuenta ID: " + id + ", Titular: " + titular + ", Saldo: $" + saldo);
        System.out.println("Historial de transacciones:");
        if (transacciones.isEmpty()) {
            System.out.println("   No hay transacciones registradas.");
        } else {
            for (Transaccion t : transacciones) {
                System.out.println("   " + t);
            }
        }
    }
}
