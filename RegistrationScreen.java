import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class RegistrationScreen {
    private static  WebDriver driver;


//Extra - Assert entry error and closing window
    public static void assertErrors(WebDriver driver){
    driver.findElement(Constants.entry).click();
    driver.findElement(Constants.entryButton).click();
    String error = driver.findElement(Constants.getError).getText();
        Assert.assertEquals(Constants.entryError,error);
driver.findElement(Constants.closeButton).click();
    }


    //wait until element is clickable and clicking on sign in button1

    public static void signInButton1(WebDriver driver) {
            WebDriverWait startTime = new WebDriverWait(driver, 5);

            startTime.until(ExpectedConditions.elementToBeClickable(Constants.signIn));

            driver.findElement(Constants.signIn).click();
        }

        //clicking on  sign in button2

    public static void signInButton2(WebDriver driver) {
        driver.findElement(Constants.signOn).click();
    }
    //creating a list of all fields in the registration screen+ entering user Name
        public  static void signInFn(WebDriver driver) {
             List<WebElement> fillInfo = driver.findElements(Constants.subscribe);
            fillInfo.get(0).sendKeys(Constants.name);
        }
    // entering user Email
    public  static void signInEmail(WebDriver driver) {
        List<WebElement> fillInfo = driver.findElements(Constants.subscribe);
        fillInfo.get(1).sendKeys(Constants.email);

    }
    // entering user password

    public  static void signInPass(WebDriver driver) {
        List<WebElement> fillInfo = driver.findElements(Constants.subscribe);
        fillInfo.get(2).sendKeys(Constants.pass);
    }
    // entering user validate password

    public  static void signInValPass(WebDriver driver) {
        List<WebElement> fillInfo = driver.findElements(Constants.subscribe);
        fillInfo.get(3).sendKeys(Constants.valPass);
    }

    //pressing radio button
    public  static void pressRadioB(WebDriver driver) {
        new Actions(driver).moveToElement(driver.findElement(Constants.radioB)).click().perform();

    }

    //pressing submit in order to subscribe to the website
    public  static void submitReg(WebDriver driver) {

        driver.findElement(Constants.submit).click();
    }
}




