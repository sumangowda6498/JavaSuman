package chapter3;

import java.util.Scanner;

public class TestResult {
    public static void main(String[] args) {
        double testscore;
        System.out.println("Enter your test score");
        Scanner sc=new Scanner(System.in);
        testscore=sc.nextDouble();
        char grade;


        if (testscore<=60){
            grade='E';
        } else if (testscore<=70) {
            grade='D';
        } else if (testscore<=80) {
            grade='C';
        }else if (testscore<=90){
            grade='B';
        }else{
            grade='A';
        }

        System.out.printf("Your earned "+grade+" grade.");

    }
}
