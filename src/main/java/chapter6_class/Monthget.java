package chapter6_class;

import java.util.Scanner;

public class Monthget {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter month number\n");
        int num=sc.nextInt();
        System.out.printf(Month.getMonth(num)+"\n");
        String month_name=sc.next();
        System.out.println(Month.getMonth(month_name));

        //System.out.println(Month.getMonth("November"));
    }
}
