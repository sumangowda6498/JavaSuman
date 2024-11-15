package GeekForGeek;

public class UnicodeString {
    public static void main(String[] args) {

        String str="SUMAnN";

        //Unicode at all index
        int result1= str.codePointAt(0);
        int result2= str.codePointAt(1);
        int result3=str.codePointAt(2);
        int result4=str.codePointAt(3);
        int result5=str.codePointAt(4);
        int result6=str.codePointAt(5);

        System.out.println("Original string +" +str);

        System.out.println("unicode point at 0: "+result1);
        System.out.println("unicode point at 1: "+result2);
        System.out.println("unicode point at 2: "+result3);
        System.out.println("unicode point at 3: "+result4);
        System.out.println("unicode point at 4: "+result5);
        System.out.println("unicode point at 5: "+result6);

    }
}
