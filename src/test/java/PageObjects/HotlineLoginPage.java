package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotlineLoginPage extends BasePage{
    public HotlineLoginPage(WebDriver driver) {
        super(driver);
    }
    public void goToLoginPage(){openWebsite("https://hotline.ua/login/");}

    public WebElement emailOrNumberField(){return driver.findElement(By.xpath("//*[@class='field m_b-sm']"));}
    public WebElement passwordField(){return driver.findElement(By.xpath("//*[@class='field']"));}
    public void enterButtonClick(){waitElementToBeVisible("//*[@class='btn-graphite btn-cell']").click();}



}
