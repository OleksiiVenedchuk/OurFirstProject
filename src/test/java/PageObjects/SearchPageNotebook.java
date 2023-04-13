package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPageNotebook extends BasePage{

    public SearchPageNotebook (WebDriver driver) {super(driver);}

    public void clickOnSearchLinkNote(){waitElementToBeVisible("//*[@class = 'search-sidebar-catalogs__name link link--black']").click();}

//    public WebElement resultOfSearching() {return waitElementToBeVisible("//div[@class = 'search__title']");}
}
