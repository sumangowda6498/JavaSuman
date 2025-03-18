package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class AutoSuggestive58 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
        driver.manage().window().maximize();
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(3000);

        List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for (WebElement option: options){
            if (option.getText().equalsIgnoreCase("India")){
                option.click();
                break;
            }
        }

    }
}
