package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenlinkSeparatetab_97 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());

        WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
        System.out.println(driver.findElements(By.tagName("a")).size());

        WebElement coloumndriver=footerdriver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
        System.out.println(coloumndriver.findElements(By.tagName("a")).size());

        for (int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++){
            String clickonlinkotab= Keys.chord(Keys.CONTROL,Keys.ENTER);

            coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkotab);
            Thread.sleep(5000);
            System.out.println("suman");
        }
    }
}
