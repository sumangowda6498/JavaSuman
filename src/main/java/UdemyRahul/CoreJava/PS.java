package UdemyRahul.CoreJava;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
//145 Inheritences
public class PS {
  public  void doThis(){
      System.out.println("Parent class PS");
  }

  @BeforeMethod
    public void beforeTest(){
      System.out.println("Before test from PS parent class");
  }

  @AfterMethod
  public void afterTest(){
      System.out.println("After test from PS parent class");
  }
}
