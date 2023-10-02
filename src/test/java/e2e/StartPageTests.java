package e2e;

import org.junit.Test;
import pages.StartPage;

import static org.junit.Assert.assertTrue;

public class StartPageTests extends BaseTest {
    StartPage startPage;

    @Test
    public void openStartPage() {
        startPage = new StartPage(app.driver);
        startPage.waitForLoadingMainLogo();
        assertTrue(startPage.mainLogoIsDisplayed());
        assertTrue(startPage.getTextOfAtributeMainLogo());
    }

    @Test
    public void changeMenuLanguage() {
        startPage = new StartPage(app.driver);
        startPage.waitForLoadingMainLogo();
        startPage.clickOnLanguageMenu();
        startPage.selectGermanyLanguage();
        pause(1000);
        assertTrue(startPage.getTitleNameOfCategories().contains("Kategorien"));
    }

}
