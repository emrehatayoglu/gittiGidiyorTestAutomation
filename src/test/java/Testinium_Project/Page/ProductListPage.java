package Testinium_Project.Page;

import Testinium_Project.Base.BasePage;
import Testinium_Project.Utils.Elements;
import Testinium_Project.Utils.TempVariable;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductListPage extends BasePage {
    public ProductListPage(WebDriver webDriver) {
        super(webDriver);
    }

    private static Logger logger = Logger.getLogger(ProductListPage.class);


    public void toSecondPage()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        click(Elements.secondPage);

    }

   public void selectRandomProduct()
   {
       List<WebElement> productList=getElementList(Elements.product);
       int randomNumber=getRandomNumber(productList.size());
       productList.get(randomNumber).click();
       wait(5);
   }

   public void productListPageControl()
   {
       wait(5);
       String actualTitle = driver.getTitle();

       if (actualTitle.equals(TempVariable.productListPageTitle))
       {
           logger.info("Sayfa 2'ye basariyla girildi.");
       }else {
           logger.error("Sayda 2'ye gidilemedi.");
       }
   }

}
