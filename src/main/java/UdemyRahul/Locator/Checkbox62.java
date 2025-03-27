package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Checkbox62 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
        Assert.assertTrue( driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());

        driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
        Assert.assertFalse( driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());



//        Assert.assertFalse( driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
//        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        //count the number of checkboxed

        System.out.println( driver.findElements(By.cssSelector("input[type='checkbox']")).size());
    }
}
