package PageObjectModel;

import Utilities.Driver;
import Utilities.readProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class addressPage extends AbstractClass {

    WebDriver driver;

    public addressPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//span[text()='My addresses']")
    private WebElement myAddressTab;

    public void clickOnMyAddressTab(){

        clickOnFunctionalities(myAddressTab);
    }


    @FindBy(xpath = "//span[text()='Add a new address']")
    private WebElement addNewAddress;

    public void clickOnAddNewAddress(){
        clickOnFunctionalities(addNewAddress);
    }

    @FindBy(css = "input[id='address1']")
    private WebElement typeAddress;

    @FindBy(css = "input[id='city']")
    private WebElement typeCity;

    @FindBy(css = "input[id='postcode']")
    private WebElement typePostCode;

    @FindBy(css = "input[id='phone_mobile']")
    private WebElement typeMobileNumber;

    @FindBy(css = "input[id='alias']")
    private WebElement typeSecondTitle;


    public void typeOnAddress(String address){
        address = readProperties.getData("address");
        sendKeysFunction(typeAddress, address);

    }

    public void typeOnCity(String city){
        city = readProperties.getData("city");
        sendKeysFunction(typeCity, city);
    }

    public void typeOnPostCode(String postCode){
        postCode = readProperties.getData("postcode");
        sendKeysFunction(typePostCode, postCode);

    }

    public void typeOnMobileNumber(String number){
        number = readProperties.getData("mobile");
        sendKeysFunction(typeMobileNumber, number);
    }

    public void typeSecondTitle(String title){

        title = readProperties.getData("title");
        sendKeysFunction(typeSecondTitle, title);

    }


    @FindBy(xpath = "//select[@name='id_state']")

    private WebElement listOfState;

    public void selectAstate(){

        selectInDropDown(listOfState);
    }


    @FindBy(xpath = "//span[contains(text(),'Save')]")
    private WebElement clickToSave;

    public void clickOnSaveButton(){

        clickOnFunctionalities(clickToSave);
    }

    @FindBy(xpath = "(//span[text()='Delete'])[2]")
    private WebElement deleteButton;

    public void clickOnDelete(){

        clickOnFunctionalities(deleteButton);

    }

}
