package PageObjectModel;

import Utilities.Driver;
import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class accountPage extends AbstractClass {

    WebDriver driver;

    public accountPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    private WebElement signInTab;

    public void clickOnSignInTab(){
        waitUntilVisibility(signInTab);
        clickOnFunctionalities(signInTab);
    }

}
