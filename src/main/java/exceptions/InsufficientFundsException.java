package exceptions;

public class InsufficientFundsException extends Exception{
    private double shortage;

    // Конструктор
    public InsufficientFundsException(String message, double shortage) {
        super(message);
        this.shortage = shortage;
    }

    // Метод для получения недостающей суммы
    public double getShortage() {
        return shortage;
    }
}
