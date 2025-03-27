package Task;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int factorial=1;
        for (int i=1;i<=n;i++){
            factorial=factorial*i;//factorial*=i;
        }
        System.out.println(factorial);
        System.out.println("Enter name");
        String name=sc.next();
        System.out.println(name);
    }

}
