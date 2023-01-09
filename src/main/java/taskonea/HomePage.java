package taskonea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class='master-wrapper-main']//a[@href='/computers']")
    private WebElement computerSection;
    @FindBy(xpath = "//div[@class='master-wrapper-main']//a[@href='/desktops']")
    private WebElement desktopsSection;
    @FindBy(xpath = "//option[@value='https://demowebshop.tricentis.com/desktops?pagesize=4']")
    private WebElement setDisplay4PerPage;
    @FindBy(xpath = "//select[@id='products-orderby']/option[contains(text(),'High to Low')]")
    private WebElement highToLow;
    @FindBy(xpath = "//div[@data-productid='74']//input[@value='Add to cart'][@class='button-2 product-box-add-to-cart-button']")
    private WebElement buttonAddToCart;
    @FindBy(xpath = "//input[@id='add-to-cart-button-74']")
    private WebElement buttonAddToCartOnDetailSection;
    @FindBy(xpath = "//a[@href='/cart'][@class='ico-cart'][contains(text(),'Shopping cart')]")
    private WebElement shoppingCart;
    @FindBy(xpath = "//span[@class='cart-qty']")
    private WebElement numberItem;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickComputerSection() {
        computerSection.click();
    }

    public void clickDesktopsSection() {
        desktopsSection.click();
    }

    public void choose4PerPage(){
        setDisplay4PerPage.click();
    }

    public void choosehighToLow(){
        highToLow.click();
    }

    public void clickButtonAddToCart(){
        buttonAddToCart.click();
    }

    public void clickButtonAddToCartDetailSection(){
        buttonAddToCartOnDetailSection.click();
    }

    public void goToShoppingCart(){
        shoppingCart.click();
    }

    public String getTextOfAmountProductsInCart(){
        return numberItem.getText();
    }

}
