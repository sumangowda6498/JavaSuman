package Chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket_SearchArray {

    private static final int LENGTH=6;
    private static final  int MAXNUMBER=68;


    public static void main(String[] args) {
        int[] ticket=generateNumber();
        System.out.println(ticket);
        printTicket(ticket);
        Arrays.sort(ticket);
        printTicket(ticket);


    }

    private static int[] generateNumber() {
        int i=0;
        int[] ticket=new int[LENGTH];
        Random random=new Random();

        for (i=0;i<LENGTH;i++){
            int randomnumber;
            do {
                randomnumber=random.nextInt(MAXNUMBER)+1;
            }while (search(ticket,randomnumber));
            ticket[i]=randomnumber;
        }

        return ticket;

    }
    private static boolean search(int[] ticket,int randomnumber){
        for (int num :ticket){
if (num==randomnumber){

}
        }
        return false;

    }
    private static void printTicket(int[] arr){
        int len=arr.length;
        System.out.println(len);
        for (int i=0;i<len;i++){
            System.out.printf(" "+arr[i]);
        }
        System.out.printf("\n");
    }
}
