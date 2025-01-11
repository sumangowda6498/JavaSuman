package Chapter12_Collections;

import java.util.HashSet;
import java.util.Set;

public class Sets1 {
    public static void main(String[] args) {
        System.out.println(" It is an unordered collection of objects in which duplicate values cannot be stored\n No Specific Order: Does not maintain any specific order of elements (Exceptions: LinkedHashSet and TreeSet).\nAllows One Null Element: Most Set implementations allow a single null element.\n ");
        Set<String> fruiteSet=new HashSet();
        fruiteSet.add("Apple");
        fruiteSet.add("Banana");
        fruiteSet.add("Orenge");
        fruiteSet.add("Pomogrnut");
        fruiteSet.add("Pineapple");
        fruiteSet.add("chikku");

        System.out.println("Fruite Set size: "+fruiteSet.size());
        System.out.println(fruiteSet);

        // Attempting to add a duplicate element
        boolean isAdded = fruiteSet.add("Apple"); // returns false
        System.out.println("is Apple added again "+ isAdded);

        fruiteSet.add("");
        System.out.println("Afete adding null element "+fruiteSet);

    }
}
