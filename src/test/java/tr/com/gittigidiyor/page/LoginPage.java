package tr.com.gittigidiyor.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import tr.com.gittigidiyor.base.BasePage;

public class LoginPage extends BasePage
{

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    public void openLoginPage()
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("div[title='Giriş Yap']"))).build().perform();
        WebElement cursorMove = driver.findElement(By.xpath("div[title='Giriş Yap']"));
        actions.moveToElement(driver.findElement(By.cssSelector("div[title='Giriş Yap']"))).click().build().perform();
    }
}
