package homework9;

public class PalindromeExample {
    public static void  main(String[]args){
        String input = "А роза упала на лапу Азора";
        //удаляем все пробелы из строки
        String stringWithoutSpaces = input.replaceAll("\\s","");

        //приводим строку к нижнему регистру
        String lowercaseInput = stringWithoutSpaces.toLowerCase();

        //проверяем является ли строка палиндроме
        boolean isPalindrome = true;
        for (int i = 0; i < lowercaseInput.length() / 2; i++){
            if (lowercaseInput.charAt(i) != lowercaseInput.charAt(lowercaseInput.length() - i - 1)){
    isPalindrome = false; break;

            }
        }
    if(isPalindrome){
        System.out.println("строка \""+ input + "\" является палиндромом.");

    }else {
        System.out.println("Строка \"" + input + "\" не является палиндромом");
    }
}
}
