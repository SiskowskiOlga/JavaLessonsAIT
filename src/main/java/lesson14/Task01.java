package lesson14;

public class Task01 {
    private static double[] balances = {-1000.50, 2000.75, 300.40, 5400.00, 12300.30};

    public static void main(String[] args) {
        //написать код для расчета среднего баланса по всем счетам
        double sum = 0;
        for (int i = 0; i < balances.length; i++) {
            sum = balances[i] + sum;
        }
        double avegage = sum / balances.length;
        // общию сумму разделили на количество ячеек
        System.out.println("avegage: "+avegage );

        //определение количества счетов с балансом выше заданного значения 5000
        int counter = 0;
        for (int i = 0; i < balances.length; i++) {
            if (balances[i]>5000) {
                counter++;
            }
            System.out.println("количества счетов с балансом выше заданного значения 5000 = "+counter);

            /*
            некоторые счета ушли в минус,
             заменим все отрицательные балансы на ноль
             */
            for (i = 0; i<balances.length; i++){
                if (balances[i]<0) {
                    balances[i]=0;

                }

            }
            System.out.println(balances[i]);

            /*
             некоторые счета ушли в минус
             посчитаем общую сумму долга
             */
            double sumNegativ = 0;

            for (i = 0; i < balances.length; i++) {
                int sumNegativ = 0;
                if (balances[i]< 0){
                    sumNegativ = balances[i]+ sumNegativ;
                }
            }
        }
    }
}
