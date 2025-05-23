package UdemyRahul.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Waits_80 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//impilcite wait
        //Explicite wait
        // wait=new WebDriverWait(driver,5);
        driver.manage().window().maximize();
        String[] itemsNeeded={"Cucumber","Carrot"};

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(3000);
        addItems(driver,itemsNeeded);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));//Explicite wait

        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promobtn")).click();

       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));//Explicite wait

        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
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