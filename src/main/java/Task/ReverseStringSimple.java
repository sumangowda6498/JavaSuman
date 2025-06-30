package Task;

import java.util.Scanner;

public class ReverseStringSimple {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the String");
        String orinal= sc.nextLine();

        //Reverse the STring using for loop
        String reverse="";
        for (int i= orinal.length()-1;i>=0;i--){
            reverse+=orinal.charAt(i);
        }

        System.out.println(reverse);
    }
}
