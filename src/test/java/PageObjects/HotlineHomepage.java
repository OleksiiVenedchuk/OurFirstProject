package PageObjects;

import Tests.TestInit;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Wait;

import java.util.List;

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

    public WebElement searchField(){return driver.findElement(By.xpath("//*[@type = 'text' and @autocomplete='off']"));}
    public void clickOnSearchButton(){waitElementToBeVisible("//*[@class = 'search__btn flex middle-xs center-xs']").click();}
    public void clickOnCatalogButton(){waitElementToBeVisible("//*[@class='header-catalog-button']").click();}
    public void clickOnSomeButtons(){waitElementsToBeVisible("//*[@class = 'menu-main__item']").forEach(WebElement::isSelected);}
    public void showAllElements() {
        List<WebElement> elements = waitElementsToBeVisible("//*[@class = 'menu-main__item']");
        for (WebElement element : elements) {
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
            TestInit testInit = new TestInit();
            testInit.sleep(1);
        }
    }
    public void changeFirstLanguage() {
        waitElementToBeVisible("//div[contains(@class, 'lang-button')]").click();
        waitElementToBeVisible("//*[contains(@class, 'lang-item') and  contains(text(),'RU')]").click();}

    public void changeSecondLanguage () {
        waitElementToBeVisible("//div[contains(@class, 'lang-button')]").click();
        waitElementToBeVisible("//*[contains(@class, 'lang-item') and  contains(text(),'UA')]").click();}

    public void switchFirstLanguages() {waitElementToBeVisible("//div[@data-eventlabel = 'ru']").click();}

    public void switchSecondLanguages() {waitElementToBeVisible("//div[@data-eventlabel = 'uk']").click();}

//    public WebElement changeLanguage(){return driver.findElement((By.xpath("//div[contains(@class, 'lang-button')]")));}

    public WebElement resultOfLanguageChange(){return waitElementToBeVisible("//div[@class = 'location__city']");}

//    public void ClickOnHotlineFinanceButton(){waitElementsToBeVisible("//*[@href='//hotline.finance/ua?utm_source=hotline.ua&utm_medium=cpc&utm_campaign=catalogonmainpage']").forEach(WebElement::click);}

    public void ClickOnHotlineFinanceButton(){waitElementToBeVisible("//*[@href='//hotline.finance/ua?utm_source=hotline.ua&utm_medium=cpc&utm_campaign=catalogonmainpage']").click();}


    public void clickOnLinkComp(){waitElementToBeVisible("//*[contains(@class, 'categories') and contains(@data-eventlabel,'ютери, Мережі')]").click();}

    public void clickAllPopularGoods() {
        List<WebElement> elements = waitElementsToBeVisible("//*[@class = 'tabs-list__item']");
        for (int i = 0; i <=3; i++) {
            elements.get(i).click();

    public void clickOnLinkSortGoods(){waitElementToBeVisible("//*[@class='select__field']").click();}

    public WebElement footerLogo(){ return waitElementToBeVisible("//*[@class='footer__logo']");}
    public WebElement black_gifts(){ return waitElementToBeVisible("//*[@class='services-section__link link--black gifts']");}

    public WebElement headerLogo(){ return waitElementToBeVisible("//div[contains(@class,'logo')]");}
    public WebElement popularForYouBlockOfButtons(){return waitElementToBeVisible("//section[contains(@class,'section popular-for-you-section content-block')]//div[@class='tabs-list__wrapper']");}
    public void ClickForYouBlockOfButtons() {
        List<WebElement> elements = waitElementsToBeVisible("//button[contains(@data-tracking-id, 'index-6')]");
        for (WebElement element : elements) {
            Actions action = new Actions(driver);
            action.click(element).perform();
//            action.doubleClick(element).perform();
            TestInit testInit = new TestInit();
            testInit.sleep(2);
        }
    }




}
