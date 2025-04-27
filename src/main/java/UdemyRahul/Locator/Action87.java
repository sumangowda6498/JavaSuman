package UdemyRahul.Locator;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action87 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.amazon.com/");
        Actions action= new Actions(driver);
        // action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
        WebElement accountList=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("infosys").doubleClick().build().perform();
action.moveToElement(accountList).contextClick().build().perform();
    }
}
