package UdemyRahul.TestNg;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2_131 {

    @AfterTest
    public void demoAfter() {
        System.out.println("I will execute last After test");

    }
    @Test(groups = {"Smoke"})
    public  void demo(){
        System.out.println("day3");
    }

    @BeforeTest
    public void demo2(){
        System.out.println("I will execute first");
    }
}
