package Tests;

import PageObjects.HotlineFinanceTab;
import PageObjects.HotlineHomepage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class HotlineFinanceTabTest extends TestInit {
    @Test
    public void BrowserTabs (){
        HotlineHomepage hotlineHomepage = new HotlineHomepage(driver);
        hotlineHomepage.goToHotline();
        hotlineHomepage.clickOnCatalogButton();
        hotlineHomepage.clickOnSomeButtons();
        hotlineHomepage.ClickOnHotlineFinanceButton();

        ArrayList tabs2 = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window((String) tabs2.get(2));

        HotlineFinanceTab hotlineFinanceTab = new HotlineFinanceTab(driver);
        Assert.assertTrue(hotlineFinanceTab.OsagoButton().isDisplayed());

        sleep(5);

        driver.switchTo().window((String) tabs2.get(1));
        Assert.assertTrue(hotlineFinanceTab.OsagoButton().isDisplayed());




    }
}
