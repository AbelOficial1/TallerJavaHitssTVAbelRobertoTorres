package supermercado2;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.BiPredicate;
import java.util.function.BiFunction;
import java.util.function.BiConsumer;
import java.util.List;

public class SupermercadoService {

    // 1. Filtrar productos con stock bajo
    public Predicate<Producto> stockBajo = p -> p.getStock() < 5;

    // 2. Calcular total de una venta
    public Function<Venta, Double> calcularTotal = venta -> {
        double total = venta.getProductos().stream()
                .mapToDouble(Producto::getPrecio)
                .sum();
        venta.setTotal(total);
        return total;
    };

    // 3. Imprimir detalles de una venta
    public Consumer<Venta> imprimirVenta = venta -> {
        System.out.println("Ticket de venta #" + venta.getId());
        venta.getProductos().forEach(p -> System.out.println("- " + p));
        System.out.println("Total: " + venta.getTotal());
    };

    // 4. Generar producto de muestra
    public Supplier<Producto> productoMuestra = () -> new Producto(0, "Jamon", 10.0, 100);

    // 5. Aplicar descuento del 10%
    public UnaryOperator<Producto> aplicarDescuento = p -> {
        p.setPrecio(p.getPrecio() * 0.9);
        return p;
    };

    // 6. Comparar dos productos y devolver el más caro
    public BinaryOperator<Producto> productoMasCaro = (p1, p2) -> p1.getPrecio() >= p2.getPrecio() ? p1 : p2;

    // 7. Verificar descuento a cliente VIP
    public BiPredicate<Cliente, Venta> clienteConDescuento = (c, v) -> c.getTipo().equalsIgnoreCase("VIP")
            && v.getTotal() > 1000;

    // 8. Generar ticket de venta
    public BiFunction<Cliente, Venta, String> generarTicket = (c, v) -> "Ticket Venta #" + v.getId() + "\nCliente: " + c
            + "\nTotal: " + v.getTotal();

    // 9. Notificar compra procesada
    public BiConsumer<Cliente, Empleado> notificar = (c, e) -> System.out.println("Cliente " + c.getNombre() +
            ", su compra fue procesada por " + e.getNombre());
}