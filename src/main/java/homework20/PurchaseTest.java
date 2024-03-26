package homework20;

import java.util.ArrayList;
/*
Составление списка покупок: а. Создайте класс Покупка с полями наименование товара (название товара) и цена (цена товара).
б. Создайте метод main для создания ArrayList с покупками и заполните его несколькими товарами.

Добавление новых покупок: а. Запишите метод добавления новых покупок в список.
Параметры метода: название и цена товара. б. Проверьте метод работы, добавив несколько новых покупок в список.

Вывод списка покупок: а. Запишите метод вывода всех покупок из списка.
б. Проверьте работу метода, вызвав его после добавления нескольких покупок.

Поиск покупок: а. Напишите метод поиска товаров по названию товара.
б. Проверьте метод работы, вызвав его для поиска нескольких товаров.

Удаление покупок: а. Запишите метод удаления предметов по ее названию.
б. Проверьте метод работы, удалите одну из покупок и снова выведите список покупок.
 */


public class PurchaseTest {
    public static void main(String[] args) {
        ArrayList<PurchaseHW> goods = new java.util.ArrayList<>();
        PurchaseHW purchaseHWOne = new PurchaseHW("Банан", 1.99);
        PurchaseHW purchaseHWTwo = new PurchaseHW("Яблоко", 3.50);

        goods.add(purchaseHWOne);
        goods.add(purchaseHWTwo);

        PurchaseHW.addPurchaseInList(goods, "Виноград", 6.99);
        PurchaseHW.addPurchaseInList(goods, "Морковка", 3.50);
        PurchaseHW.addPurchaseInList(goods, "Лайм", 2.99);

        PurchaseHW.printPurchase(goods);
        PurchaseHW.searchPurchase(goods, "Хурма");
        PurchaseHW.cleanPurchase(goods, "Виноград");
        PurchaseHW.printPurchase(goods);//выводим список для проверки удаления товара


    }
}

