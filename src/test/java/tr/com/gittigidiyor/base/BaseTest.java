package tr.com.gittigidiyor.base;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest
{
    public static WebDriver driver;
    public static WebDriverWait wait;
    //public static JavascriptExecutor js = (JavascriptExecutor) driver;


    @BeforeClass
    public static void setup()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--ignore-certifcate-errors");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--disable-preconnect");                     //tells the browser to make a proactive HTTP connection to a domain the browser has not yet determined needs to be made.
        chromeOptions.addArguments("'--dns-prefetch-disable'");                 //resolve domain names before resources get requested
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.setAcceptInsecureCerts(true);


        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.gittigidiyor.com/");
    }

    @AfterClass
    public static void tearDown()
    {
        //driver.close();                                             //Close Tab
        //driver.quit();                                              //Close Chrome
    }
}
