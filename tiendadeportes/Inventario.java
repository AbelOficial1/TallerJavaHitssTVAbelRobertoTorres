package tiendadeportes;

import java.util.*;

public class Inventario {
    private Map<String, Producto> productosPorSku; // O(1) búsqueda por SKU
    private LinkedHashMap<String, Producto> ordenInsercion; // Reporte en orden agregado
    private TreeSet<Producto> productosPorNombre; // Reporte alfabético

    public Inventario() {
        productosPorSku = new HashMap<>();
        ordenInsercion = new LinkedHashMap<>();
        productosPorNombre = new TreeSet<>();
    }

    // Registrar un producto
    public void registrarProducto(Producto p) {
        if (productosPorSku.containsKey(p.getSku())) {
            System.out.println("⚠ Producto con SKU " + p.getSku() + " ya existe.");
            return;
        }
        productosPorSku.put(p.getSku(), p);
        ordenInsercion.put(p.getSku(), p);
        productosPorNombre.add(p);
        System.out.println("✅ Producto registrado: " + p.getNombre());
    }

    // Consultar producto en O(1)
    public Producto consultarPorSku(String sku) {
        return productosPorSku.get(sku);
    }

    // Reporte por orden de inserción
    public void reporteOrdenInsercion() {
        System.out.println("\n📦 Reporte en orden de inserción:");
        ordenInsercion.values().forEach(System.out::println);
    }

    // Reporte alfabético
    public void reporteOrdenAlfabetico() {
        System.out.println("\n🔠 Reporte ordenado alfabéticamente:");
        productosPorNombre.forEach(System.out::println);
    }

    // Actualizar stock
    public void actualizarStock(String sku, int cantidad) {
        Producto p = productosPorSku.get(sku);
        if (p != null) {
            p.setStock(p.getStock() + cantidad);
            System.out.println("✅ Stock actualizado: " + p);
        } else {
            System.out.println("❌ No se encontró producto con SKU " + sku);
        }
    }
}