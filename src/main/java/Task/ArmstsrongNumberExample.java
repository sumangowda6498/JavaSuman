package Task;

public class ArmstsrongNumberExample {
    public static void main(String[] args) {
        int number=371;

        int originalNumber=number;
        int remainder, result=0;


        while (originalNumber!=0){
            remainder=originalNumber%10;
            result+=Math.pow(remainder,3);

            originalNumber=originalNumber/10;
        }

        if(result==number){
            System.out.println(number+" is a Amstrong number");
        }else{
            System.out.println(number+" is a not Amstrong number");
        }

    }
}
