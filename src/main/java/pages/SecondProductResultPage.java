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
        System.out.println("Number of elements:" +elemList.size());

        for (int i=0; i<elemList.size();i++){
            if (i == position) {
                System.out.println("Click item: "+i+" -- " + elemList.get(i).getAttribute("alt"));
                elemList.get(i).click();
                break;
            }
        }
    }
}
