package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locator3 {
    public static void main(String[] args) {

// TODO Auto-generated method stub



        System.setProperty("webdriver.chrome.driver", "resources/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

// Sibling - Child to parent traverse

//header/div/button[1]/following-sibling::button[1]

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());



        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());









    }



}
