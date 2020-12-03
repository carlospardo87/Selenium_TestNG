package pages;

import configurations.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstProductResultPage extends BasePage {


    public WebDriver driver;

    private final By BUTTON_SECOND_PAGE = By.xpath("//a[.='2']");



    public FirstProductResultPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    public void gotoSecondPage() {
        clickElement(BUTTON_SECOND_PAGE);
    }
}
