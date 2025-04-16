package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Editbox_Error_64_Assignment {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();

        driver.findElement(By.name("name")).sendKeys("Kumar");
        driver.findElement(By.name("email")).sendKeys("KumarWin123@gamil.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("KumarWin45678");
        driver.findElement(By.id("exampleCheck1")).click();
        WebElement dropdown=driver.findElement(By.id("exampleFormControlSelect1"));
        Select option=new Select(dropdown);
        option.selectByVisibleText("Male");

        driver.findElement(By.id("inlineRadio2")).click();

        driver.findElement(By.name("bday")).sendKeys("16042024");
        driver.findElement(By.cssSelector(".btn-success")).click();

        System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());


    }

}
