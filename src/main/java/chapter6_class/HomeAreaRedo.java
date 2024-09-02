package chapter6_class;

import java.util.Scanner;

public class HomeAreaRedo {
    private Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        HomeAreaRedo calculator= new HomeAreaRedo();
        ch6_classMathod kitchen=calculator.getRoom();
        ch6_classMathod bathRoom=calculator.getRoom();

        double area= calculator.calculateTotalArea(kitchen,bathRoom);
        System.out.printf("total area is "+area);
        calculator.sc.close();


    }
    public ch6_classMathod getRoom()
    {
        //Scanner sc=new Scanner(System.in);
        System.out.printf("enter the length");
        double length=sc.nextDouble();
        System.out.printf("enter the width");
        double width= sc.nextDouble();
        //sc.close();
        return new ch6_classMathod(length,width);
    }

    public double calculateTotalArea(ch6_classMathod rectangel1,ch6_classMathod rectangle2)
    {
        return rectangel1.calculateArea()+rectangle2.calculateArea();

    }

}
