package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Limitting_webDriverScope {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();

        driver.get("https://qaclickacademy.com/");
        WebElement footerDriver= driver.findElement(By.className("footer-top pt-40 pb-70"));
        WebElement buttonn= driver.findElement(By.className("main-btn mt-55"));
        Thread.sleep(3000);
        Actions action=new Actions(driver);
        action.moveToElement(buttonn).build().perform();

        System.out.println(footerDriver.findElements(By.tagName("a")).size());

    }
}
