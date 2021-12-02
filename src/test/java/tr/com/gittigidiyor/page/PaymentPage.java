package tr.com.gittigidiyor.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tr.com.gittigidiyor.base.BasePage;

public class PaymentPage extends BasePage
{
    public PaymentPage(WebDriver driver)
    {
        super(driver);
    }

    public void addressErrors()
    {
        driver.findElement(By.xpath("//button[contains(text(),'Kaydet')]")).click();
    }

    public void editBasket()
    {
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        driver.findElement(By.xpath("//a[contains(text(),'Sepeti Düzenle')]")).click();
    }
}
