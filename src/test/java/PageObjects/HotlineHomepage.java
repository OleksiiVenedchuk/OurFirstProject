package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HotlineHomepage extends BasePage {
    public HotlineHomepage(WebDriver driver) {
        super(driver);
    }
    public void goToHotline(){openWebsite("https://hotline.ua/");}

    public void clickOnCityButton(){waitElementToBeVisible("//div[@title]").click();}
//    public void cityFindField(){waitElementToBeVisible("//*[@placeholder=\"Почніть вводити назву\"]").sendKeys("Житомир\n");}
//    public void highlightingCityElements(){waitElementsToBeVisible("//*[@aria-activedescendant=\"autosuggest__results-item--0\"]");}
    public void clickOnPoltavaButton(){waitElementToBeVisible("//span[contains(text(),'Полтава')]").click();}

    public WebElement poltavaButton(){return driver.findElement((By.xpath("//*[contains(text(),'Полтава')]")));}



    public void changeSecondLanguage () {
            waitElementToBeVisible("//div[contains(@class, 'lang-button')]").click();
            waitElementToBeVisible("//*[contains(@class, 'lang-item') and  contains(text(),'UA')]").click();}

    public void switchFirstLanguages() {waitElementToBeVisible("//div[@data-eventlabel = 'ru']").click();}

    public void switchSecondLanguages() {waitElementToBeVisible("//div[@data-eventlabel = 'uk']").click();}

//    public WebElement changeLanguage(){return driver.findElement((By.xpath("//div[contains(@class, 'lang-button')]")));}

    public WebElement resultOfLanguageChange(){return waitElementToBeVisible("//div[@class = 'location__city']");}




}
