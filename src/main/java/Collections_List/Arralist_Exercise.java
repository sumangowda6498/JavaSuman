package Collections_List;
import java.util.ArrayList;
public class Arralist_Exercise {
    public static void main(String[] args) {
        ArrayList<String> arl=new ArrayList<String>();
        arl.add("apple");
        arl.add("banana");
        arl.add("cherry");
        arl.add("mango");
        arl.add("apple");
        System.out.println(arl);
        int index=arl.indexOf("apple");
        arl.remove(index);
        System.out.println(arl.size());


        boolean flag=arl.contains("orange");

        System.out.println(flag);
        int val=0;
        while (arl.size() > val) {

            // Printing the element which holds above
            // condition true
            System.out.println(arl.get(val));
            val++;
        }

    }
}
