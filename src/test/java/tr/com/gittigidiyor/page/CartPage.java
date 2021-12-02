package tr.com.gittigidiyor.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import tr.com.gittigidiyor.base.BasePage;

public class CartPage extends BasePage
{
    public CartPage(WebDriver driver)
    {
        super(driver);
    }
    public void increaseItemNumber() throws InterruptedException
    {
        //js.executeScript("window.scrollTo(0,0)");

        WebElement staticDDL = driver.findElement(By.xpath("//select[@class='amount']"));
        Select staticList = new Select(staticDDL);
        staticList.selectByVisibleText("2");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    public void addSecond()
    {

    }
}
