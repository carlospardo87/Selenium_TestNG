package pages;

import configurations.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public WebDriver driver;

    private final By SEARCH_PRODUCT = By.id("twotabsearchtextbox");
    private final By BUTTON_SEARCH = By.className("nav-search-submit");


    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void searchProduct(String prod) {
        enterText(SEARCH_PRODUCT, prod);
    }

    public void clickOnSearch() {
        clickElement(BUTTON_SEARCH);
    }
}
