package tr.com.gittigidiyor.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tr.com.gittigidiyor.base.BasePage;

import java.util.List;
import java.util.Random;

public class RandomAddPage extends BasePage
{
    public RandomAddPage(WebDriver driver)
    {
        super(driver);
    }

    public void addRandom()
    {
        //div.ndodpt-1.bgCibU.sc-1n49x8z-13.ceCTui
        Random rand = new Random();
        for(int j = 0; j < 3; j++)
        {
            List<WebElement> randItem = driver.findElements(By.cssSelector("div.ndodpt-1.bgCibU.sc-1n49x8z-13.ceCTui"));
            randItem.get(rand.nextInt(randItem.size())).click();
        }
    }
}
