package Task;

import java.util.HashSet;

public class UniqueElementsChecker {
    public static boolean hasMoreThanOneUnique(int[] array) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        for (int num : array) {
            uniqueElements.add(num);
            if (uniqueElements.size() > 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2};
        boolean result = hasMoreThanOneUnique(array);
        System.out.println("More than one unique element: " + result);
    }
}

