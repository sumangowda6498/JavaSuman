package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class WebTable_Sorting_116 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();

        //click on coloumn
        driver.findElement(By.xpath("//tr/th[1]")).click();

        //capture all webelement into List
        List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));

        //capture the text of all webelements into new(original) list
        List<String> elementName = elementList.stream().map(s -> s.getText()).collect(Collectors.toList());

        //sort on elementName list
        List<String> sortedlist = elementName.stream().sorted().collect(Collectors.toList());

        Assert.assertTrue(sortedlist.equals(elementName));

        //Scan the name coloumn with    getText->Beans-> Print the priceof the Beans
        List<String> price;
        do {

            List<WebElement> elementList1 = driver.findElements(By.xpath("//tr/td[1]"));// if not written here program throws an stale element exception.
            price = elementList1.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s)).collect(Collectors.toList());

            price.forEach(a -> System.out.println(a));
            if (price.size() < 1) {
                //driver.findElement(By.cssSelector("[arial-label='Next']")).click();
                driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/div/div[2]/ul/li[7]/a")).click();
            }
        } while (price.size() < 1);
    }
    private static String getPriceVeggie(WebElement s) {
       String priceValue= s.findElement(By.xpath("following-sibling::td[1]")).getText(); //  //tr/td[1]/following-sibling::td[1] so s=//tr/td[1]
        return  priceValue;
    }
}
