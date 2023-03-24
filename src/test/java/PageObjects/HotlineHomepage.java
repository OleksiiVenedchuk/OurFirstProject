package PageObjects;

import Tests.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

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
            testInit.sleep(5);
        }
    }

}
