package Task;

public class ReverseNumber {
    public static void main(String[] args) {

        int num=76325, reversed=0;
        while(num!=0){
            reversed=reversed*10 + num%10;
            num=num/10;
        }
        System.out.println(reversed);
    }
}
