package tr.com.gittigidiyor.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import tr.com.gittigidiyor.base.BasePage;
import tr.com.gittigidiyor.base.BaseTest;
import tr.com.gittigidiyor.page.LoginPage;

public class CoreTest extends BaseTest
{

    LoginPage loginPage;
    @Test
    public void login()
    {
        loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
    }
}
