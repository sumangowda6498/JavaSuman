package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.lang.annotation.Documented;
import java.util.List;

import static jdk.internal.agent.Agent.getText;

public class ScrollTable_Windowlevel_JavascriptExecutor_101 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

//        JavascriptExecutor js=(JavascriptExecutor)driver;
//Thread.sleep(10000);
//        js.executeScript("windows.scrollBy(0,500)");
//        Thread.sleep(3000);
//        js.executeScript("document.quesrySelector('.tableFixHead').scrollTop=5000");

        List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
int sum=0;
        for (int i=0;i<values.size();i++){
            sum=sum+Integer.parseInt(values.get(i).getText());
        }
        System.out.println(sum);

        driver.findElement(By.cssSelector(".totalAmount")).getText();
        int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());

        Assert.assertEquals(sum,total);
        System.out.println();

    }
}
