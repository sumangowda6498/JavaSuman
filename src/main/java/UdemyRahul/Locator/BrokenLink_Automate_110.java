package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class BrokenLink_Automate_110 {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();

        //broken Url
        //Step 1 -to get all Urls tied up to the links using Selenium
        //Java methods will call URL's and gets you the status code
        //if status code >400 then that url is not working -> link which tied to url is broken
        //a[href*="soapui"]

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");//this is not broken

        HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("HEAD");
        conn.connect();
        int respCode=conn.getResponseCode();
        System.out.println(respCode);

        String url2=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");//this is not broken

        HttpURLConnection conn2=(HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("HEAD");
        conn.connect();
        int respCode2=conn.getResponseCode();
        System.out.println(respCode2);
    }
}
