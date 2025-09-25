package tiendadeportes;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Registrar productos
        inventario.registrarProducto(new Producto("SKU001", "Balon de futbol", "Futbol", 50));
        inventario.registrarProducto(new Producto("SKU002", "Camiseta Nike", "Running", 30));
        inventario.registrarProducto(new Producto("SKU003", "Tenis Adidas", "Running", 20));
        inventario.registrarProducto(new Producto("SKU004", "Balon de básquetbol", "Baloncesto", 15));

        // Consultar producto en O(1)
        System.out.println("\n🔍 Consultando producto SKU002:");
        System.out.println(inventario.consultarPorSku("SKU002"));

        // Reportes
        inventario.reporteOrdenInsercion();
        inventario.reporteOrdenAlfabetico();

        // Actualizar stock
        System.out.println("\n📈 Venta de 5 unidades de SKU001");
        inventario.actualizarStock("SKU001", -5);

        System.out.println("\n📦 Llegada de 10 unidades de SKU003");
        inventario.actualizarStock("SKU003", 10);
    }
}