package tr.com.gittigidiyor.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import tr.com.gittigidiyor.base.BasePage;

public class LogoutPage extends BasePage
{
    public LogoutPage(WebDriver driver)
    {
        super(driver);
    }

    public void newTab()
    {
        String openTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        driver.findElement(By.linkText("https://www.gittigidiyor.com/")).sendKeys(openTab);
    }
    public void logout()
    {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//div[@class='gekhq4-5 hJhHqb']//div[@class='gekhq4-6 hnYHyk']"))).build().perform();
        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Çıkış')]"))).click();
    }
}
