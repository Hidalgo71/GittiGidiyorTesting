package tr.com.gittigidiyor.test;

import org.junit.Test;
import tr.com.gittigidiyor.base.BaseTest;
import tr.com.gittigidiyor.page.*;

public class CoreTest extends BaseTest
{

    LoginPage loginPage;
    SearchScrollPage searchScroll;
    BagSearchAddPage bagSearchAdd;
    RandomAddPage addRandom;
    CartPage cartPage;
    PaymentPage paymentPage;
    LogoutPage logoutPage;

    @Test
    public void loginMethod() throws InterruptedException
    {
        loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.login();
    }

   @Test
   public void searchScrollMethod()
   {
       searchScroll = new SearchScrollPage(driver);
       searchScroll.searchScroll();
   }

    @Test
    public void addRandomMethod()
    {
        addRandom = new RandomAddPage(driver);
        addRandom.addRandom();
    }

    @Test
    public void bagSearchMethod() throws InterruptedException
    {
        bagSearchAdd = new BagSearchAddPage(driver);
        bagSearchAdd.bagSearch();
        bagSearchAdd.bagAdd();
    }

   @Test
    public void cartPageMethod() throws InterruptedException
   {
        cartPage = new CartPage(driver);
        cartPage.increaseItemNumber();
    }

    @Test
    public void paymentAddressMethod()
    {
        paymentPage.addressErrors();
        paymentPage.editBasket();
        paymentPage.addFav();
    }
    @Test
    public void logoutMethode()
    {
        logoutPage.newTab();
        logoutPage.logout();
    }
}
