package Clolections_List;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arl=new ArrayList<Integer>();
        arl.add(3);
        arl.add(7);
        System.out.println(arl);
        arl.add(1, 4);
        System.out.println(arl);
        arl.remove(0);//index  value 3 will be removed
        System.out.println(arl);
        System.out.println(arl.get(0));
        System.out.println(arl.contains(4));

    }
}
