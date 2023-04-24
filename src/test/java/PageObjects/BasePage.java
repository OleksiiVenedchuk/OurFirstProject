package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    public WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver=driver;
    }
    public WebElement findElement(String locator){
        return driver.findElement(By.xpath(locator));}

    int basicTime = 20;

    public WebElement waitElementToBeVisible (String locator){
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(basicTime));
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    public List<WebElement> waitElementsToBeVisible (String locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(basicTime));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
        return driver.findElements(By.xpath(locator));
    }

    public void openWebsite(String url){driver.get(url);}







}
