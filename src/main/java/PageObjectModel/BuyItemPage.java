package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BuyItemPage  extends  AbstractClass{
    WebDriver driver;
    public BuyItemPage(){

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
    }) private List <WebElement>clothesList;





    //TODO List of Cart Buttons

    @FindAll({
            @FindBy(xpath = "//span[text()='Add to cart']")
    }) private List <WebElement> listOfCartButtons;


    //TODO Proceed To Checkout Button

    @FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
    private WebElement proceedToCheckoutButton;


    public void clickToListIcon(){

        clickOnFunctionalities(listIcon);
    }


    public void clickRandomCartButton(){
randomMethodForClothes(listOfCartButtons);
}


public void navigateOver() throws InterruptedException {
        Actions ac = new Actions(driver);

        for (int i = 0; i < clothesBar.size(); i++) {
            ac.moveToElement(clothesBar.get(i)).perform();
            Thread.sleep(1000);
        }
    }

    public void clickWomenButton(){
        clickOnFunctionalities(womenButton);

    }

    public void clickToCheckoutButton(){

        clickOnFunctionalities(proceedToCheckoutButton);
    }
}
