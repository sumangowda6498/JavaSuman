package Task;

public class Arrys {
    static int[] numeric = {1,2,3,4,5};
    public static int len=numeric.length;
    public static void main( String... args){

        System.out.println(len);
        revese(numeric);
    }

    private static void revese(int[] java) {
        //int length=java.length;
        if(len>0){
            System.out.print(" "+java[len-1]);
            len--;
            revese(java);
        }

    }
}
