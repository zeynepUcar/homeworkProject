package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import utilities.Driver;
import utilities.readProperties;

public class personalInfoPage extends AbstractClass {
    WebDriver driver;

    public personalInfoPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'My personal information')]")
    private WebElement personalInfoTab;
    public void clickOnMyPersonalInfoTab() {
        clickOnFunctionalities(personalInfoTab);
    }

    @FindBy(xpath = "//input[@id='id_gender2']")
    private WebElement socialTitleButton;

    public void clickOnSocialTitle() {
        clickOnFunctionalities(socialTitleButton);
    }


    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement inputFirstname;

    public void typeFirstName(String name) {
        name = readProperties.getData("name");
        inputFirstname.sendKeys(Keys.CONTROL,Keys.chord("a"));
        inputFirstname.sendKeys(Keys.BACK_SPACE);
        sendKeysFunction(inputFirstname, name);

    }

    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement inputLastName;

    public void typeLastName(String lastName) {
        lastName = readProperties.getData("lastName");
        inputLastName.sendKeys(Keys.CONTROL,Keys.chord("a"));
        inputLastName.sendKeys(Keys.BACK_SPACE);
        sendKeysFunction(inputLastName, lastName);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement inputEmail;

    public void typeNewEmail(String email) {
        email = readProperties.getData("email");
        inputEmail.sendKeys(Keys.CONTROL,Keys.chord("a"));
        inputEmail.sendKeys(Keys.BACK_SPACE);
        sendKeysFunction(inputEmail, email);

    }

    @FindBy(xpath = "//input[@id='old_passwd']")
    private WebElement oldPassword;

    public void typeOldPassWord(String password) {
        password = readProperties.getData(password);
        sendKeysFunction(oldPassword, password);
    }

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement inputNewPassWord;

    public void inputnewPassWord(String newPassWord) {
        newPassWord = readProperties.getData("newPassWord");

        sendKeysFunction(inputNewPassWord, newPassWord);
    }

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement SaveButton;

    public void clickOnSaveButton() {
        clickOnFunctionalities(SaveButton);
    }



    }



