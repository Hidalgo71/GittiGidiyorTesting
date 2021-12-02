package tr.com.gittigidiyor.page;

import org.openqa.selenium.*;
import tr.com.gittigidiyor.base.BasePage;

import java.util.List;
import java.util.Random;

public class SearchScrollPage extends BasePage
{
    public SearchScrollPage(WebDriver driver)
    {
        super(driver);
    }

    public void searchScroll()
    {

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Asus"  + Keys.ENTER);
        //wait.until(ExpectedConditions.)
        //wait.until(driver => ((IJavaScriptExecutor)driver).ExecuteScript("return document.readyState").Equals("complete"));

        js.executeScript("window.scrollTo(0,4000)");
    }
}
