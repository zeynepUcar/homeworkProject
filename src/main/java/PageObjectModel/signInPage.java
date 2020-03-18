package PageObjectModel;

import Utilities.Driver;
import Utilities.readProperties;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class signInPage extends AbstractClass {


    WebDriver driver;

    public signInPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    //TODO Email ""
    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailBox;


    //TODO Password ""


    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement Mypassword;


    //TODO SignIn Button""


    @FindBy(xpath = "//button[@id='SubmitLogin']")
    private WebElement signInButton;



    public void typeTheEmail(String email) {
        String myEmail = readProperties.getData("email");
        sendKeysFunction(emailBox, myEmail);
    }

    public void typeThePassword(String password) {

        String myPass = readProperties.getData("password");
        sendKeysFunction(Mypassword, myPass);
    }


    public void clickSignInButton() {


        clickOnFunctionalities(signInButton);
    }




}


