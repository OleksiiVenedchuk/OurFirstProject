package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class HotlineFinanceTab extends BasePage {
    public HotlineFinanceTab(WebDriver driver) {
        super(driver);
    }
    public WebElement OsagoButton(){ return waitElementToBeVisible("//*[@alt='osago']");}



}
