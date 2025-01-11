package Chapter8;

public class Arrys {
    static int[] numeric = {1,2,3,4,5};
    //public static int len=numeric.length;
    public static void main( String... args){
int len=numeric.length;
        System.out.println(len);
        revese(numeric,len);
    }

    private static void revese(int[] java,int width) {
        //int length=java.length;
        if(width>0){
            System.out.print(" "+java[width-1]);
            width--;
            revese(java,width);
        }

    }
}
