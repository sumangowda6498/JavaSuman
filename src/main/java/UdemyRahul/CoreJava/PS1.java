package UdemyRahul.CoreJava;

import org.testng.annotations.Test;

public class PS1 extends PS{

   // PS2 ps2=new PS2(3);//creating obj 146 //creating constructor
    @Test
    public void testRun(){
        PS2 ps2=new PS2(3);//creating obj 146 //creating constructor
        int a=3;
        doThis();//parent class method
       a= ps2.increment();
        System.out.println(a);
        System.out.println(ps2.decrement());

       // PS3 ps3=new PS3(3);
        System.out.println(ps2.multiplyThree());
    }

}
