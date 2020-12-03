package configurations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 70);
    }


    /* General Method to perform actions */

    public void sleepSecond(int timeSeconds){
        try {
            Thread.sleep(timeSeconds * 1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }



    public void enterText(By locator, String text){
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    public void clickElement(By locator){
        try {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    } catch (Exception e) {
            System.out.println(e.getMessage());
    }
    }


    public String getText(By locator){
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            return driver.findElement(locator).getText();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }


    public Boolean isDisplayed(By locator){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        }catch (Exception e){
            return false;
        }
    }


}
