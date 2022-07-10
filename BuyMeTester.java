import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//Determining testing order and adding Report and recording data

@FixMethodOrder (MethodSorters.NAME_ASCENDING)
public class BuyMeTester {
private static ExtentReports extent = new ExtentReports();
private static ExtentTest test = extent.createTest(Constants.testName,Constants.testDescription);
static DateFormat df = new SimpleDateFormat(Constants.date);
static Date dateobj= new Date();
static String videoFolder =Constants.testVideoPath;
static ATUTestRecorder recorder;
static String videoFile = Constants.videoName+ df.format(dateobj);
private static WebDriver driver;
    String currentTime = String.valueOf(System.currentTimeMillis());

    @BeforeClass
public static void initialize() throws IOException, SAXException, ParserConfigurationException, ATUTestRecorderException {
//creating a recorder obj

        recorder = new ATUTestRecorder(videoFolder,videoFile,false);
//Dynamic browser choice and instantiating the browser
  String browser = Utils.getData(Constants.xmlBrowser);
if ( browser.equals(Constants.xmlBrowserName))
        {
      System.setProperty(Constants.instantChromeDriver, Constants.pathChromeDriver);
      driver = new ChromeDriver();
}

else  {
      System.setProperty(Constants.instantiEDriver,Constants.pathiEDriver);
      driver = new InternetExplorerDriver();

        }
//Url reading from the xml file and continue implementing Reports

        driver.navigate().to(Utils.getData(Constants.xmlUrl));
        driver.manage().window().maximize();
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(Constants.htmlReporterPath);
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo(Constants.Console, Constants.environmentType);
        extent.setSystemInfo(Constants.userT, Constants.userName);
        test.log(Status.INFO, Constants.log1);

    }

//reports update and browser closing
    @AfterClass
    public static void finale() throws ATUTestRecorderException {
        System.out.println(Constants.finitoLaComedia);
        test.log(Status.INFO,Constants.videoInfo+videoFolder+videoFile+Constants.videoInfo1);
        recorder.stop();
        extent.flush();
        driver.quit();

    }
    @Test
    //calling registration functions + taking a screenshot
    public void test01_registration() throws IOException, ATUTestRecorderException {
        recorder.start();
        RegistrationScreen.assertErrors(driver);
        RegistrationScreen.signInButton1(driver);
        RegistrationScreen.signInButton2(driver);
        RegistrationScreen.signInFn(driver);
        RegistrationScreen.signInEmail(driver);
        RegistrationScreen.signInPass(driver);
        RegistrationScreen.signInValPass(driver);
        RegistrationScreen.pressRadioB(driver);
        RegistrationScreen.submitReg(driver);
        test.pass(Constants.reg, MediaEntityBuilder.createScreenCaptureFromPath(Utils.takeScreenShot(driver,Constants.screenshotLocation + currentTime)).build());
    }

    @Test
    //calling product screening  functions + taking a screenshot
    public void test02_screening() throws InterruptedException, IOException {

        HomeScreen.productPrice(driver);
        HomeScreen.productArea(driver);
        HomeScreen.productCategory(driver);
        HomeScreen.productSearch(driver);
        test.pass(Constants.screening, MediaEntityBuilder.createScreenCaptureFromPath(Utils.takeScreenShot(driver,Constants.screenshotLocation + currentTime)).build());

    }

    @Test
    //Extra - scrolling down and adding a screenshot
    public void test03_scrollScreenshot() throws IOException {
        ChooseGift.scrollBottom(driver);
        test.pass(Constants.bottom, MediaEntityBuilder.createScreenCaptureFromPath(Utils.takeScreenShot(driver,Constants.screenshotLocation + currentTime)).build());

    }
    @Test
    //calling the gift choice function that also asks the sum of the money to put in the gift card + taking a screenshot
    public void test04_chooseGift() throws IOException, InterruptedException {
        ChooseGift.giftChoice(driver);
        ChooseGift.assertUrl(driver);
        ChooseGift.sendAmount(driver);
        ChooseGift.submitProduct(driver);
        test.pass(Constants.gift, MediaEntityBuilder.createScreenCaptureFromPath(Utils.takeScreenShot(driver,Constants.screenshotLocation + currentTime)).build());

    }


    @Test
    //calling the function that gets all the data information of the sender and recipient and saves the order + taking a screenshot
    public void test05_recieverInfo() throws  IOException {
        SendInfo.assertColor(driver);
        SendInfo.radioButtonPress1(driver);
        SendInfo.senderInfo(driver);
        SendInfo.recipientInfo(driver);
        SendInfo.uploadPic(driver);
        SendInfo.eventChoice(driver);
        SendInfo.blessYou(driver);
        SendInfo.assertWindowData(driver);
        SendInfo.radioButtonPress2(driver);
        SendInfo.smsChoice(driver);
        SendInfo.senderPhone(driver);
        SendInfo.recipientPhone(driver);
        SendInfo.saveData(driver);
        test.pass(Constants.recieverInfo, MediaEntityBuilder.createScreenCaptureFromPath(Utils.takeScreenShot(driver,Constants.screenshotLocation + currentTime)).build());

    }




}













