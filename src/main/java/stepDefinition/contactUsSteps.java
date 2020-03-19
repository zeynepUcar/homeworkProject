package stepDefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.contactPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;

public class contactUsSteps extends AbstractClass {
    contactPage cp = new contactPage();

    @Given("^Click on Contact Us Tab$")
    public void click_on_Contact_Us_Tab() throws Throwable {
        cp.clickOnContactUs();
    }

    @Given("^Select Subject Heading$")
    public void select_Subject_Heading() throws Throwable {
        cp.selectSubjectHeading();
        scrollDown();


    }

    @Given("^Select Order Reference$")
    public void select_Order_Reference() throws Throwable {
        Thread.sleep(5000);
        cp.selectOrderPreference();

    }

    @Given("^Select Product$")
    public void select_Product() throws Throwable {
        cp.selectOrderPreference();

    }

    @Given("^Type the \"([^\"]*)\"$")
    public void type_the(String myMessage) throws Throwable {
        cp.typeTheMessage(myMessage);

    }

    @Given("^Click on Send Button$")
    public void click_on_Send_Button() throws Throwable {
        cp.clickOnSendButton();

    }

    @Then("^Verify message has been successfully sent is displayed$")
    public void verify_message_has_been_successfully_sent_is_displayed() throws Throwable {
        cp.verifySentMessage();
        //
    }
}
