package lesson13;

public class JavaArrays {
    //МАССИВЫ:
    //тип []название (контейнера хранилище)
    public static void main(String[] args) {
        //1 вариант: контейнер сохраняет все зарплаты в нутри себя
        //каждый элемент в хранилище имеет свой индекс, начинается с 0
        int[] salaryMax = {400, 350, 500, 200, 300};

        //2 вариант: мы не знаем какая зарплата. Но знаем что 6 раз будем платить ей зарплату, по месячно.
        int[] salaryMaria = new int[7];
        salaryMaria[0] = 350;
        salaryMaria[1] = 400;   //если надо больше добавить,
        salaryMaria[2] = 450;   // то индекс увеличить в изначальном объявлении [9]
        salaryMaria[3] = 470;
        salaryMaria[4] = 400;
        salaryMaria[5] = 490;
        salaryMaria[6] = 250;

        // System.out.println(salaryMax[3]);
        //выводим определенное значение из хранилища указывая номер индекса

        int salaryMaxFirstMonth = salaryMax[0]; //или делаем переменной и выводим
        int sizeSalaryMax = salaryMax.length;
        //System.out.println("salaryMaxFirstMonth" + salaryMaxFirstMonth);
        //System.out.println("sizeSalaryMax" + sizeSalaryMax);

        for (int i = 0; i < salaryMaria.length; i++) {
            System.out.println(salaryMaria[i]);
        }
        //вариант вывода.
        for (int salary : salaryMaria) {
            System.out.println(salary);
        }


    }
}
