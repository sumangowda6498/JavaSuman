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
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();

       //click on coloumn
        driver.findElement(By.xpath("//tr/th[1]")).click();

      //capture all webelement into List
        List<WebElement> elementList= driver.findElements(By.xpath("//tr/td[1]"));

        //capture the text of all webelements into new(original) list
       List<String> elementName= elementList.stream().map(s->s.getText()).collect(Collectors.toList());

       //sort on elementName list
        List<String> sortedlist=elementName.stream().sorted().collect(Collectors.toList());

        Assert.assertTrue(sortedlist.equals(elementName));

        //Scan the name coloumn with    getText->Beans-> Print the priceof the Beans
       List<String> price= elementList.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVeggie(s)).collect(Collectors.toList());

        price.forEach(a->System.out.println(a));
    }

    private static String getPriceVeggie(WebElement s) {
       String priceValue= s.findElement(By.xpath("following-sibling::td[1]")).getText(); //  //tr/td[1]/following-sibling::td[1] so s=//tr/td[1]
        return  priceValue;
    }
}
