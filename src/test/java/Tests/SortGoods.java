package Tests;

import PageObjects.HotlineHomepage;
import org.testng.annotations.Test;
public class SortGoods extends TestInit{

    @Test
    public void SortGoods() {
        HotlineHomepage hotlineHomepage = new HotlineHomepage(driver);
        hotlineHomepage.goToHotline();
        hotlineHomepage.clickOnLinkComp();
        hotlineHomepage.clickOnLinkNote();
//        hotlineHomepage.clickOnLinkSortGoods();
        hotlineHomepage.sortGoods();
    }

//    public void Search(){
//        HotlineHomepage hotlineHomepage = new HotlineHomepage(driver);
//        hotlineHomepage.goToHotline();
//        hotlineHomepage.searchField().sendKeys("Навушники TWS JBL Wave 200TWS Black (JBLW200TWSBLK)");
//        hotlineHomepage.clickOnSearchButton();
//        HotlineSearchPage hotlineSearchPage = new HotlineSearchPage(driver);
//        Assert.assertEquals(hotlineSearchPage.resultOfSearching().getText(), "За запитом «Навушники TWS JBL Wave 200TWS Black (JBLW200TWSBLK)» знайдено 1 товар");
//    }

}
