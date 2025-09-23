package UdemyRahul.TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3_132_prioritizingTest {
    @Test(priority = 1)
    public void firstmetod(){
        System.out.println("----------------------------------------");
    }

    @Test
    public  void webLoginCarLoan(){
        System.out.println("WebLoginCar");
    }

    @Test
    public void mobileLoginCarLoan(){
        System.out.println("mobileLogin");
    }

    @Test(groups = {"Smoke"})
    public void mobileapiLoginCarLoan(){
        System.out.println("apiloginCar");
    }

    @Test(dataProvider = "getData")
    public void getdatamethod(String username, String password){
        System.out.println("Mobile SIGNOUT");
        System.out.println(username);
        System.out.println(password);
    }

    //140 Data Provider
    @DataProvider
    public Object[][] getData(){
        //1st set combination user name and password= good credit history
        //2nd set username password of No credit history
        //3rd set fraudelent credit history

        Object[][] data=new Object[3][2];

        //first set
        data[0][0]="firstusername";
        data[0][1]="firstpassword";

        //second set
        data[1][0]="secondusername";
        data[1][1]="secondpassword";

        //third set
        data[2][0]="thirdusername";
        data[2][1]="thirdpassword";

        return data;
    }
}
