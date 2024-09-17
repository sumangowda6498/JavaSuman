package Task;

import java.util.Scanner;
//
public class Palindromecheck {
    public static void main(String[] args) {
        System.out.println("Enter the String ");
        Scanner sc =new Scanner(System.in);
        String word= sc.next();
        System.out.println("Great");
        System.out.println(word);
        if(isPalidrome(word)){
            System.out.println("Given string is palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }

    public static boolean isPalidrome(String str){
        int right=str.length();
        int left=0;

        while (left<right){
            if (str.charAt(left)!=str.charAt(right-1)){
                return false;

            }
            left++;
            right--;

        }
        return true;
    }
}
