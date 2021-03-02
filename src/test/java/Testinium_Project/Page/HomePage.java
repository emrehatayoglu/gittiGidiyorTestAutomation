package Testinium_Project.Page;

import Testinium_Project.Base.BasePage;
import Testinium_Project.Utils.Elements;
import Testinium_Project.Utils.TempVariable;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    private static Logger logger = Logger.getLogger(HomePage.class);


    public void homePageControl()
    {
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(TempVariable.homePageTitle))
        {
            logger.info("Anasayfaya basariyla girildi.");
        }
        else
        {
            logger.error("Anasayfaya girilemedi.");
        }
    }
    public void toLoginPage()
    {
        getTitle();
        mouseHoverAction(Elements.loginMenuButton);
        //wait(2);
        click(Elements.loginMenuLoginButton);

    }

    public void search(String searchText)
    {
        write(Elements.searchTextBox,searchText);
        click(Elements.searchButton);
    }

    public void loginControl()
    {
        TempVariable.homePage_loginPageControl=getElementText(Elements.loginControlText);

        if (TempVariable.homePage_loginPageControl.equals("lakina97"))
        {
            logger.info("Basariyla giris yapildi.");
        }
        else
        {
            logger.error("Giris yapilamadi.");
        }
    }

}
