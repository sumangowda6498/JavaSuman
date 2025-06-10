package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest93 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
       WebElement source= driver.findElement(By.id("draggable"));
       WebElement target= driver.findElement(By.id("droppable"));
        Actions a=new Actions(driver);
        a.dragAndDrop(source,target).build().perform();
    }
}
