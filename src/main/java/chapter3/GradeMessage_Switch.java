package chapter3;

import java.util.Scanner;

public class GradeMessage_Switch {
    public static void main(String[] args) {
        System.out.printf("Enter your grade");
        Scanner sc=new Scanner(System.in);
        String grade=sc.next();
        String msg;
        switch(grade){
            case"A":msg="excellent";
            break;
            case"B":msg="very good";
            break;
            case"C":msg="good";
            break;
            case"D":msg="you need to work on it";
            break;
            default:msg="invalid input";
            break;

        }
        System.out.printf(msg);

    }
}
