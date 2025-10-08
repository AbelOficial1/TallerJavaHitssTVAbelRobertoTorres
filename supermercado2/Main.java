package supermercado2;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.BiPredicate;
import java.util.function.BiFunction;
import java.util.function.BiConsumer;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // SupermercadoService service = new SupermercadoService();

        // Crear objetos
        Cliente cliente1 = new Cliente(1, "Ana", "VIP");
        Empleado empleado1 = new Empleado(1, "Carlos", "Cajero");

        Producto p1 = new Producto(1, "Leche", 25, 10);
        Producto p2 = new Producto(2, "Pan", 15, 3);
        Producto p3 = new Producto(3, "Queso", 50, 2);

        List<Producto> productos = Arrays.asList(p1, p2, p3);
        Venta venta1 = new Venta(1, cliente1, empleado1, Arrays.asList(p1, p2, p3));

        SupermercadoService service = new SupermercadoService();

        // 1. Stock bajo
        System.out.println("Productos con stock bajo:");
        Arrays.asList(p1, p2, p3).stream()
                .filter(service.stockBajo)
                .forEach(System.out::println);

        // 2. Calcular total
        service.calcularTotal.apply(venta1);

        // 3. Imprimir venta
        service.imprimirVenta.accept(venta1);

        // 4. Producto de muestra
        System.out.println("Producto de muestra: " + service.productoMuestra.get());

        // 5. Aplicar descuento
        System.out.println("Queso con descuento: " + service.aplicarDescuento.apply(p3));

        // 6. Producto más caro
        System.out.println("Más caro entre Leche y Queso: " + service.productoMasCaro.apply(p1, p3));

        // 7. Cliente con descuento
        System.out.println("¿Cliente con descuento? " + service.clienteConDescuento.test(cliente1, venta1));

        // 8. Ticket
        System.out.println(service.generarTicket.apply(cliente1, venta1));

        // 9. Notificación
        service.notificar.accept(cliente1, empleado1);
    }
}