package Collection_Map;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(0,"Car");
        hm.put(1,"Bus");
        hm.put(2,"Flight");
        hm.put(4,"Ship");
        hm.put(5,"Rocket");
        hm.put(6,"NoObject");
        System.out.println(hm.get(3));  //null
        System.out.println(hm);
        hm.remove(6);
        System.out.println(hm.get(6));//null

        Set st=hm.entrySet();
        Iterator it= st.iterator();

        while(it.hasNext()){
            Map.Entry mp= (Map.Entry)it.next();
            System.out.print(mp.getKey()+" ");
            System.out.println(mp.getValue());
        }

    }
}
