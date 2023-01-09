package tasksonea.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest extends BaseTest {

    private static final String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART = "(1)";

    @Test
    public void chooseOneExpensiveItemAndCheckItemIsInShoppingCart() {
        getHomePage().clickComputerSection();
        getHomePage().clickDesktopsSection();
        getHomePage().choose4PerPage();
        getHomePage().choosehighToLow();
        getHomePage().clickButtonAddToCart();
        getHomePage().clickButtonAddToCartDetailSection();
        getHomePage().goToShoppingCart();
        Assert.assertEquals(getHomePage().getTextOfAmountProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART);
    }
}
