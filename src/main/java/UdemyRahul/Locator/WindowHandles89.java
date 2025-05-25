package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles89 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.linkText("Click Here")).click();
        Set<String> windows=driver.getWindowHandles();
        Iterator<String>it= windows.iterator();
        String parentID= it.next();
        String childId=it.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.className("example")).getText());
        String ex=driver.findElement(By.className("example")).getText().split(" ")[1];
        System.out.println(ex);
        driver.switchTo().window(parentID);
        String parenttext=driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
        System.out.println(parenttext);

    }
}
