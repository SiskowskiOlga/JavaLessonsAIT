package lesson26;

public class JavaArrays {
    public static void main(String[] args) {
         //создали пустой массив
        //тип данных [] имя массива инициализация массива с размером хранилища
        double[]prices = new double[5];
        // создали массив цен, типа double, указали размер элементов


        // точно знаем что и сколько будет в массиве
        // создали массив возраста сотрудников и заполнили его значением (года)
        int[]age = {20,34,19,50,44};




        /*указываем какой массив хотим использовать(выбрав его название),
         указываем цену/придаем значение элементу,
         указав индекс этого элемента
        */

        prices[0]= 20.5;
        prices[1]= 40.5;
        prices[2]= 12.99;
        prices[3]= 4.0;
        prices[4]= 50;

        System.out.println(prices[0]);
        //получаем данные выводим указываем названия массива и
        // указываем индекс желаемого элемента




        //создали переменную, сохранили в ней значение и
        // выводя указываем название переменной
        double secondElement = prices[1];
        System.out.println(secondElement);




        //задаем имя массива prices.length вернет / посчитает размер массива,
        // получаем размер массива, если мы не знаем сами какой размер задан в коде
        int length = prices.length;
        System.out.println(length);





        System.out.println("------for1------");
        for(int i = 0;i < prices.length;i++ ){
            System.out.println(prices[i]);
            // решаем с какого индекса начинаем перебор массива

        }
        System.out.println("-----for2------");
        for (double price: prices){
            System.out.println(price);
            //проходим по циклу массива prices и
            // каждый элемент будет вытащен и сохранен в элементе price
            //мы не можем выбрать с определенного индекса, только полностью весь массив
        }




        System.out.println("-----newPrices------");
        double[]newPrices = new  double[prices.length];
        //создали новый массив и указали что размер такой же как у prices.length

        //массив от куда копируем стартовый индекс для копирования,
        // пишем в какой массив копируем,стартовый индекс и количество элементов указываем
        //копируем данные из prices в newPrices
        System.arraycopy(prices,0,newPrices,0,prices.length);
       for (double newprice: newPrices){
        System.out.println(newprice);





    } // клонирование массива из источника и можем здесь уже менять данные,
       // не портя источник
        System.out.println("-----clonePrices------");
       double[]clonePrices = prices.clone();
       for (double cloneprice : clonePrices){
           System.out.println(cloneprice);
       }



       /*рейтинг

        */
        System.out.println("-----Rattings, с циклом for------");

        int[]ratings = new  int [5];
        ratings[0] = 2;
        ratings[1] = 6;
        ratings[2] = 3;
        ratings[3] = 1;
        ratings[4] = 5;

        int sum = 0;
        for (int rating : ratings){
            sum = sum + rating;
        }
        int averageRating = sum/ratings.length;
        System.out.println(averageRating);
}
    }
