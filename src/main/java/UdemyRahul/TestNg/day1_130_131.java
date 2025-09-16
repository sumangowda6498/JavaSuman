package UdemyRahul.TestNg;

import org.testng.annotations.*;

public class day1_130_131{
    @Test
    public  void demo1(){
        System.out.println("day1");
    }

    @Test
    public void demo2(){
        System.out.println("day2");
    }

    @BeforeSuite
    public void beforesuitemethod(){
        System.out.println("before suit");
    }
    @AfterSuite
    public void aftersuitemethod(){
        System.out.println("after suit method");
    }
    @BeforeMethod
    public void brforemethod(){
        System.out.println("before each method of day_130_131");
    }

    @AfterMethod
    public void aftermethod(){
        System.out.println("after each method of day_130_131");
    }
}
