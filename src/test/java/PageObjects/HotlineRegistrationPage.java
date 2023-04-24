package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HotlineRegistrationPage extends BasePage {
    public HotlineRegistrationPage(WebDriver driver) {
        super(driver);
    }
    public void goToRegistrationPage(){openWebsite("https://hotline.ua/register/");}

//    public WebElement emailField(){return driver.findElement((By.xpath("//*[@class='field m_b-sm']")));}

    public WebElement emailField() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("//*[@class='field m_b-sm']"));
        Thread.sleep(2000); // задержка в 1 секунд
        return button;
    }

//    public WebElement nameField(){return driver.findElement(By.xpath("//*[@name='name']"));}

    public WebElement nameField() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("//*[@name='name']"));
        Thread.sleep(2000); // задержка в 1 секунд
        return button;
    }

//    public WebElement passwordField(){return driver.findElement(By.xpath("//*[@id='passw1']"));}

    public WebElement passwordField() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("//*[@id='passw1']"));
        Thread.sleep(2000); // задержка в 2 секунд
        return button;
    }


    public WebElement recaptchaButton() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]"));
        Thread.sleep(3000); // задержка в 3 секунд
        return button;
    }




}
