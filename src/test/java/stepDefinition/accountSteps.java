package stepDefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.accountPage;
import Utilities.Driver;
import Utilities.readProperties;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
        scrollDown();

    }

    @Given("^type to \"([^\"]*)\" and \"([^\"]*)\"$")
    public void type_to_and(String arg1, String arg2) throws Throwable {
      ap.typeTheEmail(arg1);
      ap.typeThePassword(arg2);
    }

    @Given("^Click on Sign In Button$")
    public void click_on_Sign_In_Button() throws Throwable {
        ap.clickOnSignInButton();
    }


}
