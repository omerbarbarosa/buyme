import org.openqa.selenium.By;



public class Constants {

    //BeforeClass Constants
    public static final String instantChromeDriver = "webdriver.chrome.driver";
    public static final String instantiEDriver = "webdriver.ie.driver";
    public static final  String pathChromeDriver = "C:\\Users\\Omer\\Desktop\\קורס אוטומציה\\chromedriver\\chromedriver.exe";
    public static final  String pathiEDriver = "C:\\Users\\Omer\\Desktop\\קורס אוטומציה\\IEDriverServer.exe";
    public static final String xmlUrl = "URL";
    public static final String xmlPath = "C:\\Users\\Omer\\Desktop\\BuyMeTester.xml" ;
    public static final String xmlBrowser = "BROWSER";
    public static final String xmlBrowserName = "Chrome";
    public static final String reg = "Registration";
    public static final String after = "After class";
    public static final String screening = "Product_Screening";
    public static final String gift = "GiftChoice";
    public static final String bottom = "scrollDown";
    public static final String recieverInfo = "RecieverInfo";
    public static final String screenshotLocation = "C:\\Users\\Omer\\Desktop\\קורס אוטומציה\\" ;
    public static final String testName = "BuyMeTester" ;
    public static final String testDescription = "Buyme Website Sanity test" ;
    public static final String htmlReporterPath = "C:\\Users\\Omer\\Desktop\\קורס אוטומציה\\extent.html" ;
    public static final String environmentType = "Production" ;
    public static final String Console = "Environment" ;
    public static final String userT = "Tester" ;
    public static final String userName = "Omer" ;
    public static final String log1 = "Before class" ;
    public static final String fileType = ".png" ;
    public static final String finitoLaComedia  = "\n\033[31;1mIT'S FINALLY DONE!!!!\033[0m\n" ;
    public static final String date  = "dd_MM_yy_HH_mm_ss" ;
    public static final String testVideoPath  = "C:\\Users\\Omer\\Desktop\\קורס אוטומציה\\" ;
    public static final String videoName  = "BuyMeTester-" ;
    public static final String videoInfo  = "<a href='";
    public static final String videoInfo1  = ".mov" +
            "'><span class = 'label info'> Download Test Video</span></a> " ;


    // RegistrationScreen Constants
    public static final By signIn= By.className("seperator-link");
    public static final By signOn= By.className("text-btn");
public static final String entryError = "כל המתנות מחכות לך! אבל קודם צריך מייל וסיסמה";
public static final String pass = "Omerbaron1";
public static final String valPass = "Omerbaron1";
public static final String name = "Omer";
public static final String email = "Omerbaron77@gmail.com";
public static final By radioB = By.className("fa");
public static final By submit = By.className("orange");
public static final By subscribe = By.className("ember-text-field");
public static final By entry = By.className("seperator-link");
public static final By entryButton = By.xpath("//*[@type=\"submit\"]");
public static final By getError = By.className("parsley-required");
public static final By closeButton = By.xpath("//span[@alt=\"סגירה\"]");





    // HomeScreen Constants

public static final By dropClass = By.className("chosen-single");
public static final By dropList = By.className("active-result");
public static final By submitScreening = By.className("ui-btn");



    // ChooseGift Constants
    public static final String urlGift = "https://buyme.co.il/search?budget=1&category=22&region=13";
    public static final String scrollGift = "window.scrollTo(0, document.body.scrollHeight)";
    public static final By chooseProd = By.className("label");
    public static final By prodClass = By.className("label");
    public static final By amountButton = By.xpath("//*[@data-parsley-type=\"number\"]");
    public static final String amount = "150";
    public static final By submitProd = By.xpath("//*[@type=\"submit\"]");
    public static final By elementVisible = By.xpath("//*[@data-parsley-type=\"number\"]");



    // SendInfo Constants

public static final By elementVisible1 = By.className("circle");
public static final By infoList = By.xpath("//input[@maxlength='25']");
public static final String recipientName = "דניאל ";
public static final String senderName = "עומר ברון";
public static final By blessingPath = By.tagName("textarea");
public static final String blessingMessage = "היה נחמד, היה מגניב, עכשיו סיימתי והגיע הזמן לנוח";
public static final String picPath = "C:\\Users\\Omer\\Desktop\\New folder\\download.PNG";
public static final By uploadPic = By.name("fileUpload");
public static final By radioButton2 = By.className("send-now");
public static final By sms = By.className("icon-sms");
public static final By sender = By.xpath("//input[@data-parsley-mobile=\"mobile\"]");
public static final String senderPhones = "0544284225";
public static final String recipientPhones = "0506998673";
public static final By save = By.className("btn-save");
public static final By uploadElement = By.className("media-thumbnail");
public static final By chooseEvent = By.xpath("//li[@data-option-array-index=\"1\"]");
public static final By enterEvent = By.className("chosen-single");
public static final String assertColor = "rgba(247, 179, 54, 1)";
public static final By cOfTheWind = By.className("mobile-db");
public static final By windowInfo = By.className("name");
public static final By greetingTrim = By.className("cut-greeting");
public static final String propertyC = "color";

}
