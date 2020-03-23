package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class AddToCartPage extends AbstractClass {


    WebDriver driver;

    public AddToCartPage() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


//TODO Clothes Category List

    @FindAll({
            @FindBy(xpath = "//a[@class='sf-with-ul']")})
    private List<WebElement> clothesBar;


    //TODO Women Button

    @FindBy(xpath = "//a[text()='Women']")
    private WebElement womenButton;


    //TODO List Icon

    @FindBy(xpath = "//i[@class='icon-th-list']")
    private WebElement listIcon;

    //TODO Clothes List

    @FindAll({
            @FindBy(xpath = "//img[@class='replace-2x img-responsive']")
    })
    private List<WebElement> clothesList;


    //TODO List of Cart Buttons

    @FindAll({
            @FindBy(xpath = "//span[text()='Add to cart']")
    })
    private List<WebElement> listOfCartButtons;


    //TODO Proceed To Checkout Button

    @FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
    private WebElement proceedToCheckoutButton;


    //TODO Total price text
    @FindBy(xpath = "//span[@id='total_price']")
    private WebElement priceText;


    //TODO Remove Button

    @FindBy(xpath = "//a[@title='Delete']")
    private WebElement removeTitle;


    //TODO Alert Message "Your shopping cart is empty)

    @FindBy(xpath = "//p[text()='Your shopping cart is empty.']")
    private WebElement alertMessage;


    public void clickToListIcon() {

        clickOnFunctionalities(listIcon);
    }


    public void clickRandomCartButton() {
        randomMethodForClothes(listOfCartButtons);
    }


    public void navigateOver() throws InterruptedException {
        Actions ac = new Actions(driver);

        for (int i = 0; i < clothesBar.size(); i++) {
            ac.moveToElement(clothesBar.get(i)).perform();
            Thread.sleep(1000);
        }
    }

    public void clickWomenButton() {
        clickOnFunctionalities(womenButton);

    }

    public void clickToCheckoutButton() {

        clickOnFunctionalities(proceedToCheckoutButton);
    }
    //TODO if total price equals to $0.00, we didn't add anything to the cart. This shouldn't happen.

    public void verifyToCart() {
        if (priceText.getText().equalsIgnoreCase("$0.00")) {
            Assert.fail();
            System.out.println("No products have been added to your cart.");


        } else
            System.out.println("\n" +
                    "The product has been successfully added to the Cart." + "\n" + "Total Price: " + priceText.getText());

    }

    public void clickRemoveTitle() {

        clickOnFunctionalities(removeTitle);
    }


    private void verifytoDelete() {


    }
}
