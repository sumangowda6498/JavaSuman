package chapter3;

import java.util.Scanner;

public class logicalOperator {
    public static void main(String args[]){

        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get what we don't
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();

        scanner.close();

        //Make decision
        if(salary >= requiredSalary && years >= requiredYearsEmployed){//logical operator

                System.out.println("Congrats! You qualify for the loan");
            }


        else{
            System.out.println("Sorry, ");
        }

    }
}

