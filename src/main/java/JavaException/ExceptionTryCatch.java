package JavaException;
//One try can be Followed by multiple catch blocks
public class ExceptionTryCatch {


    public static void main(String[] args) {
        int b=7;
        int c=0;

        try{
         int k=b/c;
                System.out.println(k);
        }catch (Exception e)
        {
            System.out.println(" I catched an error/ Exception");
        }
    }
}
