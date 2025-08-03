package UdemyRahul.Locator;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.HashMap;
import java.util.Map;

public class SSLCheck_106 {
    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();

        Proxy proxy = new Proxy();

        proxy.setHttpProxy("ipaddress:4444");

        options.setCapability("proxy", proxy);

        Map<String, Object> prefs = new HashMap<String, Object>();



        prefs.put("download.default_directory", "/directory/path");



        options.setExperimentalOption("prefs", prefs);

// FirefoxOptions options1 = new FirefoxOptions();

// options1.setAcceptInsecureCerts(true);

// EdgeOptions options2 = new EdgeOptions();

        options.setAcceptInsecureCerts(true);

        System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");



        WebDriver driver = new EdgeDriver(options);

        driver.get("https://expired.badssl.com/");

        System.out.println(driver.getTitle());



    }



}

