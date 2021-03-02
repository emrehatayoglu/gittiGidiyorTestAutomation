package Testinium_Project.Base;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.bind.Element;
import java.util.List;
import java.util.Random;

public class BasePage {
    private static Logger logger = Logger.getLogger(BasePage.class);

    public WebDriver driver;
    public BasePage(WebDriver webDriver){
        this.driver=webDriver;}

    public void click(By by)
    {
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));

        try {
            WebElement element =driver.findElement(by);
            element.click();
            logger.info(by + " by li elemente tiklandi.");

        }catch (Exception e){
            logger.error(by+ " by li elemente tiklanamadi.");
        }
    }

    public void write (By by, String word)
    {
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));

        try {
            WebElement element =driver.findElement(by);
            element.sendKeys(word);
            logger.info(by + "li elemente " + word + " degeri yazildi.");

        }catch (Exception e){
            logger.error(by+ " li elemente " + word +" degeri yazilamadi.");
        }
    }


    public void wait (int seconds)
    {
        try {
            Thread.sleep(seconds*1000);
            logger.info("Verilen " + seconds +" saniye süre beklendi.");

        }catch (Exception e){
            logger.error("Verilen " + seconds +" saniye süre beklenmedi.");
        }
    }

    public void getTitle()
    {
        try {
            String title = driver.getTitle();
            System.out.println(title);
            logger.info("Sayfa basligi alindi.");
        }catch (Exception e){
              logger.error("Sayfa basligi alinamadi");
        }
    }

    public void mouseHoverAction(By by)
    {
        try {
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(by);
        actions.moveToElement(target).perform();
        logger.info("Mouse " +by+ " li elementin üstüne getirildi.");
    }catch (Exception e){
        logger.error("Mouse " +by+ " li elementin üstüne getirilemedi.");
    }

    }

    public List<WebElement> getElementList(By by){
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        List<WebElement> elementList=driver.findElements(by);
        return elementList;
    }

    public int getRandomNumber(int limit)
    {
        Random random = new Random();
        int randomNumber=random.nextInt(limit);
        return randomNumber;
    }

    public String getElementText(By by){
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        String elementText=driver.findElement(by).getText();
        return elementText;
    }

    public void select(By by,String option)
    {
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        try {
            Select select = new Select(driver.findElement(by));
            select.selectByVisibleText(option);
            select.selectByValue(option);
            logger.info("Seçilen " +by+ " li elemente tiklandi.");
        }catch (Exception e)
        {
            logger.error("Seçilen " +by+ " li elemente tiklanamadi.");
        }

    }
}
