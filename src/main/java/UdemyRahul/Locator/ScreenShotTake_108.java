package UdemyRahul.Locator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ScreenShotTake_108 {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteCookieNamed("sessionKey");//if we excute this line code the session of the login will get logged out and reaches home page
        driver.get("http://google.com");

//Take Screenshot
        Date currentdate =new Date();
        System.out.println(currentdate);
        String screeshotfile=currentdate.toString().replace(" ","-").replace(":","-");

        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File(".//screenshot/"+screeshotfile+".png"));

        //FileUtils.copyFile(src,new File("E:\\suman\\Screens\\\"+screeshotfile+\".png"));
    }
}
