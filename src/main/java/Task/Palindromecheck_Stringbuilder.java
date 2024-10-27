package Task;

public class Palindromecheck_Stringbuilder {
    public static void main(String[] args) {
        String str="madam";
        String reversed= new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed));

        if (str.equals(reversed)==true){
            System.out.println(str+" is Palindrome");
        }else {
            System.out.println("its not Palindrome");
        }
    }
}
