package PageObjects;

import Tests.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageNote extends BasePage{

    public PageNote(WebDriver driver) {super(driver);}

    public void clickOnLinkSortGoods(){waitElementToBeVisible("//*[@class='select__field']").click();}

    public void sortGoods() {
        WebElement selectElement = driver.findElement(By.xpath("//select"));
        Select select = new Select(selectElement);
        for (int i = 0; i < 7; i++) {
            select.selectByIndex(i);
            TestInit testInit = new TestInit();
            testInit.sleep(1);
            selectElement.click();
            testInit.sleep(1);
        }

    }
}
