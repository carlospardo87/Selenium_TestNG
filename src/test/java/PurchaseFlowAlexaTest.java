import configurations.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;

public class PurchaseFlowAlexaTest extends BaseTest {

    private HomePage homePage;
    private FirstProductResultPage firstProductResultPage;
    private SecondProductResultPage secondProductResultPage;
    private ProductOverViewPage productOverViewPage;
    private ProcessPaymentPage processPaymentPage;



    @Test(description = "Purchase Flow Alexa in Amazon")
    public void PurchaseAlexaTest() {

        homePage = new HomePage(driver);
        firstProductResultPage = new FirstProductResultPage(driver);
        secondProductResultPage = new SecondProductResultPage(driver);
        productOverViewPage = new ProductOverViewPage(driver);
        processPaymentPage = new ProcessPaymentPage(driver);


        print("Given a user navigates to www.amazon.com");
        driver.get("https://www.amazon.com");

        print("And search for Alexa");
        homePage.searchProduct("Alexa");

        print("And click on button search");
        homePage.clickOnSearch();

        print("And navigate to the second page");
        firstProductResultPage.gotoSecondPage();

        print("And select the third item");
        secondProductResultPage.selectItemByPosition(2);

        print("And clicks on button Add to Cart");
        productOverViewPage.clickOnButtonBuy();

        print("Then assert that the item would be available for purchase");
        Boolean buttonCheckoutStatus = processPaymentPage.getButtonCheckoutStatus();
        Boolean buttonCartStatus = processPaymentPage.getButtonCartStatus();
        String expectedCartItem = processPaymentPage.getCartItems();

        SoftAssert softly = new SoftAssert();
        softly.assertEquals(expectedCartItem,"1", "Cart item number is not equal to expected");
        softly.assertTrue(buttonCheckoutStatus,"Checkout button is not clickable");
        softly.assertTrue(buttonCartStatus,"Cart button is not clickable");
        softly.assertAll();

    }
}
