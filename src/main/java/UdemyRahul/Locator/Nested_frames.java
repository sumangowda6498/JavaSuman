package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Nested_frames {
    public static void main(String[] args) {
        System.setProperty("webDriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame(driver.findElement(By.name("frame-top")));
        driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
        System.out.println(driver.findElement(By.id("content")).getText());

    }
}
