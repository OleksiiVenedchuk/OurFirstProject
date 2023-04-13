package Tests;

import PageObjects.HotlineHomepage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotlineHeaderLogoTest extends TestInit{
    @Test
    public void HeaderLogo(){
        HotlineHomepage hotlineHomepage = new HotlineHomepage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        hotlineHomepage.goToHotline();
        js.executeScript("arguments[0].scrollIntoView();", hotlineHomepage.black_gifts());
        hotlineHomepage.black_gifts().click();
        Assert.assertTrue(hotlineHomepage.headerLogo().isDisplayed());
    }
}
