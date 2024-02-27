package homework9;
public class StringProcessor {
    public static String reserveString(String str){
        StringBuilder reversed = new StringBuilder(str);
        return  reversed.reverse().toString();

        }
        public static boolean isPalindrome(String str){
        String reversed = reserveString(str);
        return str.equalsIgnoreCase(reversed);
    }
    public static void  main(String[]args){
        String input = "Kabak";
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reserveString(input));
        System.out.println("Is palindrome? " + isPalindrome(input));
    }


}
