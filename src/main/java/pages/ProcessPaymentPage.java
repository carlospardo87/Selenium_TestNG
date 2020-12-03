package pages;

import configurations.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProcessPaymentPage extends BasePage {

    public WebDriver driver;

    private final By BUTTON_PROCESS = By.id("hlb-ptc-btn-native");
    private final By CART_ITEM = By.id("nav-cart-count");



    public ProcessPaymentPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String getTextButtonProcess(){
        return getText(BUTTON_PROCESS);
    }

    public String getCartItems(){
        return getText(CART_ITEM);
    }
}
