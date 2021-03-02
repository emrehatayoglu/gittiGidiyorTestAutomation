package Testinium_Project.Page;

import Testinium_Project.Base.BasePage;
import Testinium_Project.Utils.Elements;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    private static Logger logger = Logger.getLogger(LoginPage.class);

    public void login(String email,String password)
    {
        write(Elements.emailTextBox,email);
        write(Elements.passwordTextBox,password);
        click(Elements.loginButton);
        //wait(5);
    }
}
