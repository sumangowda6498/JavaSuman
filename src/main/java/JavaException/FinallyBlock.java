package JavaException;
//One try can be Followed by multiple catch blocks
//catch should be the immediate block after try

public class FinallyBlock {


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
           finally {
            System.out.println(" Delete cookies"); //This block is executed irrespective of error thrown or not

        // we can use finally directly after try without catch block
        }
    }
}
/*
Exception code download
package coreJava; //one try can be followed by mutiplle catch blocks //catch should be an immediate block after try // public class exceptionDemo { public static void main(String[] args) { int b=7; int c=0; try { //  purchased faile     int k=b/c;// //int arr[]=new int[5];               //System.out.println(arr[7]);         } catch(ArithmeticException et) { System.out.println("I catched the Arthimetic/exception"); } catch(IndexOutOfBoundsException ets) { System.out.println("I catched the IndexBound/exception"); } catch(Exception e) { //  retry again System.out.println("I catched the error/exception"); } finally { System.out.println("delete cookies");//THis block is executed irrespective of exception thrown or not } // TODO Auto-generated method stub

}

}
 */