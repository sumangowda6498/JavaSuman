package Task;

import java.util.Scanner;

public class LargestElementArray {
    public static void main(String[] args) {
        //int arr[]={1,5,2,8,3};

        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();

        int arr[] = new int[len];
        for (int i=0;i<len;i++){
           arr[i]= sc.nextInt();
        }
        int largest=arr[0];

        for (int num:arr){
            if (num>largest){
                largest=num;
            }
        }

        System.out.println(largest);
    }
}
