package lesson20;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class TestPurchase {
    public static void main(String[] args) {
        ArrayList<Purchase> purchasesTest = new ArrayList<>();
        ArrayList<Purchase> purchases = new ArrayList<>();
        Purchase purchaseOne =new Purchase("Ananas", 5);
        Purchase purchaseTwo = new Purchase("Cheese", 3);
        Purchase purchaseThree = new Purchase("Cheese", 5);
        purchases.add(purchaseOne);
        purchases.add(purchaseTwo);
        purchases.add(purchaseThree);
        Purchase.addPurchase(purchases,"Bier", 2);
        Purchase.printArrayList(purchases);
        Purchase.searchByName(purchases, "Ananas");
        Purchase.searchPurchaseByName(purchases, "Ananas");

        //Purchase.removeByName(purchases,"Cheese");
        //Purchase.removePurchaseByName(purchases, "Cheese");
        //Purchase.removePurchaseByNameIterator(purchases,purchaseTwo);
        Purchase.printArrayList(purchases);
        //System.out.println(purchases);
        Collections.sort(purchases);
        //Purchase.printArrayList(purchases);

        //Создаем компаратор для сортировки элементов (покупок) по цене
        Comparator<Purchase> preisComparator = Comparator.comparingDouble(purchase -> purchase.getPrice());
        //Сортировка элементов
        purchases.sort(preisComparator);
        Purchase.printArrayList(purchases);
        purchasesTest= (ArrayList<Purchase>) purchases.clone();
        Purchase.printArrayList(purchasesTest);
        System.out.println(purchases.equals(purchasesTest));

    }


}
