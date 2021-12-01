package tr.com.gittigidiyor.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        actions.moveToElement(driver.findElement(By.xpath("//div[@class='gekhq4-6 hnYHyk']"))).build().perform();
        WebElement cursorMove = driver.findElement(By.xpath("//div[@class='gekhq4-6 hnYHyk']"));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sc-12t95ss-3 fDarBX']//a[@type='button']")));
        actions.moveToElement(driver.findElement(By.cssSelector(".qjixn8-0.sc-1bydi5r-0.lghPw"))).click().build().perform();
        //qjixn8-0 sc-1bydi5r-0 lghPw
    }
}
