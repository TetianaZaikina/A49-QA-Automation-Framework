import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

//public class BaseTest {

 //   @BeforeSuite
 //   static void setupClass() {
 //       WebDriverManager.chromedriver().setup();
//}
 public class BaseTest {
     public WebDriver driver = null;
     //    public String url = "https://qa.koel.app/";
     String url;
     public String url;

     @BeforeSuite
     static void setupClass() {
             @BeforeMethod
             @Parameters({"BaseURL"})
             public void launchBrowser(String BaseURL) {
                 public void launchBrowser(String baseURL) {
                     //Added ChromeOptions argument below to fix websocket error
                     ChromeOptions options = new ChromeOptions();
                     options.addArguments("--remote-allow-origins=*");
                     options.addArguments("--disable-notifications");
                     options.addArguments("--start-maximized");
                     url = BaseURL;
                     url=baseURL;
                     driver = new ChromeDriver(options);
                     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                 }
                 public void clickSubmit() {
                     WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
                     submit.click();
                 }
                 @DataProvider(name ="IncorrectLoginData")
                 public static Object[][] getDataFromDataProviders() {
                     return new Object[][]{
                             {"notExisting@email.com", "notExistingPassword"},
                             {"demo@class.com", ""},
                             {"", ""}
                     };
                 }
                 @DataProvider(name = "csvData")
                 public Object[][] csvDataRead() throws Exception {
                     String path ="src/test/resources/cred.csv";
                     ExtUtils ext = new CSVUtils(path,false);
                     return ext.parseData();
                 }
             }
