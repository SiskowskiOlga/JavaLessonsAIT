package lesson26;

public class SalaryUtil {
    public double getNettoSalary(double bruttoSalary){

        if (bruttoSalary < 2000){
            return bruttoSalary;//если меньше 2000, тогда зарплата не меняется
        }
        if (bruttoSalary > 2000 && bruttoSalary < 3000){
            return bruttoSalary - (bruttoSalary * 5)/100;//если больше 2000 и меньше 3000, то нетто возвращает отнимая 5%

        }
        if (bruttoSalary > 3500 && bruttoSalary < 5000){
            return  bruttoSalary -(bruttoSalary * 10)/100;//если больше 3500 и меньше 5000, то возвращается нетто брутто минус 10%

        }
        return bruttoSalary - (bruttoSalary * 15)/100; //если больше 5000, то облагаем брутто 15%

    }
}
