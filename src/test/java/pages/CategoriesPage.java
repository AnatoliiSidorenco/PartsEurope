package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wait.Wait;

import java.util.List;

public class CategoriesPage extends BasePage {
    public CategoriesPage(WebDriver driver) {
        super(driver);
    }

    Wait wait;

    @FindBy(css = "[class='tiles tiles-5']")
    private List<WebElement> toolsAndChemicalsElements;

    @FindBy(xpath = "(//a[@href='javascript:void(0)'])[13]")
    private WebElement toolsAndChemicalsCategoryElement;

    @FindBy(xpath = "(//*[@class='tile-links-wrapper'])[5]")
    private WebElement HardwareAndAccessoriesSubCategoryElement;

    @FindBy(xpath = "(//*[@class='product-1  '])[7]")
    private WebElement productViseJawsElement;

    @FindBy(xpath = "(//*[@class='btn btn-primary btn-icon'])[1]")
    private WebElement addToWishListElement;

    @FindBy(css = "[class='notification notification-success']")
    private WebElement successAddProductIntoWishList;

    public void clickOnToolsAndChemicals() {
        wait = new Wait(driver);
        wait.forVisibility(toolsAndChemicalsCategoryElement);
        toolsAndChemicalsCategoryElement.click();
    }

    public int getItemsQuantityOfToolsAndChemicals() {
        return toolsAndChemicalsElements.size();
    }

    public void clickOnHardwareAndAccessoriesSubCategory() {
        wait = new Wait(driver);
        wait.forVisibility(HardwareAndAccessoriesSubCategoryElement);
        HardwareAndAccessoriesSubCategoryElement.click();
    }

    public void clickOnProductViseJaws() {
        wait = new Wait(driver);
        wait.forVisibility(productViseJawsElement);
        productViseJawsElement.click();
    }

    public void clickOnAddToWishList() {
        wait = new Wait(driver);
        wait.forVisibility(addToWishListElement);
        addToWishListElement.click();
    }

    public String getTextFromNotification() {
        wait = new Wait(driver);
        wait.forVisibility(successAddProductIntoWishList);
        return successAddProductIntoWishList.getText();
    }
}
