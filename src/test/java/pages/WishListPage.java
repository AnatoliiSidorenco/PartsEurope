package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wait.Wait;

public class WishListPage extends BasePage {
    public WishListPage(WebDriver driver) {
        super(driver);
    }

    Wait wait;
    @FindBy(css = "[class='wish-list']")
    private WebElement wishList;

    @FindBy(css = "[class='wish-list-content']")
    private WebElement productNameElement;


    public void clickOnWishList() {
        wait = new Wait(driver);
        wait.forVisibility(wishList);
        wishList.click();
    }

    public String getProductNameFromWishlist() {
        wait = new Wait(driver);
        wait.forVisibility(productNameElement);
        return productNameElement.getText();
    }

}
