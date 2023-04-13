package Tests;

import PageObjects.HotlineHomepage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class PopularForYouBlockTest extends TestInit{
    @Test
    public void Popular(){
        HotlineHomepage hotlineHomepage = new HotlineHomepage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        hotlineHomepage.goToHotline();
        js.executeScript("arguments[0].scrollIntoView();", hotlineHomepage.popularForYouBlockOfButtons());
        hotlineHomepage.ClickForYouBlockOfButtons();


    }
}
