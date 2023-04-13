package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageComp extends BasePage{

    public PageComp (WebDriver driver) {super(driver);}

    public void clickOnLinkNote(){waitElementToBeVisible("//div[contains(text(), 'Ноутбуки')]").click();}
}
