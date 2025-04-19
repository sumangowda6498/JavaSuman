package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdditemtoCart_71 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        String[] itemsNeeded={"Cucumber","Carrot"};

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

       List<WebElement> product= driver.findElements(By.cssSelector("h4.product-name"));// By cssselector ("tagname.classname")
       int j=0;
        for (int i=0;i<product.size();i++){
           String[] name=product.get(i).getText().split("-");
          String formattedString= name[0].trim();// trim will Returns a string whose value is this string, with all leading and trailing space removed,

           //Convert array into arraylist for easy search, arraylst consumes more memory than array so use convert only when required
           List itemsNeededList= Arrays.asList(itemsNeeded);

           //check name you extracted is present or not

           if (itemsNeededList.contains(formattedString)){
               //click on AddKart
               j++;
               driver.findElements(By.xpath("//div[text()='ADD TO CART']")).get(i).click();
                if(j==itemsNeeded.length){
                    break;
                }
           }
       }

    }
}
