package Tests;

import PageObjects.HotlineLoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HotlineLoginTest extends TestInit{

   @Test(dataProvider = "testData")
   public void Login(String username, String password){
       HotlineLoginPage hotlineLoginPage = new HotlineLoginPage(driver);
       hotlineLoginPage.goToLoginPage();
       hotlineLoginPage.emailOrNumberField().sendKeys(username);
       hotlineLoginPage.passwordField().sendKeys(password);
       hotlineLoginPage.enterButtonClick();
    }
    @DataProvider(name = "testData")
    public Object[][] createData() {
        return new Object[][]{
                {"testuser1", "password1"},
                {"testuser2", "password2"},
                {"testuser3", "password3"}
        };
    }
}
