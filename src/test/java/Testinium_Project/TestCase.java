package Testinium_Project;

import Testinium_Project.Base.BaseTest;
import Testinium_Project.Base.BasePage;
import Testinium_Project.Page.*;
import Testinium_Project.Utils.Constants;
import org.junit.Test;

public class TestCase extends BaseTest {

    @Test
    public void gittigidiyorTest() throws InterruptedException {
        HomePage homePage=new HomePage(driver);
        LoginPage loginPage=new LoginPage(driver);
        ProductListPage productListPage = new ProductListPage(driver);
        ProductDetailPage productDetailPage = new ProductDetailPage(driver);
        BasketPage basketPage = new BasketPage(driver);

        homePage.homePageControl();
        homePage.toLoginPage();
        loginPage.login(Constants.email,Constants.password);
        homePage.loginControl();
        homePage.search("bilgisayar");
        productListPage.toSecondPage();
        productListPage.productListPageControl();
        productListPage.selectRandomProduct();
        productDetailPage.storeProductPrice();
        productDetailPage.addToBasket();
        productDetailPage.toBasketPage();
        basketPage.compareProductPrice();
        basketPage.increaseAmount();
        basketPage.basketPageControl();
        basketPage.deleteBasketProduct();
        basketPage.isBasketPageEmpty();
    }
}
