package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class CalednderUI63 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //                        ctl00_mainContent_ddl_originStation1
        driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[1]/select")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@value='BLR']")).click();

        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).click();
        driver.findElement(By.xpath("//a[@value='MAA']")).click();

        driver.findElement(By.cssSelector("ui-state-default.ui-state-highlight.ui-state-active")).click();
        }

    }

