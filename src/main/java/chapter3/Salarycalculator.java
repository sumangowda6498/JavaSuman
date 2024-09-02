package chapter3;

import java.util.Scanner;

public class Salarycalculator {
    public static void main(String[] args) {
        //intilaize known value;
        int salary=1000,bonus=250,quota;

        System.out.println("Enter the total number of product sold in this week");
        Scanner sc= new Scanner(System.in);
        quota=sc.nextInt();
        sc.close();

        if(quota>10){
            salary=salary+bonus;
        }

        System.out.println("The total salay is $"+salary);

    }
}
