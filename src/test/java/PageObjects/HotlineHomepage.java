package PageObjects;

import PageObjects.HotlineHomepage;
import Tests.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotlineHomepage extends TestInit {
    @Test
    public void hotlineLanguageChangeTest () {
        HotlineHomepage hotlineHomepage = new HotlineHomepage(driver);
        metaHomePage.goToTranslatorPage();
        sleep(3);
        metaHomePage.changeFirstLanguage();
        metaHomePage.changeSecondLanguage();
        metaHomePage.switchLanguages();
        metaHomePage.putTextInField("some text");
        metaHomePage.changeKindOfText();
        sleep(2);
        metaHomePage.openCloseKeyboard();
        metaHomePage.translateBtn();}
}
