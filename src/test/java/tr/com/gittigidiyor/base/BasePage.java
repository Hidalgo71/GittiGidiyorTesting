package tr.com.gittigidiyor.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Logger;

public class BasePage
{
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static JavascriptExecutor js ;
    protected final static Logger logger = Logger.getLogger(String.valueOf(BasePage.class));

    public BasePage(WebDriver driver)
    {
        BasePage.driver = driver;
        js = (JavascriptExecutor) BasePage.driver;
        wait = new WebDriverWait(BasePage.driver, Duration.ofSeconds(10));
    }
}
