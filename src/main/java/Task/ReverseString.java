package Task;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
       String s;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the String");
        s=sc.next();

        System.out.println("String is "+s);
        System.out.println("Reverse String "+reverseString(s));
    }

    public static String reverseString(String s){
        char[] str=new char[s.length()];
        Stack<Character> stack=new Stack<Character>();

        for (int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        int j=0;
        while (!stack.isEmpty()){
            str[j++]=stack.pop();
        }

        return new String(str);

    }
}
