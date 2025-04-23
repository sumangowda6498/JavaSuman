package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Arrays;
import java.util.List;

public class Waits_80 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        String[] itemsNeeded={"Cucumber","Carrot"};

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(3000);
        addItems(driver,itemsNeeded);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
    }

    private static void addItems(WebDriver driver, String[] itemsNeeded) {
        {

            int j = 0;

            List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));


            for (int i = 0; i < products.size(); i++) {


//Brocolli - 1 Kg

//Brocolli,    1 kg

                String[] name = products.get(i).getText().split("-");

                String formattedName = name[0].trim();


//format it to get actual vegetable name

//convert array into array list for easy search

//  check whether name you extracted is present in arrayList or not-


                List itemsNeededList = Arrays.asList(itemsNeeded);


                if (itemsNeededList.contains(formattedName)) {


                    j++;

//click on Add to cart

                    driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();


                    if (j == itemsNeeded.length) {

                        break;

                    }


                }

            }

        }


    }}