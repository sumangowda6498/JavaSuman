package UdemyRahul.TestNg;

import com.beust.jcommander.Parameter;
import org.testng.annotations.*;



public class day1_130_131{
    @Parameters({"URL"})
    @Test
    public  void demo1(String urlname){
        System.out.println("day1");
        System.out.println(urlname);

    }

    @Test(groups = {"Smoke"})
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
