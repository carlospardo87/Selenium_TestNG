package pages;

import configurations.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProcessPaymentPage extends BasePage {

    public WebDriver driver;

    private final By BUTTON_CHECKOUT = By.id("hlb-ptc-btn-native");
    private final By CART_ITEM = By.id("nav-cart-count");
    private final By BUTTON_CART = By.id("hlb-view-cart-announce");



    public ProcessPaymentPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String getCartItems(){
        return getText(CART_ITEM);
    }

    public Boolean getButtonCheckoutStatus() {
        return isDisplayed(BUTTON_CHECKOUT);
    }

    public Boolean getButtonCartStatus() {
        return isDisplayed(BUTTON_CART);
    }
}
