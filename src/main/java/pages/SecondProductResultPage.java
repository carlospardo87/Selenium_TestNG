package pages;

import configurations.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SecondProductResultPage extends BasePage {

    public WebDriver driver;

    private final By ITEM_LIST = By.xpath("//img[@class='s-image']");


    public SecondProductResultPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    /* Select one item by position defined*/
    public void selectItemByPosition(int position){
        sleepSecond(5);

        List<WebElement> elemList = driver.findElements(ITEM_LIST);

        if (position > elemList.size()){
            throw new RuntimeException("Element doesn't exist in the list");
        }
            for (int i=0; i<elemList.size();i++){
            if (i == position) {
                elemList.get(i).click();
                break;
            }
        }
    }
}
