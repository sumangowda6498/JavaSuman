package UdemyRahul.Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowActivities {
    public static void main(String[] args) {

// TODO Auto-generated method stub


        System.setProperty("webdriver.chrome.driver", "resources/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("http://google.com");

        driver.navigate().to("https://rahulshettyacademy.com");

        driver.navigate().back();

        driver.navigate().forward();


    }
    }
