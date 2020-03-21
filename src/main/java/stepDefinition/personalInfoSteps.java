package stepDefinition;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import PageObjectModel.AbstractClass;
import PageObjectModel.personalInfoPage;

public class personalInfoSteps extends AbstractClass {

    personalInfoPage ip = new personalInfoPage();


    @Given("^Click on My Personal Information$")
    public void click_on_My_Personal_Information() throws Throwable {
        ip.clickOnMyPersonalInfoTab();
    }

    @Given("^Click on social title$")
    public void click_on_social_title() throws Throwable {
        ip.clickOnSocialTitle();

    }

    @Given("^type to\"([^\"]*)\"and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void type_to_and_and(String arg1, String arg2, String arg3) throws Throwable {

        ip.typeFirstName(arg1);

        ip.typeLastName(arg2);

        ip.typeNewEmail(arg3);
        waitMethod();

        scrollDown();

    }

    @Given("^type \"([^\"]*)\"and \"([^\"]*)\"$")
    public void type_and(String password, String newPassWord) throws Throwable {

        ip.typeOldPassWord(password);
        waitMethod();

        ip.inputnewPassWord(newPassWord);


    }

    @Given("^Click on Save button$")
    public void click_on_Save_button() throws Throwable {
        waitMethod();

        ip.clickOnSaveButton();
    }
}
