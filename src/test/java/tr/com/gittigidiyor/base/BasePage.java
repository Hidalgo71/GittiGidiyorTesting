package tr.com.gittigidiyor.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Logger;

public class BasePage
{
    public WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor javascriptExecutor;
    protected final static Logger logger = Logger.getLogger(String.valueOf(BasePage.class));

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }
}
