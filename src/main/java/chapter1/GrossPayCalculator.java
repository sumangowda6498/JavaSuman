package chapter1;

import java.util.Scanner;

public class GrossPayCalculator {


     void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //1. Get the number of hours worked
        System.out.println("Enter you Name");
        String name= scanner.next();
        System.out.println("Enter the number of hours the employee worked.");

        int hours = scanner.nextInt();

        //2. Get the hourly pay rate
        System.out.println(name+" Enter the employee's pay rate.");
        double rate = scanner.nextDouble();
        scanner.close();

        //3. Multiply hours and pay rate
        double grossPay = hours * rate;

        //4. Display result
        System.out.println("The employee's gross pay is $" + grossPay);

        int x=1;
        int y=x++;
        System.out.println(x);
        System.out.println(y);
    }

}