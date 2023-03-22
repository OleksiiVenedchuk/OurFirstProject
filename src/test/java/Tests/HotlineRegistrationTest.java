package Tests;

import PageObjects.HotlineRegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotlineRegistrationTest extends TestInit{
   @Test
    public void Registration() throws InterruptedException {
       HotlineRegistrationPage hotlineRegistrationPage = new HotlineRegistrationPage(driver);
       hotlineRegistrationPage.goToRegistrationPage();
       hotlineRegistrationPage.emailField().sendKeys("OleksiiVenedchuk@gmail.com");
       hotlineRegistrationPage.nameField().sendKeys("OleksiiVenedchuk");
       hotlineRegistrationPage.passwordField().sendKeys("666666666");
       hotlineRegistrationPage.recaptchaButton().click();

      Assert.assertTrue(hotlineRegistrationPage.recaptchaButton().isDisplayed());
   }



}
