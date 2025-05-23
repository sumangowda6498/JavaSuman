package Task;

import java.util.Scanner;

public class StarsTraingle_Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
    int n= sc.nextInt();

    for (int i=0;i<n;i++){//count row forloop
        for(int k=0;k<i;k++){
            System.out.print(" ");
        }

        for(int j=0;j<n-i;j++){
            System.out.print("* ");//print star for loop
        }
        System.out.println();
    }
    }
}
