package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class SpiceJet_EndToEnd_66 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(2000);
        // driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
        //or
        ////div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']  give space between parent and child
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
////*[@id="ctl00_mainContent_ddl_destinationStation1"]/option[4]


        if(driver .findElement(By.id("Div1")).getDomAttribute("style").contains("0.5")){
            System.out.println("Its Disabled");
            Assert.assertTrue(true);
        }
        else{
            Assert.assertTrue(false);
        }
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).click();
        driver.findElement(By.id("hrefIncAdt")).click();
int click=1;
        while (click<5){
            driver.findElement(By.id("hrefIncAdt")).click();
            click++;
        }
        Thread.sleep(2000);

        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(        driver.findElement(By.id("divpaxinfo")).getText());
    }
}
