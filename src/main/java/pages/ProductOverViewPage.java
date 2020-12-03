package pages;

import configurations.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductOverViewPage extends BasePage {

    public WebDriver driver;

    private final By BUTTON_BUY = By.id("add-to-cart-button");


    public ProductOverViewPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickOnButtonBuy(){
        clickElement(BUTTON_BUY);
    }
}
