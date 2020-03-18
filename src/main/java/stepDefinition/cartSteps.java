package stepDefinition;
import PageObjectModel.AbstractClass;
import PageObjectModel.accountPage;
import PageObjectModel.signInPage;
import Utilities.Driver;
import Utilities.readProperties;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
public class cartSteps extends AbstractClass {

    WebDriver driver;
    accountPage ap = new accountPage();
    signInPage sp = new signInPage();



    @And("^type to \"([^\"]*)\" and \"([^\"]*)\"$")
    public void typeToAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sp.typeTheEmail(arg0);
        sp.typeThePassword(arg1);
    }


    @Given("^click to sign in button$")
    public void click_to_sign_in_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        scrollDown();
        Thread.sleep(1000);
        sp.clickSignInButton();
    }

}
