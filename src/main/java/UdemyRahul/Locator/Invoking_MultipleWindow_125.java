package UdemyRahul.Locator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class Invoking_MultipleWindow_125 {
    public static void main(String[] args) throws IOException {
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
        WebElement name=driver.findElement(By.cssSelector("[name='name']"));
        //driver.findElement(By.cssSelector("[name='name']")).sendKeys(coureseName);
        name.sendKeys(coureseName);

        //Take the screenshot of perticular elelment
        File file=name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("logo.png"));


        //get height and width of webElement
        System.out.println("Height: "+name.getRect().getDimension().getHeight());
        System.out.println("Width: "+name.getRect().getDimension().getWidth());

    }
}
