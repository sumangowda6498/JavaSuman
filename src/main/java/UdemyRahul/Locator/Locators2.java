package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {

        String name="rahul";
        System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        Thread.sleep(1000);

        driver.findElement(By.tagName("p")).getText();
        //Assert.assertEquals( driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        //Assert.assertEquals(driver.findElement(By.cssSelector("div[class=\"login-container\"] h2")).getText(),"Hello rahul");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
