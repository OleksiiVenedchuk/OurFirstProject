package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {

    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
    }
    public void openWebsite(String url){driver.get(url);}

        public void sleep(int seconds){
           try{
               Thread.sleep(seconds *1000L);
           }catch (InterruptedException e){
               e.printStackTrace();
           }
        }




    @AfterMethod
    public void closeIt(){
        driver.quit();
    }


}
