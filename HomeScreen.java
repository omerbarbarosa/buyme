import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class HomeScreen {
    //
    public static WebDriver driver;

    //wait until registration is finished +
    //creating a list for all dropdown elements
    // and creating a list for product price range  area and clicking on the chosen option


    public static void productPrice(WebDriver driver) throws InterruptedException {

        Thread.sleep(2000);
         List<WebElement> screenProd = driver.findElements(Constants.dropClass);
        screenProd.get(0).click();

        List<WebElement> priceList = driver.findElements(Constants.dropList);
        WebElement price = priceList.get(1);
        price.click();
    }
    //creating a list for product category  area and clicking on the chosen option

    public static void productArea(WebDriver driver) {
        List<WebElement> screenProd = driver.findElements(Constants.dropClass);
        screenProd.get(1).click();
        //creating a list for area  choice
        List<WebElement> areaList = driver.findElements(Constants.dropList);
        WebElement area = areaList.get(1);
        area.click();
    }



    //creating a list for product category  choice and clicking on the chosen option

    public static void productCategory(WebDriver driver)  {
        List<WebElement> screenProd = driver.findElements(Constants.dropClass);
        screenProd.get(2).click();
        List<WebElement> categoryList = driver.findElements(Constants.dropList);
        WebElement category = categoryList.get(1);
        category.click();

    }
    //submit the choices and begin the search, also continues to next product choice screen

    public static void productSearch(WebDriver driver) {

        driver.findElement(Constants.submitScreening).click();

    }
}



