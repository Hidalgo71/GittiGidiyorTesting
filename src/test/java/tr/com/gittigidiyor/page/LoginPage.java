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

    public void openLoginPage() throws InterruptedException
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]"))).build().perform();
        Thread.sleep(1000);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.fui1s9-0.sc-6h1fgd-0.bYFmcS")));
        WebElement cursorMove = driver.findElement(By.cssSelector("a.qjixn8-0.sc-1bydi5r-0.lghPw"));
        //div[@class='gekhq4-6 hnYHyk']
        actions.moveToElement(driver.findElement(By.cssSelector("a.qjixn8-0.sc-1bydi5r-0.lghPw"))).click().build().perform();
        //qjixn8-0 sc-1bydi5r-0 lghPw
    }

    public void login()
    {
        driver.findElement(By.xpath("//input[@id='L-UserNameField']")).sendKeys("mytesting871@gmail.com");
        driver.findElement(By.xpath("//input[@id='L-PasswordField']")).sendKeys("my.test871");
        driver.findElement(By.xpath("//input[@id='gg-login-enter']")).click();
    }
}
