package lesson06;

public class Task01 {
    public static void main(String[] args) {

        // стаж покупателя
        double experience = 5;
        //сумма покупок
        double sum = 1800;
        //является клиентом да или нет
        boolean isClient;
        //скидка
        double discount = 0.0;
        double totalSum = sum - discount;

        if (sum < 1000) {
            System.out.println("сумма покупки " + sum + " €");
            System.out.println("Стаж покупателя " + experience + "лет");
            System.out.println("Размер скидки " + (discount * 100) + "%");
            System.out.println("Сумма скидки  " + discount + "€");
            System.out.println("Итоговая сумма к оплате " + totalSum + "€");

        } else {
            discount = 0.1;
            double discountSum = sum * discount;
            double sumToPay = sum - discountSum;
            if (experience > 5) {
                discount = 0.05;
                sumToPay = sumToPay - (sumToPay * discount);
            }
            System.out.println("Сумма покупки " + sum + "€");
            System.out.println("Стаж покупателя " + experience + " лет");
            System.out.println("Размер скидки " + (sum - sumToPay) + "€");
            System.out.println("Итоговая сумма к оплате " + sumToPay + "€");
        }
    }
}

