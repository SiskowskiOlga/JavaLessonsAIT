package homework25;

public class OnlineShop {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.SHIPPED;
        System.out.println("Описание текущего состояния заказа: " + status.getDescription());

        System.out.println("Можно ли отменить заказ? "+ status.canCancel());


    }
}
