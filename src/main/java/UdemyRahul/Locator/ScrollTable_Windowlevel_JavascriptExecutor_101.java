package UdemyRahul.Locator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.lang.annotation.Documented;

public class ScrollTable_Windowlevel_JavascriptExecutor_101 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js=(JavascriptExecutor)driver;
Thread.sleep(10000);
        js.executeScript("windows.scrollBy(0,500)");
        Thread.sleep(3000);
        js.executeScript("document.quesrySelector('.tableFixHead').scrollTop=5000");
    }
}
