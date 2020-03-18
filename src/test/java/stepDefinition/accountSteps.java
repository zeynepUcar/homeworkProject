package stepDefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.accountPage;
import Utilities.Driver;
import Utilities.readProperties;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class accountSteps extends AbstractClass {
    WebDriver driver;
    accountPage ap = new accountPage();

    @Given("^Go to the website$")
    public void go_to_the_website() throws Throwable {
        driver = Driver.getDriver();
        driver.manage().window().maximize();

        driver.get(readProperties.getData("URL"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Given("^Click on Sign In Tab$")
    public void click_on_Sign_In_Tab() throws Throwable {
        ap.clickOnSignInTab();

    }

    @Given("^Type the email into the box$")
    public void type_the_email_into_the_box(String email) throws Throwable {
        ap.typeTheEmail(email);

    }

    @Given("^Click on Create Account Button$")
    public void click_on_Create_Account_Button() throws Throwable {
        ap.clickOnCreateButton();
    }


}
