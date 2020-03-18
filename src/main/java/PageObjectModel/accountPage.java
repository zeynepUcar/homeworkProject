package PageObjectModel;

import Utilities.Driver;
import Utilities.readProperties;
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

<<<<<<< HEAD
    @FindBy(xpath = "//a[@class='login']")
    private WebElement signInTab;

=======


    @FindBy(css = "a[class='login']")
    private WebElement signInTab;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailBox;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement passwordBox;
    @FindBy(xpath = "//*[@id='SubmitLogin']")
    private WebElement submitButton;

>>>>>>> origin/master
    public void clickOnSignInTab() {

        clickOnFunctionalities(signInTab);
    }

<<<<<<< HEAD
=======
    public void typeTheEmail(String email) {
        email = readProperties.getData("email");

        sendKeysFunction(emailBox, email);
    }

    public void typeThePassword(String pswd) {
       pswd = readProperties.getData("password");
        sendKeysFunction(passwordBox, pswd);
    }

    public void clickOnSignInButton() {
        clickOnFunctionalities(submitButton);
    }
>>>>>>> origin/master
}
