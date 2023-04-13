package Tests;

import PageObjects.HotlineHomepage;
import PageObjects.PageComp;
import PageObjects.PageNote;
import PageObjects.SearchPageNotebook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class SortGoods extends TestInit{

    @Test
    public void SortGoods() {
        HotlineHomepage hotlineHomepage = new HotlineHomepage(driver);
        hotlineHomepage.goToHotline();
        hotlineHomepage.clickOnLinkComp();
        PageComp pageComp = new PageComp(driver);
        pageComp.clickOnLinkNote();
        PageNote pageNote = new PageNote(driver);
        pageNote.clickOnLinkSortGoods();
        sleep(1);
        pageNote.sortGoods();
    }

    @Test
    public void SearchNote(){
        HotlineHomepage hotlineHomepage = new HotlineHomepage(driver);
        hotlineHomepage.goToHotline();
        hotlineHomepage.searchField().sendKeys("Ноутбук");
        hotlineHomepage.clickOnSearchButton();
        SearchPageNotebook searchPageNotebook = new SearchPageNotebook(driver);
        searchPageNotebook.clickOnSearchLinkNote();
        PageNote pageNote = new PageNote(driver);
        pageNote.clickOnLinkSortGoods();
        sleep(1);
        pageNote.sortGoods();
//        Assert.assertEquals(hotlineSearchPage.resultOfSearching().getText(), "За запитом «Навушники TWS JBL Wave 200TWS Black (JBLW200TWSBLK)» знайдено 1 товар");
    }

}
