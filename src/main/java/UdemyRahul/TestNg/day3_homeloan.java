package UdemyRahul.TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day3_homeloan {
    @Test(dependsOnMethods ={"mobileLoginCHomeLoan","apiLoginHomeLoan"})
    public  void webLoginHomeLoan(){
        System.out.println("HomeWebLogin");
    }

    @Test
    public void mobileLoginCHomeLoan(){
        System.out.println("HomemobileLogin");
    }

    @Test(dependsOnMethods ={"mobileLoginCHomeLoan"})
    public void apiLoginHomeLoan(){
        System.out.println("Homeapilogin");
    }
    @Test(enabled = false)
    public void mobileLogin(){
        System.out.println("mobile login");
    }
    @AfterSuite
    public void aftersuitemethod(){
        System.out.println("After suite method 2");
    }
    @BeforeClass
    public void brforeClass(){
        System.out.println(" Beforeclass day3 homeloan");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println(" Afterclass day3 homeloan");

    }
    @Test(timeOut = 5000)
    public void mobileLogintimeout() {
        System.out.println("mobile login timeout");
    }
}
