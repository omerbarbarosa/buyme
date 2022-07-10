import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;

public class ChooseGift {
    public static WebDriver driver;

//Extra- Scrolling to the bottom of the page, screenshot is added on the main class

    public static void scrollBottom(WebDriver driver) throws IOException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(Constants.scrollGift);

    }

    //wait until element is visible
    //creating a list of all products and choosing the second one - "אופוטיקנה"

    public static void giftChoice(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Constants.chooseProd));
        //creating a list of all products and choosing the second one - "אופוטיקנה"
        List<WebElement> prodList = driver.findElements(Constants.prodClass);
        prodList.get(1).click();

    }

    public static void assertUrl(WebDriver driver) {

        //Assert the url
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(Constants.urlGift, currentUrl);
    }

//wait until element is visible
    //entering an amount

    public static void sendAmount(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Constants.elementVisible));
        driver.findElement(Constants.amountButton).sendKeys(Constants.amount);

    }

    // Submitting the data, also continues to next screen-  sender and recipient info
    public static void submitProduct(WebDriver driver) {

        driver.findElement(Constants.submitProd).click();

    }
}
