package tr.com.gittigidiyor.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tr.com.gittigidiyor.base.BasePage;

import java.util.Arrays;
import java.util.List;

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

    public void addFav()
    {
        /*String[] favItems = new String[] {"LG Q7", "Samsung Odyssey", "Asus Rog", "Asus X515"};
        List<WebElement> favList = driver.findElements(By.xpath("//li[@class='recom-wide-content recom-content active']//div[@class='recom-cover-container clearfix product-item-box']//a[@class='recommendation-gravity-target']//span[@class='recommendation-title']"));
        for (int i = 0; i < favList.size(); i++)
        {
            String[] itemName = favList.get(i).getText().split(" ");
            String trueItemName = itemName[0].trim();
            List<String> favArr = Arrays.asList(favItems);
            if
        }
        */
        String[] favIndex = new String[] {};
        List<WebElement> favList = driver.findElements(By.xpath("//li[@class='recom-wide-content recom-content active']//div[@class='recom-cover-container clearfix product-item-box']//a[@class='recommendation-gravity-target']//span[@class='recommendation-title']"));
        for (int j = 0; j < favList.size(); j++)
        {
            String[] itemName = favList.get(j).getText().split(" ");
            String trueItemName = itemName[0].trim();

        }
    }
}
