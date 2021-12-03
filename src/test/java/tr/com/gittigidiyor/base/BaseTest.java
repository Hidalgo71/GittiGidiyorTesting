package tr.com.gittigidiyor.base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseTest
{
    public static WebDriver driver;
    public static WebDriverWait wait;
    //public static JavascriptExecutor js = (JavascriptExecutor) driver;


    @BeforeAll
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
        //chromeOptions.addArguments("profile.default_content_setting_values.cookies", 1);
        //chromeOptions.addArguments("profile.cookie_controls_mode", (String) 1);
        chromeOptions.setAcceptInsecureCerts(true);


        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.gittigidiyor.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @AfterAll
    public static void tearDown()
    {
        //driver.close();                                             //Close Tab
        //driver.quit();                                              //Close Chrome
    }
}
