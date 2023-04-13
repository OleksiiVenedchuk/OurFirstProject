package Tests;
import PageObjects.HotlineHomepage;
import org.testng.annotations.Test;
public class CheckingPopularGoods extends TestInit{
    @Test
    public void PopularGoods(){
        HotlineHomepage hotlineHomepage = new HotlineHomepage(driver);
        hotlineHomepage.goToHotline();
        hotlineHomepage.clickAllPopularGoods();


    }
}
