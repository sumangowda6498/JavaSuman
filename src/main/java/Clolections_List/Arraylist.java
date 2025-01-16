package Clolections_List;
import java.util.ArrayList;

public class Arraylist {
    // can accept duplicate values
    // ArraList,LinkedList,vector- Implementing List interface
    // array have fixed size where as arraylist can grow dynamicaly
    // you can access and insert any value in any index
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
        System.out.println(arl.indexOf(4));
        System.out.println(arl.size());

    }
}
