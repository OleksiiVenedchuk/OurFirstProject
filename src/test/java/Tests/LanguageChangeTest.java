package Tests;

import PageObjects.HotlineHomepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LanguageChangeTest extends TestInit{

    @Test
    public void testLanguageChange () {
        HotlineHomepage hotlineHomepage = new HotlineHomepage(driver);
        hotlineHomepage.goToHotline();
        hotlineHomepage.changeFirstLanguage();
        Assert.assertTrue(hotlineHomepage.resultOfLanguageChange().getText().contains("Бровары"));
        hotlineHomepage.changeSecondLanguage();
        Assert.assertTrue(hotlineHomepage.resultOfLanguageChange().getText().contains("Бровари"));
        hotlineHomepage.switchFirstLanguages();
        Assert.assertTrue(hotlineHomepage.resultOfLanguageChange().getText().contains("Бровары"));
        hotlineHomepage.switchSecondLanguages();
        Assert.assertTrue(hotlineHomepage.resultOfLanguageChange().getText().contains("Бровари"));

    }
}
