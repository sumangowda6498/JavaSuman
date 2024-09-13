package Chapter12_Collections;

import java.util.HashMap;
import java.util.Map;

public class Map5Hashmap {
    public static void main(String[] args) {
        Map fruiteCalory=new HashMap();
        fruiteCalory.put("apple",23);
        fruiteCalory.put("orenge", 57);
        fruiteCalory.put("chikku",56);
        fruiteCalory.put("banana",78);
        fruiteCalory.put("orenge",99);
        System.out.println("Size: "+fruiteCalory.size()+" the MAP: "+fruiteCalory);

        System.out.println("banana calory "+fruiteCalory.get("apple"));
        System.out.println("lemon calory "+fruiteCalory.get("lemon"));


        System.out.println(fruiteCalory.entrySet());

        fruiteCalory.remove("orenge");
        System.out.println(fruiteCalory);
        System.out.println(fruiteCalory.containsKey("banana"));

        System.out.println("is Empty "+fruiteCalory.isEmpty());


    }
}
