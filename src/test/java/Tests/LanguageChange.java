package Tests;

import PageObjects.HotlineHomepage;
import org.testng.annotations.Test;

public class LanguageChange extends TestInit{

    @Test
    public void testLanguageChange () {
        HotlineHomepage hotlineHomepage = new HotlineHomepage();
        hotlineHomepage.goToHotline();
        hotlineHomepage.anotherLanguage();
        hotlineHomepage.clickOnLanguage();
        hotlineHomepage.chooseRu();}
}
