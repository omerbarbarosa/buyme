import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SendInfo {
    public static WebDriver driver;

    //Extra -asserting the color of an element
    public static void assertColor(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Constants.cOfTheWind));
        String colorRGB = driver.findElement(Constants.cOfTheWind).getCssValue(Constants.propertyC);
        Assert.assertEquals(Constants.assertColor,colorRGB);

}
//Extra - asserting the data of the window (sender and recipient names+blessing)
    public static void assertWindowData(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Constants.windowInfo));
List<WebElement> windowData = driver.findElements(Constants.windowInfo);
String windowRecName = windowData.get(0).getText();
String windowSenName = windowData.get(1).getText();
Assert.assertEquals(windowRecName,Constants.recipientName);
Assert.assertEquals(windowSenName,Constants.senderName);
String bliss = driver.findElement(Constants.greetingTrim).getText();
Assert.assertEquals(bliss,Constants.blessingMessage);
    }

        //wait until element is visible and click on element (radio button)

    public static void radioButtonPress1(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);

        wait.until(ExpectedConditions.visibilityOfElementLocated(( Constants.elementVisible1 )));
        driver.findElement(Constants.elementVisible1).click();

    }

    //enter the name of the sender
    public static void senderInfo(WebDriver driver) {
        List<WebElement> sendingInfo = driver.findElements(Constants.infoList);
        sendingInfo.get(0).sendKeys(Constants.recipientName);
    }

    //enter the name of the recipient
    public static void recipientInfo(WebDriver driver){
            List<WebElement> sendingInfo = driver.findElements(Constants.infoList);
            sendingInfo.get(1).clear();
            sendingInfo.get(1).sendKeys(Constants.senderName);

        }

    //uploading a picture and waiting until its finished
    public static void uploadPic(WebDriver driver) {
           WebDriverWait wait = new WebDriverWait(driver, 5);
           driver.findElement(Constants.uploadPic).sendKeys(Constants.picPath);
           wait.until(ExpectedConditions.visibilityOfElementLocated(Constants.uploadElement));
    }

    //choosing an event for the gift card sending
    public static void eventChoice(WebDriver driver) {
          WebDriverWait wait = new WebDriverWait(driver, 5);
          List<WebElement> eventChoice = driver.findElements(Constants.enterEvent);
          eventChoice.get(6).click();
          wait.until(ExpectedConditions.elementToBeClickable(eventChoice.get(6)));
          driver.findElement(Constants.chooseEvent).click();
    }
    //clearing the screen of previous blessing and entering a new blessing
    public static void blessYou(WebDriver driver) {

        driver.findElement(Constants.blessingPath).clear();
        driver.findElement(Constants.blessingPath).sendKeys(Constants.blessingMessage);
    }
    //wait until element is clickable and click on element
    public static void radioButtonPress2(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(Constants.radioButton2));
        driver.findElement(Constants.radioButton2).click();

    }

    //choosing the way to send the gift card(sms) and entering the sender and recipient phones
        public static void smsChoice(WebDriver driver) {

            driver.findElement(Constants.sms).click();

        }

    // entering the sender phone number recipient phones
    public static void senderPhone(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Constants.sender));
        List<WebElement> phoneInfo = driver.findElements(Constants.sender);
        phoneInfo.get(0).sendKeys(Constants.senderPhones);
    }
    // entering the recipient phone
        public static void recipientPhone(WebDriver driver){

            List<WebElement> phoneInfo = driver.findElements(Constants.sender);
            phoneInfo.get(1).sendKeys(Constants.recipientPhones);
        }
    //saving the order data
       public static void saveData(WebDriver driver){

           driver.findElement(Constants.save).click();

    }
}
