package Testinium_Project.Base;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    public WebDriver driver;
    private static Logger logger = Logger.getLogger(BaseTest.class);

    @Before
    public void setup()
    {
        PropertyConfigurator.configure("log4j.properties");
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://www.gittigidiyor.com/");
        logger.info("-----Test Basladi-----");
    }

    @After
    public void quit()
    {
        if(driver != null){
            driver.quit();
        }
    }
}
