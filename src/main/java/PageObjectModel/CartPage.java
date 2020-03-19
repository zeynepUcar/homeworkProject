package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage  extends AbstractClass{
    WebDriver driver;
    public CartPage(){


        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


    //TODO Total price text
    @FindBy(xpath = "//span[@id='total_price']")
    private WebElement priceText;


    //TODO Remove Button

    @FindBy(xpath = "//a[@title='Delete']")
    private WebElement removeTitle;


    //TODO Alert Message "Your shopping cart is empty)

    @FindBy(xpath = "//p[text()='Your shopping cart is empty.']")
    private WebElement alertMessage;



    //TODO if total price equals to $0.00, we didn't add anything to the cart. This shouldn't happen.

    public void verifyToCart(){
        if (priceText.getText().equalsIgnoreCase("$0.00")){
            Assert.fail();
            System.out.println("No products have been added to your cart.");


        }else
            System.out.println("\n" +
                    "The product has been successfully added to the Cart." + "\n"+ "Total Price: " + priceText.getText());

    }

    public void clickRemoveTitle(){

        clickOnFunctionalities(removeTitle);
    }


    private void verifytoDelete(){



    }





}