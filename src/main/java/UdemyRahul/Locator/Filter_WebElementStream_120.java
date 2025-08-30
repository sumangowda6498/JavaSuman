package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class Filter_WebElementStream_120 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();
            driver.findElement(By.id("search-field")).sendKeys("Rice");
        List<WebElement> veggeis=driver.findElements(By.xpath("//tr/td[1]"));

        //5 results
       List<WebElement> filteredList= veggeis.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList());

      Assert.assertEquals(veggeis.size(),filteredList.size());

    }
}
