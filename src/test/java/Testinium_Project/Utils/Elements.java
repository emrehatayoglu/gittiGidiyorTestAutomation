package Testinium_Project.Utils;

import org.openqa.selenium.By;

public class Elements {
    public static By loginMenuButton = By.xpath("//div[@class='gekhq4-3 icMLoL']");
    public static By loginMenuLoginButton = By.xpath("//header[@id='main-header']/div[3]/div/div/div/div[3]/div/div/div[2]/div/div/div/a/span");
    public static By searchTextBox = By.name("k");
    public static By searchButton = By.xpath("//button[@class='qjixn8-0 sc-1bydi5r-0 hKfdXF']");
    public static By loginControlText = By.xpath("(//div[@class='gekhq4-4 hwMdSM'])[1]//span");

    public static By emailTextBox = By.id("L-UserNameField");
    public static By passwordTextBox = By.id("L-PasswordField");
    public static By loginButton = By.id("gg-login-enter");

    public static By secondPage =By.linkText("2");
    public static By product = By.xpath("//div[@class='product-info-con clearfix ']");

    public static By addToBasketButton = By.id("add-to-basket");
    public static By productDetailPagePrice = By.xpath("//div[@id='sp-price-lowPrice']");
    public static By basketButton=By.xpath("//a[@class='dIB']");
    public static By goBasketPageButton=By.xpath("//div[@class='gg-d-12 pl0']//a[@class='gg-ui-btn-default padding-none']");

    public static By basketPagePrice = By.xpath("//p[@class='new-price']");
    public static By selectDropDown = By.xpath("//div[@class='gg-input gg-input-select ']//select");
    public static By controlBasketAmount = By.xpath("(//div[@class='gg-d-16 detail-text'])[1]");
    public static By deleteProductionButton = By.xpath("(//i[@class='gg-icon gg-icon-bin-medium'])[1]");
    public static By emptyBasketPageMessage = By.xpath("//div[@class='gg-w-22 gg-d-22 gg-t-21 gg-m-18']//h2");
}
