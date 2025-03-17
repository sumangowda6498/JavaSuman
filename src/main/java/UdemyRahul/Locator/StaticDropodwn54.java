package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropodwn54 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
        driver.manage().window().maximize();

        WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select dropdown=new Select(staticDropdown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("INR");
Thread.sleep(2000);
        driver.findElement(By.id("divpaxinfo")).click();
        System.out.println(        driver.findElement(By.id("divpaxinfo")).getText());
        Thread.sleep(2000);
        int click=1;
        while (click<5){
            driver.findElement(By.id("hrefIncAdt")).click();
            click++;
        }
        Thread.sleep(2000);

        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(        driver.findElement(By.id("divpaxinfo")).getText());

        driver.close();
    }
}
