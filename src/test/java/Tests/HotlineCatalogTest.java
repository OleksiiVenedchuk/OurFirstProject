package Tests;

import PageObjects.HotlineHomepage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v110.domstorage.model.Item;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HotlineCatalogTest extends TestInit{

    @Test
    public void Catalog(){
        HotlineHomepage hotlineHomepage = new HotlineHomepage(driver);
        hotlineHomepage.goToHotline();
        hotlineHomepage.clickOnCatalogButton();
        hotlineHomepage.clickOnSomeButtons();
        hotlineHomepage.showAllElements();


    }

}
