package tr.com.gittigidiyor.test;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import tr.com.gittigidiyor.base.BaseTest;
import tr.com.gittigidiyor.page.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
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
    @Order(1)
    public void loginMethod() throws InterruptedException
    {
        loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.login();
    }

   @Test
   @Order(2)
   public void searchScrollMethod()
   {
       searchScroll = new SearchScrollPage(driver);
       searchScroll.searchScroll();
   }

    @Test
    @Order(3)
    public void addRandomMethod()
    {
        addRandom = new RandomAddPage(driver);
        addRandom.addRandom();
    }

    @Test
    @Order(4)
    public void bagSearchMethod() throws InterruptedException
    {
        bagSearchAdd = new BagSearchAddPage(driver);
        bagSearchAdd.bagSearch();
        bagSearchAdd.bagAdd();
    }

   @Test
   @Order(5)
    public void cartPageMethod() throws InterruptedException
   {
        cartPage = new CartPage(driver);
        cartPage.increaseItemNumber();
    }

    @Test
    @Order(6)
    public void paymentAddressMethod()
    {
        paymentPage.addressErrors();
        paymentPage.editBasket();
        paymentPage.addFav();
    }
    @Test
    @Order(7)
    public void logoutMethode()
    {
        logoutPage.newTab();
        logoutPage.logout();
    }
}
