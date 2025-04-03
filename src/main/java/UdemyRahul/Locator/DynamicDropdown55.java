package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicDropdown55 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();

        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        Thread.sleep(2000);
       // driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
        //or
        ////div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']  give space between parent and child
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
////*[@id="ctl00_mainContent_ddl_destinationStation1"]/option[4]

    }
}
