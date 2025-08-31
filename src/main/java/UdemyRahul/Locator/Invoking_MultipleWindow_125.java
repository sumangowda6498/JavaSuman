package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class Invoking_MultipleWindow_125 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");

        WebDriver driver=new EdgeDriver();

        driver.get("http://www.rahulshettyacademy.com/angularpractice/");
        //driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().newWindow(WindowType.WINDOW);


        Set<String> handles=driver.getWindowHandles();
        Iterator<String> it= handles.iterator();
        String parentWindow=it.next();
        String childWindow=it.next();
        driver.switchTo().window(childWindow);
        driver.get("http://www.rahulshettyacademy.com");
       // String coureseName=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/cypress-modern-automation-testing-from-scratch-framework'])")).get(1).getText();
       String coureseName= driver.findElement(By.xpath("//*[@id=\"courses-block\"]/div[2]/div/div[2]/div[1]/h2/a")).getText();
        driver.switchTo().window(parentWindow);
        driver.findElement(By.cssSelector("[name='name']")).sendKeys(coureseName);
    }
}
