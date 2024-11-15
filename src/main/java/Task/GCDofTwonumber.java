package Task;

public class GCDofTwonumber {
    public static void main(String[] args) {
        int a=70, b=34, temp;

        while(b!=0){
            temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
    }
}
