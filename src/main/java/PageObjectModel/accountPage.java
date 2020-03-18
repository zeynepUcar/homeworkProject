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

    @FindBy(xpath = "//div[@class='header_user_info']")
    private WebElement signInTab;

    @FindBy(xpath = "//input[@id='email_create']")
    private WebElement emailBox;
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    private WebElement creatingButton;

    public void clickOnSignInTab() {
        waitUntilVisibility(signInTab);
        clickOnFunctionalities(signInTab);
    }

    public void typeTheEmail(String email) {
        String myEmail = readProperties.getData("email");
        sendKeysFunction(emailBox, myEmail);
    }

    public void clickOnCreateButton() {
        clickOnFunctionalities(creatingButton);
    }
}
