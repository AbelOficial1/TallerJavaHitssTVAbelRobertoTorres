package banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cuenta> cuentas = new ArrayList<>();
        int opcion;

        do {
            System.out.println("Elige una opcion por su numero:");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Mostrar cuentas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del titular: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese deposito inicial: ");
                    double deposito = sc.nextDouble();
                    Cuenta nuevaCuenta = new Cuenta(nombre, deposito);
                    cuentas.add(nuevaCuenta);
                    System.out.println("Cuenta creada con exito. ID: " + nuevaCuenta.getId());
                    break;

                case 2:
                    System.out.print("Ingrese ID de la cuenta: ");
                    int idDep = sc.nextInt();
                    System.out.print("Ingrese monto a depositar: ");
                    double montoDep = sc.nextDouble();
                    Cuenta cuentaDep = buscarCuenta(cuentas, idDep);
                    if (cuentaDep != null) {
                        cuentaDep.depositar(montoDep);
                    } else {
                        System.out.println("Cuenta no encontrada.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese ID de la cuenta: ");
                    int idRet = sc.nextInt();
                    System.out.print("Ingrese monto a retirar: ");
                    double montoRet = sc.nextDouble();
                    Cuenta cuentaRet = buscarCuenta(cuentas, idRet);
                    if (cuentaRet != null) {
                        cuentaRet.retirar(montoRet);
                    } else {
                        System.out.println("Cuenta no encontrada.");
                    }
                    break;

                case 4:
                    for (Cuenta c : cuentas) {
                        c.mostrarCuenta();
                        System.out.println("----------------------");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }

    private static Cuenta buscarCuenta(List<Cuenta> cuentas, int id) {
        for (Cuenta c : cuentas) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}
