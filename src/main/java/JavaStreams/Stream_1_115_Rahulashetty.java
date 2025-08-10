package JavaStreams;

import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Stream_1_115_Rahulashetty {
  // @Test
    public void regular(){
       ArrayList<String> names=new ArrayList<String>();
       names.add("Adithya");
       names.add("Suman");
       names.add("Infy");
       names.add("Akhil");
       names.add("Arjun");

       int count=0;
       for (int i=0;i<names.size();i++){
           String actulName=names.get(i);
           if (actulName.startsWith("A")){
               count++;
           }
       }
       System.out.println("Count= "+count);


   }

@Test
   public void streamFilter()
   {
       ArrayList<String> names=new ArrayList<String>();
       names.add("Adithya");
       names.add("Suman");
       names.add("Infy");
       names.add("Akhil");
       names.add("Arjun");

      long c= names.stream().filter(s -> s.startsWith("A")).count();
       System.out.println("Count: "+c);
   }
}
