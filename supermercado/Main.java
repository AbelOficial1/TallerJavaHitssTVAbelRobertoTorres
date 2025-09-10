package supermercado;

public class Main {
    public static void main(String[] args) {
        Lacteo[] bolsaLacteos = {
                new Lacteo("Leche", 25.5, 1, 8),
                new Lacteo("Yogurt", 15.0, 1, 5),
                new Lacteo("Queso", 50.0, 1, 10),
                new Lacteo("Crema", 22.0, 1, 4),
                new Lacteo("Mantequilla", 30.0, 1, 3)
        };

        Fruta[] bolsaFrutas = {
                new Fruta("Manzana", 12.0, 0.25, "Roja"),
                new Fruta("Platano", 10.0, 0.3, "Amarillo"),
                new Fruta("Pera", 15.0, 0.2, "Verde"),
                new Fruta("Naranja", 8.0, 0.35, "Naranja"),
                new Fruta("Uvas", 20.0, 0.5, "Moradas")
        };

        Limpieza[] bolsaLimpieza = {
                new Limpieza("Cloro", 18.0, "Hipoclorito", 1.0),
                new Limpieza("Detergente", 25.0, "Tensioactivos", 1.5),
                new Limpieza("Jabon Liquido", 30.0, "Glicerina", 0.8),
                new Limpieza("Suavizante", 28.0, "Perfume", 1.2),
                new Limpieza("Limpiavidrios", 15.0, "Alcohol", 0.5)
        };

        NoPerecible[] bolsaNoPerecibles = {
                new NoPerecible("Arroz", 40.0, 1000, 3500),
                new NoPerecible("Frijol", 50.0, 900, 3600),
                new NoPerecible("Pasta", 25.0, 500, 1800),
                new NoPerecible("Harina", 35.0, 1000, 4000),
                new NoPerecible("Azucar", 30.0, 1000, 3800)
        };

        double totalGeneral = 0;

        double subtotalLacteos = 0;
        System.out.println("=== Bolsa de Lacteos ===");
        for (Lacteo l : bolsaLacteos) {
            System.out.println("Nombre: " + l.nombre() + " | Precio: $" + l.precio()
                    + " | Cantidad: " + l.cantidad() + " | Proteinas: " + l.proteinas());
            subtotalLacteos += l.precio();
        }
        System.out.println("Subtotal Lacteos: $" + subtotalLacteos + "\n");
        totalGeneral += subtotalLacteos;

        double subtotalFrutas = 0;
        System.out.println("=== Bolsa de Frutas ===");
        for (Fruta f : bolsaFrutas) {
            System.out.println("Nombre: " + f.nombre() + " | Precio: $" + f.precio()
                    + " | Peso: " + f.peso() + "kg | Color: " + f.color());
            subtotalFrutas += f.precio();
        }
        System.out.println("Subtotal Frutas: $" + subtotalFrutas + "\n");
        totalGeneral += subtotalFrutas;

        double subtotalLimpieza = 0;
        System.out.println("=== Bolsa de Limpieza ===");
        for (Limpieza li : bolsaLimpieza) {
            System.out.println("Nombre: " + li.nombre() + " | Precio: $" + li.precio()
                    + " | Componentes: " + li.componentes() + " | Litros: " + li.litros());
            subtotalLimpieza += li.precio();
        }
        System.out.println("Subtotal Limpieza: $" + subtotalLimpieza + "\n");
        totalGeneral += subtotalLimpieza;

        double subtotalNoPerecibles = 0;
        System.out.println("=== Bolsa de No Perecibles ===");
        for (NoPerecible np : bolsaNoPerecibles) {
            System.out.println("Nombre: " + np.nombre() + " | Precio: $" + np.precio()
                    + " | Contenido: " + np.contenido() + "g | Calorias: " + np.calorias());
            subtotalNoPerecibles += np.precio();
        }
        System.out.println("Subtotal No Perecibles: $" + subtotalNoPerecibles + "\n");
        totalGeneral += subtotalNoPerecibles;

        System.out.println("==================================");
        System.out.println("TOTAL GENERAL A PAGAR: $" + totalGeneral);
        System.out.println("==================================");
    }
}