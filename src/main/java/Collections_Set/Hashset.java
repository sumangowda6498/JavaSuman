package Collections_Set;
import java.util.HashSet;
import java.util.Iterator;
//HashSet, treeSet, LinkedHashSet implements Set interface
// The elements are not stored or displayed in order and it does not accept duplicate value

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();
        hs.add("india");
        hs.add("usa");
        hs.add("russia");
        hs.add("Pakistan");
        hs.add("Japan");

        System.out.println(hs);

        System.out.println(hs.remove("Pakistan")+"remv Pakistan");
        System.out.println("Is empty: "+hs.isEmpty() );
        System.out.println("Size: "+hs.size());
        System.out.println("");

        Iterator<String> i= hs.iterator();
        while (i.hasNext()){     // hasNext() returns boolean value . it checks whether next element present or not
            System.out.println(i.next());
        }
    }
}
