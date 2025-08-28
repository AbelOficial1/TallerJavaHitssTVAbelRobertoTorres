package pedidos;

public class Main {
    public static void main(String[] args) {
        Order pedido1 = new Order(1, "Ana", OrderStatus.NEW,
                OrderPriority.HIGH, PaymentMethod.CARD);

        Order pedido2 = new Order(2, "Luis", OrderStatus.SHIPPED,
                OrderPriority.MEDIUM, PaymentMethod.CASH);

        Order pedido3 = new Order(3, "Marta", OrderStatus.DELIVERED,
                OrderPriority.LOW, PaymentMethod.TRANSFER);

        pedido1.showDetails();
        pedido2.showDetails();
        pedido3.showDetails();
    }
}