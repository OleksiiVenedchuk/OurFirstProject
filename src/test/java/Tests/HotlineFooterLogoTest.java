package Tests;

import PageObjects.HotlineHomepage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotlineFooterLogoTest extends TestInit{
    @Test
    public void BottomLogo (){
        HotlineHomepage hotlineHomepage = new HotlineHomepage(driver);
        hotlineHomepage.goToHotline();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,2955)", "");
        Assert.assertTrue(hotlineHomepage.footerLogo().isDisplayed());

    }

}
