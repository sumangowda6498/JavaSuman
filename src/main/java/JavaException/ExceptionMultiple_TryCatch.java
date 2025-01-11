package JavaException;
//One try can be Followed by multiple catch blocks
//catch should be the immediate block after try

public class ExceptionMultiple_TryCatch {


    public static void main(String[] args) {
        int b=7;
        int c=0;

        try{
//                int k=b/c;
//                System.out.println(k);

            int arr[]=new int[5];
            System.out.println(arr[7]);

           }catch (ArithmeticException ea)
           {
            System.out.println(" I Arithmatic Exception");
            }catch (ArrayIndexOutOfBoundsException ear)
           {
            System.out.println(" I catched Array Index out of Bound Exception");
           }
    }
}
