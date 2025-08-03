package UdemyRahul.Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteCookies_107 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteCookieNamed("sessionKey");//if we excute this line code the session of the login will get logged out and reaches home page
        driver.get("http://google.com");
    }
}
