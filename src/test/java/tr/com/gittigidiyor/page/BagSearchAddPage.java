package tr.com.gittigidiyor.page;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import tr.com.gittigidiyor.base.BasePage;

import java.util.List;

public class BagSearchAddPage extends BasePage
{
    public BagSearchAddPage(WebDriver driver)
    {
        super(driver);
    }
    public void bagSearch()
    {
        driver.navigate().back();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("çanta"  + Keys.ENTER);

    }

    public void bagAdd() throws InterruptedException
    {
        Actions actions = new Actions(driver);
        WebElement clickBag = driver.findElement(By.xpath("//h2[contains(text(),'Krinkıl Kumaş Bayan Omuz Çantası Smart Bags 1163 8')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", clickBag);
        actions.moveToElement(driver.findElement(By.cssSelector("body > div:nth-child(1) > main:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(4) > ul:nth-child(1) > li:nth-child(8) > article:nth-child(1) > div:nth-child(2) > a:nth-child(1) > div:nth-child(1) > div:nth-child(2)"))).click().build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='add-to-basket']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='header-cart-hidden-link']")).click();
        //driver.findElement(By.xpath("//span[@class='basket-title']")).click();
    }

}
