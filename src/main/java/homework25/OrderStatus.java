package homework25;

public enum OrderStatus {
    PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELLED;


    // Метод для получения описания статуса заказа
    public String getDescription() {
        switch (this) {
            case PENDING:
                return "Ваш заказ ожидает утверждения, пожалуйста подождите.";
            case PROCESSING:
                return "Ваш заказ в процессе обработки, это займет пару минут.";
            case SHIPPED:
                return "Заказ отправлен";
            case DELIVERED:
                return "Заказ доставлен, благодарим что выбрали нас.";
            case CANCELLED:
                return "Заказ отменен, очень жаль:(";
            default:
                return "Неизвестный статус заказа";
        }
    }

    // Метод для проверки возможности отмены заказа
    public boolean canCancel() {
        return this == PENDING || this == PROCESSING;
    }
}

