package Tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.HotlineHomepage;

public class HotlineCityChangingTest extends TestInit{



    @Test
    public void CityChanging(){
        HotlineHomepage hotlineHomepage = new HotlineHomepage();
        hotlineHomepage.goToHotline();
        hotlineHomepage.clickOnCityButton();
        hotlineHomepage.clickOnPoltavaButton();
        Assert.assertTrue(hotlineHomepage.poltavaButton().isDisplayed());


    }



}
