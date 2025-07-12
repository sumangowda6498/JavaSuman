package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Count_row_coloum_103Assignment {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.drover","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement table=driver.findElement(By.id("product"));

        System.out.println(table.findElements(By.tagName("tr")).size());

        System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

        List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

        System.out.println(secondrow.get(0).getText());

        System.out.println(secondrow.get(1).getText());

        System.out.println(secondrow.get(2).getText());
    }
}
