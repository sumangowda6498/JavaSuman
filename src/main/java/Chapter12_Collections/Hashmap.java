package Chapter12_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        //Hash map contains data as Key Value pair.
        //contains only unique keys
        //Not synchronised and No order
        //Java hashmap may have one null key and multiple null value

        HashMap<String,String> hm1=new HashMap<>();
        hm1.put("qa","http://qa.com");
        hm1.put("uat","http://develop.com");
        hm1.put("gdbjsd","https://google");
        System.out.println(hm1);

//Set s=hm1.keySet();

        //for eachloop
        for(String key: hm1.keySet()){
            System.out.println("Key is "+key+" value is "+hm1.get(key));
        }
        System.out.println("------------------------------------------------------------");
        Set s=hm1.keySet();
        Iterator<String> itr=s.iterator();
        while(itr.hasNext()){
            String key=itr.next();
            System.out.println("Key is: "+key+" value;"+hm1.get(key));
        }

    }
}
