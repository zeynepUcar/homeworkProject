package stepDefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.addressPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class addressSteps extends AbstractClass {

    WebDriver driver;

    addressPage address = new addressPage();

    @Given("^Click on My Addresses Button$")
    public void click_on_My_Addresses_Button() throws Throwable {

        address.clickOnMyAddressTab();
        scrollDown();

    }

    @Given("^Click on Add a new address Button$")
    public void click_on_Add_a_new_address_Button() throws Throwable {
        address.clickOnAddNewAddress();
        scrollDown();
    }

    @And("^Type to \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void typeToAndAndAndAnd(String arg0, String arg1, String arg2, String arg3, String arg4) throws Throwable {
        address.typeOnAddress(arg0);
        address.typeOnCity(arg1);
        address.typeOnPostCode(arg2);
        address.typeOnMobileNumber(arg3);
        address.typeSecondTitle(arg4);
        address.selectAstate();

    }


    @Given("^Click on Save button$")
    public void click_on_Save_button() throws Throwable {

        address.clickOnSaveButton();
    }

}
