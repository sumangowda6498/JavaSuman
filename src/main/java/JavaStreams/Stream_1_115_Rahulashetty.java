package JavaStreams;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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

//@Test
   public void streamFilter()
   {
       ArrayList<String> names=new ArrayList<String>();
       names.add("Adithya");
       names.add("Suman");
       names.add("Infy");
       names.add("Akhil");
       names.add("Arjun");

       //there is no life for intermediate operation if there is terminal operation
       //terminal operation will execute only if inter opertion (filter ) returns true
       //we can craete stream
       //how to use filter in Stream API

      long c= names.stream().filter(s -> s.startsWith("A")).count();
       System.out.println("Count: "+c);

//      long j= Stream.of("Abhijit","Suman","Sandesh","Arjun").filter(s->s.startsWith("A")).count();
//       System.out.println("count j: "+j); or below line
     long d= Stream.of("Abhijit","Suman","Sandesh","Arjun").filter(s->
       {
           s.startsWith("A");
           return true;// if return false no count will be given
       }).count();
       System.out.println("Count d: "+d);


       //print all the names of ArrayList which length is grater than 4
       names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
       names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));

   }

@Test
   public void streamMap(){
        //print the names which has the last letter as "n" with uppercase
        Stream.of("Abhijit","Suman","Sandesh","Arjun").filter(s->s.endsWith("n")).map(s->s.toUpperCase()).forEach(s-> System.out.println(s));

        //print the names which have first letter as "a" with upper case
        List<String> names= Arrays.asList("Azbhijit","Suman","Sandesh","Arjun");
        names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s-> System.out.println(s));

  //concat Array method
    ArrayList<String> names1=new ArrayList<String>();
    names1.add("man");
    names1.add("men");
    names1.add("Woman");

    //merging two differnt lists
    Stream<String> newStream=Stream.concat(names1.stream(), names.stream());
    //newStream.sorted().forEach(s->System.out.println(s));
    boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Ad77am"));
    System.out.println(flag);
    Assert.assertTrue(flag);
    }
}
