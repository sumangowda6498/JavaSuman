package UdemyRahul.TestNg;

import org.testng.annotations.*;

public class day4_parameter {
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

    @Parameters({"URL","API_key"})
    @Test
    public void parameter140(String url, String api){
    System.out.println(url);
    System.out.println(api);
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
        System.out.println("mobile login timeout"
        );
    }
}
