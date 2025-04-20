package Chapter12_Collections;

import java.util.ArrayList;
import java.util.List;

public class

ListArrayList3 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

// Adding elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

// Accessing elements from the list
        String firstFruit = fruits.get(0); // Apple
        String secondFruit = fruits.get(1); // Banana

        System.out.println("Frisrt fruit "+firstFruit+" Second "+secondFruit);

// Iterating over list elements

        fruits.add(3, "Bacchangayee");
        System.out.println("3 "+fruits.get(3));
        System.out.println("index"+fruits.indexOf("Banana"));
    }
}
