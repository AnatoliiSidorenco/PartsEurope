package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wait.Wait;

public class StartPage extends BasePage {
    public StartPage(WebDriver driver) {
        super(driver);
    }

    Wait wait;

    @FindBy(xpath = "(//img)[8]")
    private WebElement mainLogoElement;

    @FindBy(css = "[class='categories']")
    private WebElement categoriesElement;


    @FindBy(css = "[class='mdi mdi-menu-down d-none d-sm-none d-md-inline-block']")
    private WebElement languageMenuElement;

    @FindBy(xpath = "(//img[@class='flag lozad'])[1]")
    private WebElement germanyLanguageElement;

    public void waitForLoadingMainLogo() {
        wait = new Wait(driver);
        wait.forVisibility(mainLogoElement);
    }

    public boolean mainLogoIsDisplayed() {
        return mainLogoElement.isDisplayed();
    }

    public boolean getTextOfAtributeMainLogo() {
        String text = "Parts Europe Logo";
        String textAttribute = mainLogoElement.getAttribute("alt");
        return text.equals(textAttribute);
    }

    public void clickOnCategories() {
        wait = new Wait(driver);
        wait.forVisibility(categoriesElement);
        categoriesElement.click();
    }

    public void clickOnLanguageMenu() {
        wait = new Wait(driver);
        wait.forVisibility(languageMenuElement);
        languageMenuElement.click();
    }

    public void selectGermanyLanguage() {
        germanyLanguageElement.click();
    }

    public String getTitleNameOfCategories() {
        return categoriesElement.getText();
    }
}
