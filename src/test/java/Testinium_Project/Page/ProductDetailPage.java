package Testinium_Project.Page;

import Testinium_Project.Base.BasePage;
import Testinium_Project.Utils.Elements;
import Testinium_Project.Utils.TempVariable;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
    public ProductDetailPage(WebDriver webDriver) {
        super(webDriver);
    }

    private static Logger logger = Logger.getLogger(ProductDetailPage.class);


    public void addToBasket()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        wait(1);
        click(Elements.addToBasketButton);
    }

    public void storeProductPrice()
    {
        TempVariable.productDetailPage_productPrice=getElementText(Elements.productDetailPagePrice);
    }

    public void toBasketPage()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-500)");
        wait(3);

        mouseHoverAction(Elements.basketButton);
        wait(3);
        click(Elements.goBasketPageButton);
    }
}
