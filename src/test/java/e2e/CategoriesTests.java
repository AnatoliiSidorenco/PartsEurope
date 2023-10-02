package e2e;

import org.junit.Test;
import pages.CategoriesPage;
import pages.StartPage;
import pages.WishListPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CategoriesTests extends BaseTest {
    StartPage startPage;
    CategoriesPage categories;
    WishListPage wishListPage;

    @Test
    public void checkQuantityOfItemsInCategoryToolsAndChemicals() {
        startPage = new StartPage(app.driver);
        startPage.waitForLoadingMainLogo();
        startPage.clickOnCategories();

        categories = new CategoriesPage(app.driver);
        categories.clickOnToolsAndChemicals();

        assertEquals("Quantity of Items in category Tools & Chemicals is different",
                5, categories.getItemsQuantityOfToolsAndChemicals());
    }

    @Test
    public void successAddingProductInWishList() {
        startPage = new StartPage(app.driver);
        startPage.waitForLoadingMainLogo();
        startPage.clickOnCategories();

        categories = new CategoriesPage(app.driver);
        categories.clickOnToolsAndChemicals();
        categories.clickOnHardwareAndAccessoriesSubCategory();
        categories.clickOnProductViseJaws();
        categories.clickOnAddToWishList();

        assertEquals("Text of Notification  is not the same", categories.getTextFromNotification(),
                "Item has been successfully added to Wish list");

        wishListPage = new WishListPage(app.driver);
        wishListPage.clickOnWishList();
        pause(1000);

        assertTrue("Vise Jaws product was not added to wishlist",
                wishListPage.getProductNameFromWishlist().contains("VISE JAWS ALUMINUM"));

    }
}
