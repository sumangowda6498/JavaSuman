package UdemyRahul.Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SSLCertCheck {
    public static void main(String[] args) {
        //Handling SSL Certifications in automated browser
        EdgeOptions options=new EdgeOptions();
        options.setAcceptInsecureCerts(true);
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");

        WebDriver driver=new EdgeDriver(options);
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());

        //coomment above code run below code to see changes

//        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
//
//        WebDriver driver=new EdgeDriver();
//        driver.get("https://expired.badssl.com/");
//        System.out.println(driver.getTitle());
    }
}
