package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotlineSearchPage extends BasePage{
    public HotlineSearchPage(WebDriver driver) {
        super(driver);
    }
    public WebElement resultOfSearching(){return waitElementToBeVisible("//div[@class = 'search__title']");}
}
