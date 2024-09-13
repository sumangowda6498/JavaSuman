package Chapter12b_LoopingCollection;

import java.util.*;

public class LoopCollection1 {
    public static void setDemo(){
        Set<String> fruit=new HashSet<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Orenge");
        fruit.add("Pomogrnut");
        fruit.add("Pineapple");
        fruit.add("chikku");

        System.out.println("Size og the Set: "+fruit.size());
        System.out.println("Set is :"+fruit);


        System.out.println("\nPrint Using while");
        var i=fruit.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


        System.out.println("\nPrint Using for loop");
        for (String item:fruit) {
            System.out.println(item);
        }
            System.out.println("\nForEACH");
        fruit.forEach(x-> System.out.println(x));

        fruit.forEach( System.out::println);
    }

    public static void list(){
        List<String> fruits = new ArrayList<>();

// Adding elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Size og the Set: "+fruits.size());
        System.out.println("Set is :"+fruits);

        System.out.println("\nPrint Using while");
         var i=fruits.iterator();
         while (i.hasNext()){
             System.out.println(i.next());
         }


        System.out.println("\nPrint Using for loop");
        for (String item:fruits) {
            System.out.println(item);
        }




    }


    public static void Mapdemo(){
        Map<String, Integer> fruiteCalory=new HashMap();
        fruiteCalory.put("apple",23);
        fruiteCalory.put("orenge", 57);
        fruiteCalory.put("chikku",56);
        fruiteCalory.put("banana",78);
        fruiteCalory.put("orenge",99);

        for(var entry:fruiteCalory.entrySet()){
            System.out.println(entry.getValue());
        }

        fruiteCalory.forEach((k,v)-> System.out.println(k+":"+v));
    }

    public static void main(String[] args) {
        //setDemo();
        //list();
        Mapdemo();
    }
}
