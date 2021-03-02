package Testinium_Project.Page;

import Testinium_Project.Base.BasePage;
import Testinium_Project.Utils.Elements;
import Testinium_Project.Utils.TempVariable;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage {
    public BasketPage(WebDriver webDriver) {
        super(webDriver);
    }

    private static Logger logger = Logger.getLogger(BasketPage.class);


    public void compareProductPrice()
    {
        wait(5);
        System.out.println(TempVariable.productDetailPage_productPrice);
        System.out.println(Elements.basketPagePrice);

        if (TempVariable.productDetailPage_productPrice.equals(Elements.basketPagePrice))
        {
            logger.info("Fiyatlar esit.");
        }
        else
        {
            logger.error("Fiyatlar esit degil.");
        }
    }

    public void increaseAmount()
    {
        select(Elements.selectDropDown,"2");
        wait(3);
    }

    public void basketPageControl()
    {
        String productAmount = getElementText(Elements.controlBasketAmount);

        if (productAmount.equals("Ürün Toplamı (2 Adet)"))
        {
            logger.info("Sepette 2 adet urun var.");
        }
        else
        {
            logger.error("Sepette 2 adet urun yok.");
        }
    }

    public void deleteBasketProduct()
    {
        click(Elements.deleteProductionButton);
        wait(3);
    }

    public void isBasketPageEmpty()
    {
        String exceptedEmptyBasketPageMessage = getElementText(Elements.emptyBasketPageMessage);
        System.out.println(exceptedEmptyBasketPageMessage);

        if (exceptedEmptyBasketPageMessage.equals("Sepetinizde ürün bulunmamaktadır."))
        {
            logger.info("Sepetiniz bosaltildi.");
        }
        else
        {
            logger.error("Sepetiniz bosaltilamadi.");
        }
    }
}
